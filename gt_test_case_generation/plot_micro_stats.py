'''
Plots for the paper
1) Number of codes versus pass value (p)
2. Error versus pass value (p)
'''

import pandas as pd
import os
import json 
import matplotlib.pyplot as plt 
from collections import defaultdict
import numpy as np


def get_q_dict(df):
    q_dict = dict()
    for i, row in df.iterrows():
        q_dict['{:d}_{:d}'.format(int(row['AssignmentID']), row['ProblemID'])] = row['q']
    return q_dict

def plot_score_data(x_and_score_values, prob, save_dir):
    plt.figure()
    plt.scatter(x_and_score_values['x'], x_and_score_values['y'], label=prob, color='darkblue', marker='o')

    # plt.plot(x_and_score_values['x'], x_and_score_values['y'], label=prob)

    # Adding labels and title
    plt.xlabel('Code Score')
    plt.ylabel('Mean Error')
    plt.title('Mean Error vs Code Score')

    plt.legend()
    plt.savefig(os.path.join(save_dir, '{:s}_error.png'.format(prob)))

    # Close the figure to avoid overlapping plots
    plt.close()

def scatter_and_bar_plot(x_and_score_values, x_and_length_values, prob, save_dir):
    '''
    Scatter plot and the bar plot on the same plot
    '''
    plt.figure()
    x_values = list(x_and_score_values['x'])
    error_values = list(x_and_score_values['y'])
    length_values = list(x_and_length_values['y'])
    # print(x_and_length_values)

    # Create a figure and axis
    fig, ax1 = plt.subplots()

    # Plotting the scatter plot on the left y-axis (ax1)
    ax1.scatter(x_values, error_values, color='darkblue', label='Mean Error')
    ax1.set_xlabel('Ground Truth Code Score')
    ax1.set_ylabel('Mean Error', color='darkblue')
    ax1.tick_params(axis='y', labelcolor='darkblue')

    # Create a second y-axis (ax2) on the right
    ax2 = ax1.twinx()
    bar_width = np.min(np.diff(sorted(x_values)))  # Adjust the width based on your data
    # ax2.vlines(x_values, ymin=0, ymax=length_values, colors='darkgreen', alpha=0.7, label='Number of codes')
    ax2.bar(x_values, length_values, width=bar_width, alpha=0.7, color='darkgreen', label='Number of Codes')
    ax2.set_ylabel('Number of Codes', color='darkgreen')
    ax2.tick_params(axis='y', labelcolor='darkgreen')

    # Adding a legend
    lines, labels = ax1.get_legend_handles_labels()
    lines2, labels2 = ax2.get_legend_handles_labels()
    ax2.legend(lines + lines2, labels + labels2, loc='upper left')

    # save figure
    plt.savefig(os.path.join(save_dir, '{:s}.png'.format(prob)), dpi=1000)

    # Close the figure to avoid overlapping plots
    plt.close()
    

def plot_data(score_dist, prb_q_dict):
    save_dir = 'plots'
    if not os.path.exists(save_dir):
        os.mkdir(save_dir)

    
    for prob, score_dct in score_dist.items():
        # print(score_dct.keys())

        # TODO: Sort the dict based on keys
        score_sorted_dict = dict(sorted(score_dct.items()))
        # print(score_sorted_dict)


        x_and_score_values = defaultdict(list)
        x_and_length_values = defaultdict(list)
        for p, score_lst in score_sorted_dict.items():
            score = p/prb_q_dict[prob]
            # fill x_and_score_values
            x_and_score_values['x'].append(score)
            x_and_score_values['y'].append(sum(score_lst)/len(score_lst))
            # fill x_and_length_values
            x_and_length_values['x'].append(score)
            x_and_length_values['y'].append(len(score_lst))

        # Plot x_and_score_values
        scatter_and_bar_plot(x_and_score_values, x_and_length_values, prob, save_dir)



def main():
    # load all working data
    working_df = pd.read_csv('analyze_data/working_data.csv')


    # get q_dict
    q_dict = get_q_dict(working_df)

    # iterate through data
    main_dir = 'full_evaluation_5'
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