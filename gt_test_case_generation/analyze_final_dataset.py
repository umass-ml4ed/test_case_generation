import os
import json
import pandas as pd
from collections import Counter

def analyze_working_df(df):
    '''
    Analyze working df for problems and students
    '''
    # group by AssignmentID, ProblemID
    grouped = df.groupby(['AssignmentID', 'ProblemID'])
    all_grps, unique_students_count = [], []
    unique_student_ids = []

    for grp_name, grp_data in grouped: 
        all_grps.append(grp_name)
        unique_students_count.append(len(grp_data['SubjectID'].unique()))
        unique_student_ids.extend(grp_data['SubjectID'].unique().tolist())

    # store as a dataframe
    save_dir = 'final_dataset_info'
    if not os.path.exists(save_dir):
        os.mkdir(save_dir)
    save_df = pd.DataFrame()
    save_df['Group'] = all_grps
    save_df['Unique Students'] = unique_students_count
    save_df.to_csv(os.path.join(save_dir, 'full_analysis.csv'), index=False)

    # sanity check
    assert len(list(set(unique_student_ids))) == len(list(df['SubjectID'].unique()))


def get_count_dict(lst):
    '''
    Returns the sorted dictionary of the count
    '''
    count_dct = dict(Counter(lst))
    # sort in descending order 
    count_dct_sorted = dict(sorted(count_dct.items(), key=lambda item: item[1], reverse=True))
    return count_dct_sorted



def analyze_collected_dataset(data_path, q_dict):
    '''
    Print total number of students for every problem
    '''
    all_groups, all_students = [], []
    all_ps = []
    all_qs = []
    for group in os.listdir(data_path):
        group_path = os.path.join(data_path, group)
        with open(group_path, 'r') as infile:
            group_data = json.load(infile)
        # iterate over problems
        for problem, stud_code_info in group_data.items():
            all_groups.append(problem)
            all_students.append(len(stud_code_info))
            all_ps.append(get_count_dict([code_info.split('_')[0] for code_info in list(stud_code_info.values())]))
            all_qs.append(q_dict[problem])
    
    # save information 
    save_dir = 'final_dataset_info'
    if not os.path.exists(save_dir):
        os.mkdir(save_dir)

    # save_df = pd.DataFrame()
    # save_df['Group'] = all_groups
    # save_df['Unique Students'] = all_students
    # save_df['p distribution'] = all_ps
    # save_df['q'] = all_qs
    # save_df.to_csv(os.path.join(save_dir, 'collected_data_analysis.csv'), index=False)

    json_data = []
    for grp, ustudents, p, q in zip(all_groups, all_students, all_ps, all_qs):
        json_dict = dict()
        json_dict['Group'] = grp
        json_dict['Students'] = ustudents
        json_dict['p distribution'] = p
        json_dict['q'] = q
        json_data.append(json_dict)
    
    with open(os.path.join(save_dir, 'collected_data_analysis.json'), 'w') as outfile:
        json.dump(json_data, outfile, indent=6)



def get_q_dict(df):
    q_dict = dict()
    for i, row in df.iterrows():
        q_dict['{:d}_{:d}'.format(int(row['AssignmentID']), row['ProblemID'])] = row['q']
    return q_dict


def main():
    # General Statistics
    
    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')
    analyze_working_df(working_df)

    # get q_dict
    q_dict = get_q_dict(working_df)

    # analyze collected dataset 
    data_path = 'dataset'
    analyze_collected_dataset(data_path, q_dict)
 

if __name__ == '__main__':
    main()