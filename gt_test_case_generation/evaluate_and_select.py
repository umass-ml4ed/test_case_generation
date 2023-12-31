'''
For every problem, reads the test cases generated and evaluates them
'''

import os 
import sys
import random
from tqdm import tqdm
from collections import defaultdict
# import generate_compiler_code from previous directory 
from utils import *
from generate_compiler_code import *
from get_compiler_feedback import *
import numpy as np
import json
import argparse

def print_codes(correct_compiler_code, buggy_compiler_code):
    print('#############################################\n')
    
    print(correct_compiler_code)
    print('---------------------------------------------\n')
    
    print('#############################################\n')
    print(buggy_compiler_code)

def get_score(output_1, output_2):
    match = 0
    for op1, op2 in zip(output_1, output_2):
        if op1 == op2:
            match += 1
    try:
        score = match/len(output_1)
        return score
    except ZeroDivisionError: # when runtime error - code does not pass any test case
        return -1

def calculate_score(grp_wise_pred_scores, grp_wise_true_scores):
    '''
    Returns the L1 norm of the difference between the predicted and true scores
    '''
    grp_wise_p_student_scores = defaultdict(dict)
    grp_wise_scores = dict()
    for grp in grp_wise_pred_scores:
        all_scores = []
        pred_score_p_student = grp_wise_pred_scores[grp]
        true_score_p_student = grp_wise_true_scores[grp]
        for p_code_id_sub_id, score_list in pred_score_p_student.items():
            true_score_list = true_score_p_student[p_code_id_sub_id]
            diff = np.abs(np.array(score_list) - np.array(true_score_list)).tolist()
            grp_wise_p_student_scores[grp][p_code_id_sub_id] = diff
            all_scores.extend(diff)
        
        grp_wise_scores[grp] = np.mean(all_scores) # gives nan when all_scores is empty - pred_score_p_student is empty

    return grp_wise_scores, grp_wise_p_student_scores 

def get_groupwise_working_dict(df):
    '''
    To get the complete working dict for all groups (assingment id, problem id)
    '''
    grp_work_dict = defaultdict(list)
    for i, row in df.iterrows():
        grp_work_dict['({:d}, {:d})'.format(int(row['AssignmentID']), row['ProblemID'])].append((row['CodeStateID'], row['p']))
    
    # # sample 100 items randomly (with seed) from the dict for each group
    # grp_work_dict_sample = dict()
    # for grp, values in grp_work_dict.items():
    #     # # To randomly sample 100 values per group
    #     # if len(values) < 100:
    #     #     grp_work_dict_sample[grp] = values
    #     # else:
    #     #     grp_work_dict_sample[grp] = random.sample(values, 100)
    #     grp_work_dict_sample[grp] = values

    return grp_work_dict

def get_selective_groupwise_working_dict(df, m=5):
    '''
    Selects maximum m codes per student per group
    '''
    grp_work_dict = defaultdict(list)
    count_dict = defaultdict(int)
    for i, row in df.iterrows():
        count_prefix = '({:d}, {:d}, {:d}, {:s})'.format(int(row['AssignmentID']), row['ProblemID'], row['p'], row['SubjectID'])
        if count_dict[count_prefix] >= m:
            continue
        grp_work_dict['({:d}, {:d})'.format(int(row['AssignmentID']), row['ProblemID'])].append((row['CodeStateID'], row['p'], row['SubjectID']))
        # increase count
        count_dict[count_prefix] += 1
    return grp_work_dict

def add_params():
    parser = argparse.ArgumentParser()
    parser.add_argument('-m', '--m', type=int, default=5, help='Number of code examples to sample per student per problem.')
    parser.add_argument('-g', '--group', type=int, default=439, help='Assignment number for the evaluation experiment.')
    parser.add_argument('-ap', '--all_p', action=argparse.BooleanOptionalAction, help='Whether to choose all ps for the problem.')
    parser.add_argument('-cl', '--chosen_list', action=argparse.BooleanOptionalAction, help='Whether to work only in the chosen list.')
    parser.add_argument('-db', '--debug', action=argparse.BooleanOptionalAction, help='For debugging - only on 5 samples')
    parser.add_argument('-sd', '--save_dir', type=str, default="full_evaluation", help="Directory for saving results")
    params = parser.parse_args()
    return params 

def check_and_create_dir(dir_path):
    '''
    Creats a directory if it does not already exist. 
    '''
    if not os.path.exists(dir_path):
        os.mkdir(dir_path)


