'''
To adjust the scores of the group by treating scores above 1 different
'''

import json 
import os 
from collections import defaultdict

def main():
    eval_path = 'full_evaluation_5'
    problem_wise_score = defaultdict(int)
    for group in os.listdir(eval_path):
        if '.json' in group:
            continue
        json_path = os.path.join(eval_path, group, 'grp_wise_p_student_scores.json')
        with open(json_path, 'r') as infile:
            json_data = json.load(infile)
        for problem, scores in json_data.items():
            for score_details, score in scores.items():
                if score[0] > 1:
                    problem_wise_score[problem] += (score[0]-1)
                else:
                    problem_wise_score[problem] += score[0]
            problem_wise_score[problem] = problem_wise_score[problem]/len(scores) # computing the average score
    
    output_path = os.path.join(eval_path, 'consolidated_new_scores.json')
    with open(output_path, 'w') as outfile:
        json.dump(problem_wise_score, outfile, indent=6)
                


if __name__ == '__main__':
    main()