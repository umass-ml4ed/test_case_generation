import pandas as pd
import os
import json 
import matplotlib.pyplot as plt 
from collections import defaultdict

def get_q_dict(df):
    q_dict = dict()
    for i, row in df.iterrows():
        q_dict['{:d}_{:d}'.format(int(row['AssignmentID']), row['ProblemID'])] = row['q']
    return q_dict

def plot_data(score_dist, prb_q_dict):
    save_dir = 'plots'
    if not os.path.exists(save_dir):
        os.mkdir(save_dir)

    
    for prob, score_dct in score_dist.items():
        # print(score_dct.keys())

        # TODO: Sort the dict based on keys
        score_sorted_dict = dict(sorted(score_dct.items()))
        # print(score_sorted_dict)


        x_and_y_values = defaultdict(list)
        for p, score_lst in score_sorted_dict.items():
            x_and_y_values['x'].append(p/prb_q_dict[prob])
            x_and_y_values['y'].append(sum(score_lst)/len(score_lst))
        # TODO: plot the data 
        # Plotting the data
        # Create a new figure for each iteration
        # print(prob_wise_avg_score[prob].keys())
        # print(prob_wise_avg_score[prob].values())
        # print(x_and_y_values['x'])
        # print(x_and_y_values['y'])


        plt.figure()
        plt.scatter(x_and_y_values['x'], x_and_y_values['y'], label=prob, color='blue', marker='o')

        # plt.plot(x_and_y_values['x'], x_and_y_values['y'], label=prob)

        # Adding labels and title
        plt.xlabel('Code Score')
        plt.ylabel('Mean Error')
        plt.title('Mean Error vs Code Score')

        plt.legend()
        plt.savefig(os.path.join(save_dir, '{:s}.png'.format(prob)))

        # Close the figure to avoid overlapping plots
        plt.close()



def main():
    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')


    # get q_dict
    q_dict = get_q_dict(working_df)

    # iterate through data
    main_dir = 'new_evaluation_5'
    score_dist = dict()
    prb_q_dict = dict()
    for assgn in os.listdir(main_dir):
        if '.json' in assgn:
            continue
        assgn_path = os.path.join(main_dir, assgn)
        grp_wise_std_scores = os.path.join(assgn_path, 'grp_wise_p_student_scores.json')
        with open(grp_wise_std_scores, 'r') as infile:
            json_data = json.load(infile)
        for prob, scores in json_data.items():
            score_dist[prob] = defaultdict(list)
            q = q_dict[prob]
            prb_q_dict[prob] = q
            for score_info, score_lst in scores.items():
                p = int(score_info.split(',')[0])
                if score_lst[0] > 1:
                    consider_score = score_lst[0] - 1
                else:
                    consider_score = score_lst[0]
                score_dist[prob][p].append(consider_score)

    plot_data(score_dist, prb_q_dict)


 

if __name__ == '__main__':
    main()