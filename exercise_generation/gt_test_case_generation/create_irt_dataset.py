'''
For every dataset - get the matrix containing the pass/fail information of the student code versus the test cases
'''
# imports
import os
from tqdm import tqdm
from generate_compiler_code import *
from get_compiler_feedback import *
from utils import *

def get_all_test_cases(grp):
    llm_output_path = 'llm_output/{:s}/t1'.format(grp)
    grp_str = "({:s})".format(grp.replace('_', ', '))
    file_names = []
    for file in os.listdir(llm_output_path):
        if file.endswith('.json'):
            file_names.append(int(file.split('.')[0]))
    all_test_cases = extract_test_cases(grp_str, 2, file_names)
    return all_test_cases

def create_dir(dir_name):
    if not os.path.exists(dir_name):
        os.mkdir(dir_name)

def execute_test_cases(grp_str, output_type, code, all_test_cases):
    # Get output of all test cases on the correct code
    all_output = []
    for test_case in tqdm(all_test_cases):
        compiler_code = procure_compiler_code(grp_str, code, None, None, output_type, bypass_testcase=[test_case])
        save_code(grp_str, compiler_code, 100) # 100 - placeholder for saving code
        exec_message, output = execute_and_store_subprocess(grp_str, 'p_{:d}'.format(100))
        if exec_message == 'Timeout':
            output = None
        all_output.append(output)
    all_output_dict = {i:output for i, output in enumerate(all_output)}
    return all_output_dict

def get_matching_output(outputs, correct_outputs):
    matching_output = []
    for out, cor_out in zip(outputs, correct_outputs):
        if out == None or out != cor_out:
            matching_output.append(0)
        else:
            matching_output.append(1)
    matching_output_dict = {i: match for i, match in enumerate(matching_output)}
    return matching_output_dict

def main():
    group = '502_45' 
    grp_str = "({:s})".format(group.replace('_', ', '))

    all_test_cases = get_all_test_cases(group)
    print('{:s}: {:d}'.format(group, len(all_test_cases)))

    main_dir = 'IRT_dataset'
    create_dir(main_dir)

    save_dir = os.path.join(main_dir, group)
    create_dir(save_dir)

    test_cases_dict = {i:test_case for i, test_case in enumerate(all_test_cases)}
    with open(os.path.join(save_dir, 'test_cases.json'), 'w') as outfile:
        json.dump(test_cases_dict, fp=outfile, indent=6)


    
    # TODO: Get results on the correct code
    group_wise_data, code_dict, problem_dict, code_details_dict = load_data()

    # Problem input and output type 
    input_type, output_type = code_details_dict[grp_str]['Input'], code_details_dict[grp_str]['Output']

    #### Correct Code ####
    correct_code_id = group_wise_data[grp_str]['code_ids'][-1]
    correct_code = code_dict[correct_code_id]

    print('Testing on the correct code')
    all_correct_output = execute_test_cases(grp_str, output_type, correct_code, all_test_cases)
    with open(os.path.join(save_dir, 'correct_outputs.json'), 'w') as outfile:
        json.dump(all_correct_output, fp=outfile, indent=6)

    # TODO: get output on all selected codes
    print('Testing on all codes')

    group_start = group.split('_')[0]
    with open('new_dataset/{:s}.json'.format(group_start), 'r') as infile:
        json_data = json.load(infile)
    
    prb_info = json_data[group]
    all_code_execution = dict()
    ctr = 0
    for std_id, code_info in prb_info.items():
        print('Code Number: {:d}/{:d}'.format(ctr+1, len(prb_info)))
        code_id = code_info.split('_')[1]
        code = code_dict[code_id]
        # TODO: Get results on this code 
        all_code_output = execute_test_cases(grp_str, output_type, code, all_test_cases)
        all_code_execution[code_id] = all_code_output
        ctr += 1
    
    # save execution results on all codes
    with open(os.path.join(save_dir, 'all_code_outputs.json'), 'w') as outfile:
        json.dump(all_code_execution, fp=outfile, indent=6)
    
    # TODO: Implement matching
    matching_output = dict()
    for code_id, code_results_info in all_code_execution.items():
        matching_output[code_id] = get_matching_output(list(code_results_info.values()), list(all_correct_output.values()))
    
    with open(os.path.join(save_dir, 'IRT_dataset.json'), 'w') as outfile:
        json.dump(matching_output, fp=outfile, indent=6)


        



if __name__ == '__main__':
    main() 