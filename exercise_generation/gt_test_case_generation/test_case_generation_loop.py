'''
Pipeline for generating test cases
'''

# Import local modules 
import sys
from prompt_llm import *
from generate_compiler_code import *
from get_compiler_feedback import *
from utils import *


def main():
    # Precauction - create directories 
    if not os.path.exists('llm_output'):
        os.mkdir('llm_output')
    if not os.path.exists('compiler_code'):
        os.mkdir('compiler_code')

    # Set API key
    set_api_key()
    # Maximum Number of trails 
    ITER_TRIALS = 2
    # If prompt_dump.txt exists, delete it
    if os.path.exists('prompt_dump.txt'):
        os.remove('prompt_dump.txt')

    group_wise_data, code_dict, problem_dict, code_details_dict = load_data()

    # testing on select group ids 
    # allow_groups = ['(439, 1)', '(439, 5)', '(492, 31)', '(492, 32)', '(494, 46)'] # Java Exception for (492, 32) # TODO: Handle run time exceptions
    # allow_groups = ['(492, 32)', '(494, 46)']
    # allow_groups = ['(492, 32)']

    error_groups = []

    # Force repeat new generation of test cases even if the data is already present
    force_repeate_llm = False 

    # Go over the data
    for group, code_values in group_wise_data.items():
        # if '502' not in group:
        #     continue
        try:
            # if group not in allow_groups:
            #     continue

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

                for trial in range(1, ITER_TRIALS+1):
                    print('Trial: ', trial)

                    # # Logging prompt
                    # with open('prompt_dump.txt', 'a+') as f:
                    #     f.write('Group: ' + group + '\n')
                    #     f.write('p: ' + str(code_info[1]) + '\n')
                    #     f.write('Trial: ' + str(trial) + '\n')
                    #     f.write('Prompt: ' + str(prompt) + '\n')

                    # TODO: Check if llm_response already exists (if yes, then skip)
                    llm_response = check_llm_response(group, trial, code_info[1])

                    if llm_response == None or force_repeate_llm:
                        print('Prompting LLM')
                        # TODO: prompt LLM to generate test case
                        # llm_response = chat_llm(model='gpt-3.5-turbo', messages = prompt)
                        llm_response = chat_llm(model='gpt-4', messages = prompt)
                        status = save_llm_response(llm_response, group, trial, code_info[1])
                        if not status:
                            raise Exception('Error in parsing LLM response')
                    print('Generated Test Cases')
                    # TODO: Generate compiler code
                    buggy_compiler_code = procure_compiler_code(group, code_info[0], trial, [code_info[1]], output_type)
                    correct_compiler_code = procure_compiler_code(group, correct_code, trial, [code_info[1]], output_type)
                    print('Generated Compiler Code')
                    # save code
                    save_code(group, buggy_compiler_code, code_info[1])
                    save_code(group, correct_compiler_code, q)
                    # execute code and get feedback
                    # Check timeout error (if there is no output for more than 10 s then break)
                    exec_message_1, output_1 = execute_and_store_subprocess(group, 'p_{:d}'.format(code_info[1]))
                    exec_message_2, output_2 = execute_and_store_subprocess(group, 'p_{:d}'.format(q))
                    # Execution check for timeout
                    if exec_message_1 == 'Timeout' or exec_message_2 == 'Timeout':
                        print('Timeout error')
                        timeout_error = True
                        match_output = None
                    else:
                        # compare outputs
                        match_output = compare_outputs(output_1, output_2)
                        timeout_error = False
                        # print('Generated Output Comparison')
                        # print('Output of buggy code execution:\n', output_1)
                        # print('Output of correct code execution:\n', output_2)
                        # print('Output comparision:\n', match_output)

                    # Create the next (iterative) prompt for LLM
                    new_message = create_next_prompt(output_1, output_2, match_output, code_info[1], q, timeout_error, trial+1)
                    new_openai_message = [{'role': 'assistant', 'content': llm_response}, {'role': 'user', 'content': new_message}]
                    prompt = prompt + new_openai_message
        except Exception as e:
            error_groups.append((group, str(e)))
        
    # Dump error data into a text file
    with open('error_dump.txt', 'w') as f:
        for group, error in error_groups:
            f.write('Group: ' + group + '\n')
            f.write('Error: ' + error + '\n')
            f.write('\n')



if __name__ == '__main__':
    main()