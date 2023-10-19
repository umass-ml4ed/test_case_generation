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


def set_api_key():
    '''
    Set OpenAI API key
    '''
    openai.api_key = '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'

###############################################
# NOTE: Response generation
delay_time = 5
decay_rate = 0.8

def chat_llm(model, messages):
    '''
    Chat with LLM
    '''
    global delay_time

    # sleep to avoid rate limit error
    time.sleep(delay_time)

    try:
        response = openai.ChatCompletion.create(
            model=model,
            messages=messages,
            temperature=0.0,
            max_tokens=2000,
        )
    except (RateLimitError, Timeout, APIError, ServiceUnavailableError) as exc:
        print(exc)
        delay_time *= 2
        return chat_llm(model, messages)

    llm_response = response['choices'][0]['message']['content']

    # save into temporary file for inspection 
    with open('temp_llm_response.txt', 'w') as outfile:
        print(llm_response, file=outfile)

    return llm_response

def check_llm_response(group, trial, p):
    try:
        with open('llm_output/{:s}/t{:d}/{:d}.json'.format(group, trial, p), 'r') as f:
            llm_response = json.load(f)
            return llm_response
    except Exception as e:
        return None

def save_llm_response(llm_response, raw_group, trial, p):
    group_elements = literal_eval(raw_group)
    group = '{:d}_{:d}'.format(group_elements[0], group_elements[1])
    # create a directory for the output
    if not os.path.exists('llm_output/{:s}'.format(group)):
        os.mkdir('llm_output/{:s}'.format(group))
    if not os.path.exists('llm_output/{:s}/t{:d}'.format(group, trial)):
        os.mkdir('llm_output/{:s}/t{:d}'.format(group, trial))

    # parse llm response as JSON format 
    try:
        llm_response_json = literal_eval(llm_response)
        # save the response
        with open('llm_output/{:s}/t{:d}/{:d}.json'.format(group, trial, p), 'w') as f:
            json.dump(llm_response_json, f)
    except Exception as e:
        return False 
    return True


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

def create_initial_prompts(problem, correct_code, expt_code, q, input_type):
    '''
    Create prompt for LLM. 
    '''
    all_prompts = []
    for code, p in expt_code:
        prompt =  'Problem: ' + problem + '\n\n'
        prompt += 'Code Input Parameters: ' + input_type + '\n\n\n'
        prompt += 'Partially Correct Code:\n' + wrap_java_code(code) + '\n\n'
        prompt += 'Perfect Code:\n' + wrap_java_code(correct_code) + '\n\n'
        system = 'You are a Programming Expert. Your task is to generate test cases for the following problem and the code pair satisfying the following conditions:\n\n'
        system += 'Conditions: \n'
        system += '1. Total Number of test cases = {:d}\n'.format(q)
        system += '2. Fraction of test cases the partially correct code passes = {:d}/{:d}\n'.format(p, q)
        system += '3. Fraction of test cases the perfect code passes = {:d}/{:d}\n\n'.format(q, q)
        system += 'Important: Generate test cases in a JSON format. '
        system += 'The key of the JSON dictionary is the test case number and the value is the test case itself as a string, a VALID JAVA code that can be directly fed as an argument to the function without any change.\n\n'
        system += 'Example: Code Input Parameters - int[] nums, String[] names. Ouptut: Test Case Dictionary:  {"test_case_1": "new int[]{1, 2, 3}, new String[]{"String1", "String2", "String3"}", "test_case_2": "new int[]{4, 5, 6}, new String[]{"NewString1", "NewString2", "NewString3"}"}'
        prompt += '\n\nTest Case Dictionary:'
        message = [{'role': 'system', 'content': system}, {'role': 'user', 'content': prompt}]
        all_prompts.append(message)
    return all_prompts

def create_next_prompt(output_1, output_2, match_output, p, q, timeout_error):
    '''
    Creates follow-up prompt for the LLM
    '''
    if not timeout_error:
        prompt = 'Shown below is the execution result of the partially correct code and the perfect code on the test cases generated by you. '
        prompt += '\n\n############'
        prompt += '\nPartially Correct Code Results\n'
        prompt += output_1
        prompt += '\n\n############'
        prompt += '\nPerfect Code Results\n'
        prompt += output_2
        prompt += '\n\n############'
        prompt += '\nOutput Comparison: For every test case True means output match and False means outputs do not match\n'
        prompt += str(match_output)
        prompt += '\n Remember the goal is to generate {:d} test cases such that {:d}/{:d} pass the partially correct code (have True output match)'.format(q, p, q)
        prompt += '\n\nTest Case Dictionary:'
    else:
        prompt = 'Shown below is the execution result of the partially correct code and the perfect code on the test cases generated by you. '
        prompt += '\n\n############'
        prompt += '\nPartially Correct Code Results\n'
        prompt += output_1
        prompt += '\n\n############'
        prompt += '\nPerfect Code Results\n'
        prompt += output_2
        prompt += '\n\n############'
        prompt += '\nThere is a timeout error while executing this code (probably because of an infinite loop). This generally happens when you provide extreme inputs like an empty string, huge positive/ negative numbers, etc. Analyze the test case where this problem occured and rewrite the test cases. '
        prompt += '\n\nTest Case Dictionary:'
    return prompt


def main():
    # ###### Load data ######
    # # 1. Code states data
    # with open('analyze_data/group_wise_code_states_id.json', 'r') as f:
    #     group_wise_data = json.load(f)
    # # 2. Actual code data
    # code_states_df = pd.read_csv('../S19_All_Release_2_10_22/Data/CodeStates/CodeStates.csv')
    # # 3. Problem statement data
    # problem_df = pd.read_excel('../2nd CSEDM Data Challenge - Problem Prompts & Concepts Used.xlsx', sheet_name='Sheet1')
    # # 4. Code details
    # code_details_df = pd.read_excel('analyze_data/code_details.xlsx', sheet_name='Sheet1')

    # # Hash data  
    # code_dict = get_codes(code_states_df)
    # problem_dict = get_problems(problem_df)
    # code_details_dict = get_code_details(code_details_df)

    # ###### Prompt LLM ######
    # # Go over the data
    # for group, code_values in group_wise_data.items():
    #     problem = problem_dict[group]
    #     input_type, output_type = code_details_dict[group]['Input'], code_details_dict[group]['Output']
    #     correct_code_id = code_values['code_ids'][-1]
    #     correct_code = code_dict[correct_code_id]
    #     expt_code = []
    #     # collect experiment codes' information
    #     for ctr, code_id in enumerate(code_values['code_ids'][:-1]):
    #         expt_code.append((code_dict[code_id], code_values['p'][ctr]))
    #     q = code_values['p'][-1]
    #     print('problem: ', problem)
    #     print('correct_code: ', correct_code)
    #     print('expt_code: ', expt_code) 
    #     print('q: ', q)
    #     # create prompt
    #     prompts = create_initial_prompts(problem, correct_code, expt_code, q, input_type)
    #     with open('temp_prompt_file.txt', 'w') as outfile:
    #         print(prompts[0], file=outfile)
    #     break
    pass

if __name__ == "__main__":
    main()