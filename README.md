# Using Large Language Models for Student-Code Guided Test Case Generation in Computer Science Education

This repository contains code for the paper - "Using Large Language Models for Student-Code Guided Test Case Generation in Computer Science Education" by [Nischal Ashok Kumar](https://nish-19.github.io/) and [Andrew Lan](https://people.umass.edu/~andrewlan/) published as a part of the AI4ED workshop held with AAAI-2024.

We ground our test case generation approach on the [CSEDM Challenge Dataset](https://sites.google.com/ncsu.edu/csedm-dc-2021/dataset?authuser=0).

If you find our code or paper useful, please consider citing:
```
TODO: Add citation
```

## Contents 

1. [Installation](#installation) 
2. [Test Case Generation](#test-case-generation)
3. [Evaluation](#evaluation)

## Installation

To run the code in the repository you will need to install the [Java](https://www.java.com/en/download/help/log_files.html).

To install the python libraries using ```conda``` execute the following command: 

```
conda env create -f environment.yml
```

## Test Case Generation 

Navigate to the directory and execute the codes:

```
cd gt_test_case_generation
python choose_data.py
python test_case_generation_loop.py
```

This code produces two outputs:
* ```llm_output``` - Directory containing the output of the LLM (bug explanation and corresponding test cases) for selected student codes for every iteration of refinement for every problem. 
* ```compiler_code``` - Directory containing the automatically constructed Java code for testing the generated test cases for the original student buggy code for every problem.

## Evaluation 

Navigate to the directory and execute the codes:

```
cd gt_test_case_generation
python evaluate_and_select.py 
python adjust_group_scores.py
python average_grp_wise_scores.py
python plot_micro_stats.py
```

This code produces two outputs: 
* ```full_evaluation_5``` - contains the error for every problem of all assignment across for all students. 
* ```plots``` - contains the plots used in our paper. 