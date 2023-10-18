'''
Executes Java code, stores the execution in a file. 
Returns the results of the execution along with their comparision
'''

import os 
from ast import literal_eval


def execute_and_store(raw_group, code_name):
    '''
    Executes the code and stores the output in a file
    Returns the output of the execution
    '''
    group_elements = literal_eval(raw_group)
    group = '{:d}_{:d}'.format(group_elements[0], group_elements[1])
    java_code_group_path = 'compiler_code/{:s}'.format(group)
    # execute the code using a system call and record the output as text
    # create a directory for the output
    if not os.path.exists('{:s}/output'.format(java_code_group_path)):
        os.mkdir('{:s}/output'.format(java_code_group_path))
    # execute the code
    os.system('java {:s}/{:s}.java output > {:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name, java_code_group_path, code_name))
    # read the output
    with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'r') as f:
        output = f.read()
    return output

def compare_outputs(output_1, output_2):
    '''
    Compares two outputs line-by-line
    '''
    output_1_lines = output_1.split('\n')
    output_2_lines = output_2.split('\n')
    assert len(output_1_lines) == len(output_2_lines)
    match_output = []
    for op1, op2 in zip(output_1_lines, output_2_lines):
        match_output.append(op1 == op2)
    return match_output


def main():
    # # output of buggy code execution
    # group, code_name = '(439, 1)', 'p_8'
    # output_1 = execute_and_store(group, code_name) 

    # # output of correct code execution
    # group, code_name = '(439, 1)', 'p_15'
    # output_2 = execute_and_store(group, code_name)

    # # compare outputs
    # match_output = compare_outputs(output_1, output_2)

    # print('Output of buggy code execution:\n', output_1)
    # print('Output of correct code execution:\n', output_2)
    # print('Output comparision:\n', match_output)
    pass


if __name__ == '__main__':
    main()