import os
import json
import pandas as pd

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

def analyze_collected_dataset(data_path):
    '''
    Print total number of students for every problem
    '''
    all_groups, all_students = [], []
    for group in os.listdir(data_path):
        group_path = os.path.join(data_path, group)
        with open(group_path, 'r') as infile:
            group_data = json.load(infile)
        # iterate over problems
        for problem, stud_code_info in group_data.items():
            all_groups.append(problem)
            all_students.append(len(stud_code_info))
    
    # save information 
    save_dir = 'final_dataset_info'
    if not os.path.exists(save_dir):
        os.mkdir(save_dir)

    save_df = pd.DataFrame()
    save_df['Group'] = all_groups
    save_df['Unique Students'] = all_students
    save_df.to_csv(os.path.join(save_dir, 'collected_data_analysis.csv'), index=False)


def main():
    # General Statistics
    
    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')
    analyze_working_df(working_df)

    # analyze collected dataset 
    data_path = 'dataset'
    analyze_collected_dataset(data_path)
 

if __name__ == '__main__':
    main()