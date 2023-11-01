'''
Executes Java code, stores the execution in a file. 
Returns the results of the execution along with their comparision
'''

import os 
from ast import literal_eval
import threading
import subprocess
import time

def run_command(java_code_group_path, code_name):
    # execute the code using a system call and record the output as text
    # create a directory for the output
    if not os.path.exists('{:s}/output'.format(java_code_group_path)):
        os.mkdir('{:s}/output'.format(java_code_group_path))
    # execute the code
    os.system('java {:s}/{:s}.java output > {:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name, java_code_group_path, code_name))

def execute_and_store(raw_group, code_name):
    '''
    Executes the code and stores the output in a file
    Returns the output of the execution
    '''
    group_elements = literal_eval(raw_group)
    group = '{:d}_{:d}'.format(group_elements[0], group_elements[1])
    java_code_group_path = 'compiler_code/{:s}'.format(group)
    
    thread = threading.Thread(target=run_command, args=(java_code_group_path, code_name))
    thread.start()
    thread.join(timeout=10)  # Set the timeout in seconds

    if thread.is_alive():
        print('in here')
        thread.join()  # Ensure the thread is terminated
        return "Timeout"
    
    # read the output
    with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'r') as f:
        output = f.read()
    return output

def execute_and_store_subprocess(raw_group, code_name):
    try:
        timeout = 30
        group_elements = literal_eval(raw_group)
        group = '{:d}_{:d}'.format(group_elements[0], group_elements[1])
        java_code_group_path = 'compiler_code/{:s}'.format(group)
        
        if not os.path.exists('{:s}/output'.format(java_code_group_path)):
            os.mkdir('{:s}/output'.format(java_code_group_path))
        
        # command = 'java {:s}/{:s}.java output > {:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name, java_code_group_path, code_name)
        # result = subprocess.run(command, shell=True, timeout=timeout, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
        
        new_command = 'java {:s}/{:s}.java output'.format(java_code_group_path, code_name)
        with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'w') as f:
            result = subprocess.run(new_command, shell=True, timeout=timeout, stdout=f, stderr=subprocess.PIPE, text=True)
            f.close()
        
    except subprocess.TimeoutExpired:
        # read the output
        with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'r') as f:
            output = f.read()
        return 'Timeout', output
    
    except subprocess.CalledProcessError as e:
        print("Java process returned non-zero exit status:", e.returncode)
        # read the output
        with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'r') as f:
            output = f.read()
        return 'Timeout', output
    
    except Exception as e:
        print("An error occurred:", e)
        # read the output
        with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'r') as f:
            output = f.read()
        return 'Timeout', output

    # read the output
    with open('{:s}/output/output_{:s}.txt'.format(java_code_group_path, code_name), 'r') as f:
        output = f.read()
    return 'Success', output


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