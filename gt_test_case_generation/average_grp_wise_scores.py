import json 
import os 
from collections import defaultdict
from statistics import mean, variance

def main():
    dirs = ['full_evaluation_5'] 
    all_scores = defaultdict(list)
    for dir in dirs:
        path = os.path.join(dir, 'consolidated_new_scores.json')
        with open(path, 'r') as f:
            scores = json.load(f)
        for problem, score in scores.items():
            all_scores[problem.split('_')[0]].append(score)
    score_info = dict()
    for problem, scores in all_scores.items():
        score_info[problem] = {'mean':mean(scores), 'variance':variance(scores)}
    
    # save the avg scores dict
    with open('full_evaluation_5/average_scores.json', 'w') as outfile:
        json.dump(score_info, fp=outfile, indent=6)


if __name__ == '__main__':
    main()