'''
Pipeline for generating test cases
'''

# Import local modules 
import sys
from prompt_llm import *
from generate_compiler_code import *
from get_compiler_feedback import *


def main():
    # Set API key
    set_api_key()

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

    # testing on select group ids 
    allow_groups = ['(439, 1)', '(439, 5)', '(492, 31)', '(492, 32)', '(494, 46)'] # Java Exception for (492, 32) # TODO: Handle run time exceptions
    # allow_groups = ['(492, 32)']

    # Go over the data
    for group, code_values in group_wise_data.items():
        if group not in allow_groups:
            continue

        print('Group: ', group)
        problem = problem_dict[group]
        input_type, output_type = code_details_dict[group]['Input'], code_details_dict[group]['Output']
        correct_code_id = code_values['code_ids'][-1]
        correct_code = code_dict[correct_code_id]
        expt_code = []
        # collect experiment codes' information
        for ctr, code_id in enumerate(code_values['code_ids'][:-1]):
            expt_code.append((code_dict[code_id], code_values['p'][ctr]))
        q = code_values['p'][-1]
        # create prompts for all codes
        prompts = create_initial_prompts(problem, correct_code, expt_code, q, input_type)
        # generate compiler code 
        for prompt, code_info in zip(prompts, expt_code):
            print('p:  {:d}'.format(code_info[1]))
            # # TODO: prompt LLM to generate test case
            # llm_response = chat_llm(model='gpt-3.5-turbo', messages = prompt)
            # status = save_llm_response(llm_response, group, 1, code_info[1])
            # if not status:
            #     sys.exit(0)
            # print('Generated Test Cases')

            # TODO: Generate compiler code
            buggy_compiler_code = procure_compiler_code(group, code_info[0], 1, code_info[1], output_type)
            correct_compiler_code = procure_compiler_code(group, correct_code, 1, code_info[1], output_type)
            print('Generated Compiler Code')
            # save code
            save_code(group, buggy_compiler_code, code_info[1])
            save_code(group, correct_compiler_code, q)
            # execute code and get feedback
            # Check timeout error (if there is no output for more than 10 s then break)

            output_1 = execute_and_store_subprocess(group, 'p_{:d}'.format(code_info[1]))
            output_2 = execute_and_store_subprocess(group, 'p_{:d}'.format(q))
            # Execution check for timeout
            if output_1 == 'Timeout' or output_2 == 'Timeout':
                print('Timeout error')
                break

            # compare outputs
            match_output = compare_outputs(output_1, output_2)
            print('Generated Output Comparison')
            print('Output of buggy code execution:\n', output_1)
            print('Output of correct code execution:\n', output_2)
            print('Output comparision:\n', match_output)
            break


if __name__ == '__main__':
    main()