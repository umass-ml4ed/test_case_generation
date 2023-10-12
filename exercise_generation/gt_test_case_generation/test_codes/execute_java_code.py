import subprocess

# Define the Java code for the sum67 function
with open('test_code.txt', 'r') as infile:
    java_code = infile.read()

# Test cases
test_cases = [
    [1, 2, 2],
    # [1, 2, 2, 6, 99, 99, 7],
    # [1, 1, 6, 7, 2],
]

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
"""

    # Run the code in jshell and capture the output
    output, errors = jshell_process.communicate(input=java_code_with_test)
    print(output, errors)

    # Check for errors
    if errors:
        print('In error')
        print(f"Error: {errors}")
    else:
        print('In output')
        # Parse the result from the output
        result = int(output.strip())
        results.append(result)


for i, result in enumerate(results):
    print(f"Test Case {i}: {result}")