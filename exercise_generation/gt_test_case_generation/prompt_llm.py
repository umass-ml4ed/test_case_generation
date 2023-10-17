'''
Code for prompting GPT-4 to generate test cases for a given problem statement
'''

import os
import argparse
import time
from collections import defaultdict
from tqdm import tqdm
import json
from ast import literal_eval
import pandas as pd
import numpy as np
import openai
from openai.error import RateLimitError, Timeout, APIError, ServiceUnavailableError

def get_codes(df):
    '''
    Converts df to dict
    '''
    code_dict = dict()
    for i, row in df.iterrows():
        code_dict[row['CodeStateID']] = row['Code']
    return code_dict

def get_problems(df):
    '''
    Converts df to dict
    '''
    problem_dict = dict()
    for i, row in df.iterrows():
        group = str((row['AssignmentID'], row['ProblemID']))
        problem_dict[group] = row['Requirement']
    return problem_dict

def get_code_details(df):
    '''
    Converts df to dict
    '''
    code_details_dict = defaultdict(dict)
    for i, row in df.iterrows():
        group = str((row['AssignmentID'], row['ProblemID']))
        code_details_dict[group]['Input'] = row['Input Type']
        code_details_dict[group]['Output'] = row['Return Type']
    return code_details_dict

def wrap_java_code(code):
    '''
    Wrap Java code in block comments
    '''
    java_code = '```java\n'
    java_code += code
    java_code += '```'
    return java_code  

def create_prompts(problem, correct_code, expt_code, q, input_type):
    '''
    Create prompt for LLM. 
    '''
    all_prompts = []
    for code, p in expt_code:
        prefix = 'You are a Programming Expert. Your task is to generate test cases for the following problem and the code pair satisfying the following conditions:\n\n'
        prompt = prefix + 'Problem: ' + problem + '\n\n'
        prompt += 'Code Input Parameters: ' + input_type + '\n\n\n'
        prompt += 'Partially Correct Code:\n' + wrap_java_code(code) + '\n\n'
        prompt += 'Perfect Code:\n' + wrap_java_code(correct_code) + '\n\n'
        prompt += 'Conditions: \n'
        prompt += '1. Total Number of test cases = {:d}\n'.format(q)
        prompt += '2. Fraction of test cases the partially correct code passes = {:d}/{:d}\n'.format(p, q)
        prompt += '3. Fraction of test cases the perfect code passes = {:d}/{:d}\n\n'.format(q, q)
        prompt += 'Important: Generate test cases in a JSON format. '
        prompt += 'The key of the JSON dictionary is the test case number and the value is the test case itself as a string, a VALID JAVA code that can be directly fed as an argument to the function without any change.\n\n'
        prompt += 'Example: Code Input Parameters - int[] nums, String[] names. Ouptut: Test Case Dictionary:  {"test_case_1": "new int[]{1, 2, 3}, new String[]{"String1", "String2", "String3"}", "test_case_2": "new int[]{4, 5, 6}, new String[]{"NewString1", "NewString2", "NewString3"}"}'
        prompt += '\n\nTest Case Dictionary:'
        all_prompts.append(prompt)
    return all_prompts


def main():
    ###### Load data ######
    # 1. Code states data
    with open('analyze_data/group_wise_code_states_id.json', 'r') as f:
        group_wise_data = json.load(f)
    # 2. Actual code data
    code_states_df = pd.read_csv('../S19_All_Release_2_10_22/Data/CodeStates/CodeStates.csv')
    # 3. Problem statement data
    problem_df = pd.read_excel('../2nd CSEDM Data Challenge - Problem Prompts & Concepts Used.xlsx', sheet_name='Sheet1')
    # 4. Code details
    code_details_df = pd.read_excel('analyze_data/code_details.xlsx', sheet_name='Sheet1')

    # Hash data  
    code_dict = get_codes(code_states_df)
    problem_dict = get_problems(problem_df)
    code_details_dict = get_code_details(code_details_df)

    ###### Prompt LLM ######
    # Go over the data
    for group, code_values in group_wise_data.items():
        problem = problem_dict[group]
        input_type, output_type = code_details_dict[group]['Input'], code_details_dict[group]['Output']
        correct_code_id = code_values['code_ids'][-1]
        correct_code = code_dict[correct_code_id]
        expt_code = []
        # collect experiment codes' information
        for ctr, code_id in enumerate(code_values['code_ids'][:-1]):
            expt_code.append((code_dict[code_id], code_values['p'][ctr]))
        q = code_values['p'][-1]
        print('problem: ', problem)
        print('correct_code: ', correct_code)
        print('expt_code: ', expt_code) 
        print('q: ', q)
        # create prompt
        prompts = create_prompts(problem, correct_code, expt_code, q, input_type)
        with open('temp_prompt_file.txt', 'w') as outfile:
            print(prompts[0], file=outfile)
        break

if __name__ == "__main__":
    main()