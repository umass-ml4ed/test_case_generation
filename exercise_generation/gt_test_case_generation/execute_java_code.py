import os 

def main():
    code_name = 'p_8'
    java_code_path = 'compiler_code/439_1/{:s}.java'.format(code_name)
    # execute the code using a system call and record the output as text
    # create a directory for the output
    if not os.path.exists('compiler_code/439_1/output'):
        os.mkdir('compiler_code/439_1/output')
    # execute the code
    os.system('java {:s} output > compiler_code/439_1/output/output_{:s}.txt'.format(java_code_path, code_name))
    pass 

if __name__ == '__main__':
    main()