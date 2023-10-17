import pandas as pd 
from ast import literal_eval
import json
from collections import defaultdict

def choose_indices(df):
    """
    Choose particular p (number of passed test cases)
    Choose three codes - median, median of the upper quartile, most-1
    """
    group_wise_indices = dict()
    for i, row in df.iterrows():
        unique_p_str = row['Unique p']
        unique_p = literal_eval(unique_p_str)
        q = row['q']
        try:
            assert unique_p[-1] == q # code where all test cases pass
        except AssertionError:
            print(i, unique_p_str, q)
        # chose data above the median
        least = unique_p[len(unique_p)//2]
        most = unique_p[-2]
        above_median_range = len(unique_p)-2 - len(unique_p)//2
        middle = unique_p[len(unique_p)//2:-1][above_median_range//2]
        choose_indices = [least, middle, most, q]
        # unique choose_indices - without changing the order
        choose_indices = sorted(list(set(choose_indices)))
        # store data
        group = str((row['AssignmentID'], row['ProblemID']))
        group_wise_indices[group] = choose_indices
    return group_wise_indices

def choose_data_per_group(df, group_wise_indices):
    '''
    Choose representative code for every group satisfying the indices criteria
    '''
    # group by AssignmentID and ProblemID
    df = df.groupby(['AssignmentID', 'ProblemID'])
    # iterate over groups
    group_wise_data = dict()
    for raw_group, data in df:
        group = str((int(raw_group[0]), int(raw_group[1])))
        choosen_indices = group_wise_indices[group]
        choosen_score = [index/choosen_indices[-1] for index in choosen_indices]
        code_ids = []
        max_code_per_score = 5
        for c_score in choosen_score:
            ctr = 0
            # iterate over rows
            local_code_ids = []
            for i, row in data.iterrows():
                score = row['Score'] 
                if abs(score - c_score) < 0.0001 and ctr < max_code_per_score:
                    local_code_ids.append(row['CodeStateID'])
                    ctr += 1
            code_ids.append(local_code_ids)
        group_wise_data[group] = code_ids    
        assert len(code_ids) == len(choosen_indices) # sanity check
    return group_wise_data

def main():
    # Read code_details.xlsx
    df = pd.read_excel('analyze_data/code_details.xlsx', sheet_name='Sheet1')
    print(df.head())

    # Choose indices
    group_wise_indices = choose_indices(df)
    print(group_wise_indices)

    # Load working df
    working_df = pd.read_csv('analyze_data/working_data.csv')
    print(working_df.head())

    # Choose data per group
    group_wise_data = choose_data_per_group(working_df, group_wise_indices)
    print(group_wise_data)

    # accumulate data
    save_data = defaultdict(dict)
    for group, code_ids in group_wise_data.items():
        save_data[group]['code_ids'] = code_ids
        save_data[group]['p'] = group_wise_indices[group]

    # save group_wise_data
    with open('analyze_data/group_wise_code_states_id.json', 'w') as f:
        json.dump(save_data, f, indent=4)


if __name__ == "__main__":
    main()