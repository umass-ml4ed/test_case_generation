'''
For every problem - select a student code that is most similar to the generated test cases. 
'''

# Imports 
from collections import defaultdict
import json 
import os
import pandas as pd

def create_dir(dir_path):
    if not os.path.exists(dir_path):
        os.mkdir(dir_path)

def store_data(assignment, prblm_wise_selected_codes):
    main_dir = 'dataset'
    create_dir(main_dir)
    with open('{:s}/{:s}.json'.format(main_dir, assignment), 'w') as outfile:
        json.dump(prblm_wise_selected_codes, outfile, indent=6)

    
def get_q_dict(df):
    q_dict = dict()
    for i, row in df.iterrows():
        q_dict['{:d}_{:d}'.format(int(row['AssignmentID']), row['ProblemID'])] = row['q']
    return q_dict

def get_exclude_codes(q_dict, json_data):
    exclude_codes = dict()

    for group, group_details in json_data.items():
        q = q_dict[group]
        student_wise_details = defaultdict(list)
        for raw_detail in group_details:
            detail = raw_detail.split(', ')
            student_wise_details[detail[2]].append((detail[0], detail[1]))
        for student, detail in student_wise_details.items():
            if len(detail) == 1:
                continue
            else:
                for p, code_id in detail:
                    if int(p) == q:
                        exclude_codes[code_id] = 1
    
    return exclude_codes


def main():
    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')
    q_dict = get_q_dict(working_df)


    main_path = 'evaluation_5'    
    # allow_assignment = ['487', '502']
    for assignment in os.listdir(main_path):
        # if assignment not in allow_assignment:
        #     continue
        file_path = os.path.join(main_path, assignment, 'grp_wise_p_student_scores.json')
        with open(file_path, 'r') as infile:
            json_data = json.load(infile)
        # NOTE: Get exclude codes
        exclude_codes = get_exclude_codes(q_dict, json_data)
        # iterate over all problems      
        prblm_wise_selected_codes = dict() # select one student code per problem
        for problem, p_code_id_sub_id_details in json_data.items():
            print('Problem: {:s}'.format(problem))
            student_wise_code_p = defaultdict(dict)
            for p_code_id_sub_id_raw, score in p_code_id_sub_id_details.items():
                p_code_id_sub_id = p_code_id_sub_id_raw.split(', ')
                # Filter all exculde codes
                try:
                    exclude_codes[p_code_id_sub_id[1]]
                    continue 
                except KeyError: 
                    student_wise_code_p[p_code_id_sub_id[2]]["{:s}_{:s}".format(p_code_id_sub_id[0], p_code_id_sub_id[1])] = score[0]
            # iterate over all students
            for student_id, student_info in student_wise_code_p.items():
                student_wise_code_p[student_id] = dict(sorted(student_info.items(), key=lambda item: item[1]))
            # choose best code - for now -> one with least score
            # NOTE: Need to add additional constraints - threshold rejection
            best_student_code = dict() 
            for student_id, student_info in student_wise_code_p.items():
                best_student_code[student_id] = list(student_info.keys())[0]
            # store best student codes 
            prblm_wise_selected_codes[problem] = best_student_code
        
        # store data
        store_data(assignment, prblm_wise_selected_codes)


if __name__ == '__main__':
    main()