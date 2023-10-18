'''
Generate code for testing the test cases for each problem 
'''
import os
import pandas as pd 
import json 
import re
from ast import literal_eval

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
    return None

def create_unit_test_case_function(function_name, test_cases_list):
    '''
    Creates a unit test case function for the given function name, code and test cases
    Output is a string representing a valid Java code
    '''
    unit_test_case_function_code = 'public void {:s}_test(String []s)'.format(function_name)
    unit_test_case_function_code += '{\n'
    # add print statements for test cases
    test_cases_prints = ''
    for test_case in test_cases_list:
        test_cases_prints += 'System.out.println({:s}({:s}));\n'.format(function_name, test_case)
    unit_test_case_function_code += test_cases_prints
    unit_test_case_function_code += '}\n'
    return unit_test_case_function_code

def get_main_function_code(class_name, function_name):
    '''
    Creates a main function for the given function name
    Output is a string representing a valid Java code
    '''
    main_function_code = 'public static void main(String []args)'
    main_function_code += '{\n'
    # Create an object of the class
    main_function_code += '{:s} obj = new {:s}();\n'.format(class_name, class_name)
    # Call the test function
    main_function_code += 'obj.{:s}_test(args);\n'.format(function_name)
    main_function_code += '}\n'
    return main_function_code

def get_complete_java_code(class_name, code, unit_test_case_function_code, main_function_code):
    '''
    Weaves everything together into a class
    Output is a string representing a valid Java code
    '''
    complete_java_code = 'public class {:s}'.format(class_name)
    complete_java_code += '{\n'
    complete_java_code += code
    complete_java_code += '\n'
    complete_java_code += unit_test_case_function_code
    complete_java_code += '\n'
    complete_java_code += main_function_code
    complete_java_code += '\n'
    complete_java_code += '}\n'
    return complete_java_code

def extract_test_cases(group, trial, p):
    '''
    Reads test cases json and returns a list of test cases
    '''
    group_tuple = literal_eval(group)
    with open('llm_output/{:d}_{:d}/t{:d}/{:d}.json'.format(group_tuple[0], group_tuple[1], trial, p), 'r') as f:
        test_cases = json.load(f)
    test_cases_list = list(test_cases.values())
    return test_cases_list

def parse_java_code(java_code):
    '''
    Takes Java code as input and returns the function signature and the main body
    '''
    java_code = java_code.strip()
    signature = re.search(r'(.*?){', java_code, re.DOTALL).group(1).strip()
    body_start_index = java_code.index("{") + 1
    body_end_index = java_code.rindex("}")
    body = java_code[body_start_index : body_end_index].strip()
    return signature, body

def handle_exception(student_code, output_type=None):
    '''
    Wraps student code in a try-catch block to handle exceptions
    '''
    # extract function signature and main body (in between the outermost two curly braces)
    function_signature, main_body = parse_java_code(student_code)
    # TODO: Wrap main_body in a try catch block 
    except_code = 'try {\n'
    except_code += main_body
    except_code += '\n'
    except_code += '} catch (Exception e) {\n'
    except_code += 'System.out.print(e + " ");\n'
    if output_type == 'int':
        except_code += 'return -999;\n'
    elif output_type == 'boolean':
        except_code += 'return false;\n'
    elif output_type == 'string':
        except_code += 'return "ERROR";\n'
    elif output_type == 'int array':
        except_code += 'return new int[] {-999};\n'
    elif output_type == 'string array':
        except_code += 'return new String[] {"ERROR"};\n'
    except_code += '}\n'
    # wrap the main code in the function defintion
    new_code = function_signature + '{\n' + except_code + '}\n'
    return new_code

def construct_java_code(test_cases, function_name, class_name, student_code, output_type):
    '''
    Constructs the full Java code
    '''
    # create a unit test case function
    unit_test_case_function_code = create_unit_test_case_function(function_name, test_cases)
    # create a main function
    main_function_code = get_main_function_code(class_name, function_name)
    # TODO: Wrap student code in a try-catch block to handle exceptions
    exception_handeled_code = handle_exception(student_code, output_type)
    # Weave everything together into a class
    complete_java_code = get_complete_java_code(class_name, exception_handeled_code, unit_test_case_function_code, main_function_code)
    return complete_java_code

def procure_compiler_code(group, code, trial, p, output_type):
    # extract function name
    function_name = extract_function_name(code)
    class_name = function_name.upper()
    # print('#####')
    # print('group: ', group)
    # print('function_name: ', function_name)
    # print('#####')
    # get test cases
    test_cases = extract_test_cases(group, trial, p)
    # construct java code for buggy student code
    complete_java_code = construct_java_code(test_cases, function_name, class_name, code, output_type)
    return complete_java_code

def save_code(group, code, p):
    '''
    Saves the generated code
    '''
    group_tuple = literal_eval(group)
    # Save the code
    if not os.path.exists('compiler_code/{:d}_{:d}'.format(group_tuple[0], group_tuple[1])):
        os.mkdir('compiler_code/{:d}_{:d}'.format(group_tuple[0], group_tuple[1]))
    with open('compiler_code/{:d}_{:d}/p_{:d}.java'.format(group_tuple[0], group_tuple[1], p), 'w') as f:
        f.write(code)

def main():
    # # 1. Code states data
    # with open('analyze_data/group_wise_code_states_id.json', 'r') as f:
    #     group_wise_data = json.load(f)
    # # 2. Actual code data
    # code_states_df = pd.read_csv('../S19_All_Release_2_10_22/Data/CodeStates/CodeStates.csv')

    # # Hash data  
    # code_dict = get_codes(code_states_df)
    # group_wise_codes = dict()
    # for group, code_values in group_wise_data.items():
    #     all_codes = []
    #     for ctr, code_id in enumerate(code_values['code_ids']):
    #         all_codes.append({'code': code_dict[code_id], 'p': code_values['p'][ctr]})
    #     group_wise_codes[group] = all_codes
    
    # test_cases = '' # assume we have the printing of test cases as a string - a valid Java code
    
    # # iterate over all groups and codes
    # for group, all_codes in group_wise_codes.items():
    #     complete_java_code = procure_compiler_code(group, all_codes[0]['code'], 1, all_codes[0]['p'])
    #     save_code(group, complete_java_code, all_codes[0]['p'])
    #     break
    pass

if __name__ == main():
    main()