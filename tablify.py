from tabulate import tabulate


def create_table(output_1, output_2, match_output=None):
    '''
    Input: Lists of outputs

    Output: Tabular form of the output comparisions
    '''
    if match_output != None:
        # Combine the lists into a list of rows
        table_data = list(zip(output_1, output_2, match_output))

        # Define the headers for the table
        headers = ["Partially Correct Code Output", "Perfect Code Output", "Output Matching"]

        # Generate the tabular representation as a string
        table_str = tabulate(table_data, headers, tablefmt="plain_grid")
    else:
        # Combine the lists into a list of rows
        table_data = list(zip(output_1, output_2))

        # Define the headers for the table
        headers = ["Partially Correct Code Output", "Perfect Code Output"]

        # Generate the tabular representation as a string
        table_str = tabulate(table_data, headers, tablefmt="plain_grid")
    
    return table_str


# def main():
#     # Sample data (replace this with your actual data)
#     output_1 = ["A", "B", "C"]
#     output_2 = [1, 2, 3]
#     match_output = [True, False, True]
#     print(create_table(output_1, output_2, match_output))


# if __name__ == '__main__':
#     main()
