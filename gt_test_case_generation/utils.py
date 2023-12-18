'''
Utility functions for the test case generation.
'''
import json 
import pandas as pd
from collections import defaultdict

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

def load_data():
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

    return group_wise_data, code_dict, problem_dict, code_details_dict