def main():
    args = add_params()

    chosen_list_1 = ['(439, 1)', '(439, 13)', '(439, 235)', '(487, 17)', '(492, 36)', '(502, 57)']
    chosen_list_2 = ['(492, 32)', '(492, 34)', '(494, 46)', '(494, 107)', '(502, 45)', '(502, 56)']
    chosen_list = chosen_list_1 + chosen_list_2

    # Debug Status
    if args.debug:
        print('##### Debug Mode On #####')

    # print m 
    print('Using m: {:d}'.format(args.m))

    # set random seed
    random.seed(37)
    # load data
    group_wise_data, code_dict, problem_dict, code_details_dict = load_data()

    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')
    # NOTE: Change to m = 5
    work_code_p_student_dict = get_selective_groupwise_working_dict(working_df, m=args.m)
    print('Loaded Working data')


    trial = 2 # choosing the last trial 
    compiler_code_path = 'compiler_code'
    grp_wise_pred_scores, grp_wise_true_scores = dict(), dict()
    for processed_group in os.listdir(compiler_code_path):
        raw_group = "({:s})".format(processed_group.replace('_', ', ')) # convert to raw group
        
        assignment_id = raw_group.split(',')[0].strip('() ')

        # if not assignment id then continue 
        if assignment_id != str(args.group):
            continue
        
        # skipping everything other than the chosen_list
        if args.chosen_list and raw_group not in chosen_list:
            continue


        # skipping the chosen list itself
        if not args.chosen_list and raw_group in chosen_list:
            continue

        print('Group: ', raw_group)

        # (492, 128)
        if raw_group == '(492, 128)':
            continue

        # Input and Output of the problem 
        input_type, output_type = code_details_dict[raw_group]['Input'], code_details_dict[raw_group]['Output']

        group_code_info = group_wise_data[raw_group]
        correct_code_id, q = group_code_info['code_ids'][-1], group_code_info['p'][-1]
        correct_code = code_dict[correct_code_id]
        # iterate over codes 
        valid_pred_scores, valid_true_scores = defaultdict(list), defaultdict(list)
        p_list = group_code_info['p'][:-1]

        # correct complier code
        correct_compiler_code = procure_compiler_code(raw_group, correct_code, trial, p_list, output_type)
        save_code(raw_group, correct_compiler_code, q)

        # store valid code ids
        valid_code_ids = defaultdict(list)

        # TODO: Procure all working codes for this group
        # iterate over all working (codes, p) for this group
        ctr = 0
        for code_id, p, student_id in tqdm(work_code_p_student_dict[raw_group], total=len(work_code_p_student_dict[raw_group])):
            if args.debug and ctr == 5:
                break
            # TODO: Check if p is in the actual p_list (if all_p is not turned on)
            if p not in p_list and not args.all_p:
                continue
            # for code_id, p in zip(group_code_info['code_ids'][:-1], group_code_info['p'][:-1]):
            try:
                buggy_compiler_code = procure_compiler_code(raw_group, code_dict[code_id], trial, p_list, output_type) 
                # save code
                save_code(raw_group, buggy_compiler_code, p)
                
                # print_codes(correct_compiler_code, buggy_compiler_code)
                exec_message_1, output_1 = execute_and_store_subprocess(raw_group, 'p_{:d}'.format(p))
                exec_message_2, output_2 = execute_and_store_subprocess(raw_group, 'p_{:d}'.format(q))
                if exec_message_1 == 'Timeout' or exec_message_2 == 'Timeout':
                    continue 
                score = get_score(output_1, output_2)
                # if score == -1:
                #     continue
                valid_pred_scores['{:d}, {:s}, {:s}'.format(p, code_id, student_id)].append(score)
                valid_true_scores['{:d}, {:s}, {:s}'.format(p, code_id, student_id)].append(p/q)
            except Exception as e:
                continue
            # store valid code id
            valid_code_ids[raw_group].append((code_id, p))

            # update counter
            ctr += 1
        
        grp_wise_pred_scores['{:s}'.format(processed_group)] = valid_pred_scores
        grp_wise_true_scores['{:s}'.format(processed_group)] = valid_true_scores

        if args.debug:
            break  

    grp_wise_scores, grp_wise_p_student_scores = calculate_score(grp_wise_pred_scores, grp_wise_true_scores)

    # # DUMP valid code ids
    # with open('evaluated_valid_code_ids.json', 'w') as outfile:
    #     json.dump(valid_code_ids, outfile, indent=6)

    # evaluation 

    # create saving directories
    main_path = '{:s}_{:d}'.format(args.save_dir, args.m)
    save_path = os.path.join(main_path, str(args.group))
    check_and_create_dir(main_path)
    check_and_create_dir(save_path)    

    # Dump grp_wise_scores
    with open('{:s}/group_wise_scores.json'.format(save_path), 'w') as outfile:
        json.dump(grp_wise_scores, outfile, indent=6)
    

    # Dump grp_wise_scores, grp_wise_p_student_scores
    with open('{:s}/grp_wise_p_student_scores.json'.format(save_path), 'w') as outfile:
        json.dump(grp_wise_p_student_scores, outfile, indent=6)


if __name__ == '__main__':
    main()