import subprocess
import json

# Define the Java code for the sum67 function
with open('test_code.txt', 'r') as infile:
    java_code = infile.read()

# Test cases
with open('step1_output.json', 'r') as infile:
    test_case_json = json.load(infile)

test_cases = []
for key, value in test_case_json.items():
    test_cases.append(value['value'])

# Create a list to store the results
results = []

# Run the Java code in jshell for each test case
for test_case in test_cases:
    # Create a jshell process
    jshell_process = subprocess.Popen(['jshell'], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

    # Define the Java code and test case
    java_code_with_test = java_code + f"""
int[] nums = {str(test_case).replace('[', '{').replace(']', '}')};
int result = sum67(nums);
System.out.println(result);
"""

    # Run the code in jshell and capture the output and errors
    output, errors = jshell_process.communicate(input=java_code_with_test)
    errors = False

    # Check for errors
    if errors:
        print(f"Error: {errors}")
    else:
        clean_output = output.strip()
        # Parse the result from the output
        result = int(clean_output.split('\n')[-1])
        results.append(result)

# Print the results
for i, result in enumerate(results, start=1):
    print(f"Test Case {i}: {result}")
