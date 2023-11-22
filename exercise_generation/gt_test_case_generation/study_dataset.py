from generate_compiler_code import *

def main():
    final_dataset = 'final_dataset_info/collected_data_analysis.json' 
    with open(final_dataset, 'r') as f:
        data = json.load(f)
    for info in data:
        grp = info['Group']
        grp_str = "({:s})".format(grp.replace('_', ', '))
        llm_output_path = 'llm_output/{:s}/t1'.format(grp)
        file_names = []
        for file in os.listdir(llm_output_path):
            if file.endswith('.json'):
                file_names.append(int(file.split('.')[0]))
        all_test_cases = extract_test_cases(grp_str, 2, file_names)
        print('{:s}: {:d}, {:d}'.format(grp, len(all_test_cases), len(all_test_cases)*info['Students']))
if __name__ == '__main__':
    main()