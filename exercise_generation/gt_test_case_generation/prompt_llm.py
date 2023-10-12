'''
Code for prompting GPT-4 to generate test cases for a given problem statement
'''

import os
import argparse
import time
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


def main():
    ###### Load data ######
    # 1. Code states data
    with open('analyze_data/group_wise_code_states_id.json', 'r') as f:
        group_wise_data = json.load(f)
    # 2. Actual code data
    code_states_df = pd.read_csv('../S19_All_Release_2_10_22/Data/CodeStates/CodeStates.csv')
    # 3. Problem statement data
    problem_df = pd.read_excel('../2nd CSEDM Data Challenge - Problem Prompts & Concepts Used.xlsx', sheet_name='Sheet1')

    # Hash data  
    code_dict = get_codes(code_states_df)
    problem_dict = get_problems(problem_df)

    ###### Prompt LLM ######
    # Go over the data
    for group, code_values in group_wise_data.items():
        problem = problem_dict[group]
        correct_code_id = code_values['code_ids'][-1]
        correct_code = code_dict[correct_code_id]
        expt_code = []
        for ctr, code_id in enumerate(code_values['code_ids'][:-1]):
            expt_code.append((code_dict[code_id], code_values['p'][ctr]))
        q = code_values['p'][-1]
        print('problem: ', problem)
        print('correct_code: ', correct_code)
        print('expt_code: ', expt_code) 
        print('q: ', q)
        break

if __name__ == "__main__":
    main()