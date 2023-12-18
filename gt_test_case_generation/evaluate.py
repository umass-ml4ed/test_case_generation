'''
For every problem, reads the test cases generated and evaluates them
'''

import os 
import sys
import random
from tqdm import tqdm
# import generate_compiler_code from previous directory 
from utils import *
from generate_compiler_code import *
from get_compiler_feedback import *
import numpy as np

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
    except ZeroDivisionError: # when runtime error - code does not pass any test case
        return -1
    return match/len(output_1)

def calculate_score(grp_wise_pred_scores, grp_wise_true_scores):
    '''
    Returns the L1 norm of the difference between the predicted and true scores
    '''
    grp_wise_scores = dict()
    for grp in grp_wise_pred_scores:
        pred_score = grp_wise_pred_scores[grp]
        true_score = grp_wise_true_scores[grp]
        # L1 norm between the predicted and true scores
        grp_wise_scores[grp] = np.mean(np.abs(pred_score - true_score))

    # total score - average of the L1 norm of the difference between the predicted and true scores
    total_score = np.mean(list(grp_wise_scores.values()))
    return total_score, grp_wise_scores 

def get_groupwise_working_dict(df):
    grp_work_dict = defaultdict(list)
    for i, row in df.iterrows():
        grp_work_dict['({:d}, {:d})'.format(int(row['AssignmentID']), row['ProblemID'])].append((row['CodeStateID'], row['p']))
    
    # sample 100 items randomly (with seed) from the dict for each group
    grp_work_dict_sample = dict()
    for grp, values in grp_work_dict.items():
        if len(values) < 100:
            grp_work_dict_sample[grp] = values
        else:
            grp_work_dict_sample[grp] = random.sample(values, 100)

    return grp_work_dict_sample


def main():
    # set random seed
    random.seed(37)
    # load data
    group_wise_data, code_dict, problem_dict, code_details_dict = load_data()

    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')
    work_code_p_dict = get_groupwise_working_dict(working_df)
    print('Loaded Working data')


    trial = 3 # choosing the last trial 
    compiler_code_path = 'compiler_code'
    grp_wise_pred_scores, grp_wise_true_scores = dict(), dict()
    for processed_group in os.listdir(compiler_code_path):
        raw_group = "({:s})".format(processed_group.replace('_', ', ')) # convert to raw group
        print('Group: ', raw_group)
        # Input and Output of the problem 
        input_type, output_type = code_details_dict[raw_group]['Input'], code_details_dict[raw_group]['Output']

        group_code_info = group_wise_data[raw_group]
        correct_code_id, q = group_code_info['code_ids'][-1], group_code_info['p'][-1]
        correct_code = code_dict[correct_code_id]
        # iterate over codes 
        valid_pred_scores, valid_true_scores = [], []
        p_list = group_code_info['p'][:-1]

        # correct complier code
        correct_compiler_code = procure_compiler_code(raw_group, correct_code, trial, p_list, output_type)
        save_code(raw_group, correct_compiler_code, q)

        # TODO: Procure all working codes for this group
        # iterate over all working (codes, p) for this group
        for code_id, p in tqdm(work_code_p_dict[raw_group], total=len(work_code_p_dict[raw_group])):
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
                if score == -1:
                    continue
                valid_pred_scores.append(score)
                valid_true_scores.append(p/q)
            except Exception as e:
                continue
        
        grp_wise_pred_scores['{:s}'.format(processed_group)] = valid_pred_scores
        grp_wise_true_scores['{:s}'.format(processed_group)] = valid_true_scores       

    total_score, grp_wise_scores = calculate_score(grp_wise_pred_scores, grp_wise_true_scores)
    print('total_score: ', total_score)
    print('grp_wise_scores: ', grp_wise_scores)

if __name__ == '__main__':
    main()