'''
Generate code for testing the test cases for each problem 
'''
import os
import pandas as pd 
import json 

def get_codes(df):
    '''
    Converts df to dict
    '''
    code_dict = dict()
    for i, row in df.iterrows():
        code_dict[row['CodeStateID']] = row['Code']
    return code_dict

def extract_function_name(code):
    '''
    Extracts function name from Java code (even without static keyword)
    '''
    code = code.split('\n')
    for line in code:
        if 'public' in line:
            line = line.split(' ')
            for word in line:
                if '(' in word:
                    return word.split('(')[0]
    return extract_function_name

def create_unit_test_case_function(function_name, test_cases_prints):
    '''
    Creates a unit test case function for the given function name, code and test cases
    Output is a string representing a valid Java code
    '''
    unit_test_case_function_code = 'public {:s}_test(String []s)'.format(function_name)
    unit_test_case_function_code += '{\n'
    unit_test_case_function_code += '{:s}\n'.format(test_cases_prints)
    return unit_test_case_function_code


def main():
    # 1. Code states data
    with open('analyze_data/group_wise_code_states_id.json', 'r') as f:
        group_wise_data = json.load(f)
    # 2. Actual code data
    code_states_df = pd.read_csv('../S19_All_Release_2_10_22/Data/CodeStates/CodeStates.csv')

    # Hash data  
    code_dict = get_codes(code_states_df)
    group_wise_codes = dict()
    for group, code_values in group_wise_data.items():
        all_codes = []
        correct_code_id = code_values['code_ids'][-1]
        correct_code = code_dict[correct_code_id]
        expt_code = []
        for ctr, code_id in enumerate(code_values['code_ids'][:-1]):
            expt_code.append((code_dict[code_id], code_values['p'][ctr]))
        all_codes.extend(expt_code)
        all_codes.append((correct_code, code_values['p'][-1]))
        group_wise_codes[group] = all_codes

    test_cases = '' # assume we have the printing of test cases as a string - a valid Java code
    
    # iterate over all groups and codes
    for group, all_codes in group_wise_codes.items():
        # extract function name
        function_name = extract_function_name(all_codes[0][0])
        print('#####')
        print('group: ', group)
        print('function_name: ', function_name)
        print('#####')
        # create a unit test case function
        unit_test_case_function_code = create_unit_test_case_function(function_name, test_cases)

if __name__ == main():
    main()