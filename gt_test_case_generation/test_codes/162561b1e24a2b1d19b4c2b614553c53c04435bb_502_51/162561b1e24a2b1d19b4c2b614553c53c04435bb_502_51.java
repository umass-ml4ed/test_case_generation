import java.util.Arrays;

public class TenRun
{
    public int[] tenRun(int[] nums)
    {
        int thisTen = -1;
        
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 10 == 0)
            {
                thisTen = nums[i];
            }
            else if (thisTen != -1)
            {
                nums[i] = thisTen;
            }
        }
        
        return nums;
    }   
    
    public void test_tenRun(String[] args)
    {
    // Test case 1
    int[] test_case_1 = {2, 10, 3, 4, 20, 5};
    System.out.println(Arrays.toString(tenRun(test_case_1))); // Expected output: [2, 10, 10, 10, 20, 20]

    // Test case 2
    int[] test_case_2 = {10, 1, 20, 2};
    System.out.println(Arrays.toString(tenRun(test_case_2))); // Expected output: [10, 10, 20, 20]

    // Test case 3
    int[] test_case_3 = {10, 1, 9, 20};
    System.out.println(Arrays.toString(tenRun(test_case_3))); // Expected output: [10, 10, 10, 20]

    // Test case 4
    int[] test_case_4 = {1, 2, 50, 1};
    System.out.println(Arrays.toString(tenRun(test_case_4))); // Expected output: [1, 2, 50, 50]

    // Test case 5
    int[] test_case_5 = {10, 10};
    System.out.println(Arrays.toString(tenRun(test_case_5))); // Expected output: [10, 10]

    // Test case 6
    int[] test_case_6 = {10, 2};
    System.out.println(Arrays.toString(tenRun(test_case_6))); // Expected output: [10, 10]

    // Test case 7
    int[] test_case_7 = {0, 2};
    System.out.println(Arrays.toString(tenRun(test_case_7))); // Expected output: [0, 0]

    // Test case 8
    int[] test_case_8 = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(tenRun(test_case_8))); // Expected output: [1, 2, 3, 4, 5]

    // Test case 9
    int[] test_case_9 = {2, 10, 3, 4, 20, 5, 30, 2, 40, 1};
    System.out.println(Arrays.toString(tenRun(test_case_9))); // Expected output: [2, 10, 10, 10, 20, 20, 30, 30, 40, 40]

    // Test case 10
    int[] test_case_10 = {10, 1, 20, 2, 30, 3, 40, 4, 50, 5};
    System.out.println(Arrays.toString(tenRun(test_case_10))); // Expected output: [10, 10, 20, 20, 30, 30, 40, 40, 50, 50]

    // Test case 11
    int[] test_case_11 = {10, 20, 30, 40, 50};
    System.out.println(Arrays.toString(tenRun(test_case_11))); // Expected output: [10, 20, 30, 40, 50]

    // Test case 12
    int[] test_case_12 = {1, 2, 3, 4, 5, 10};
    System.out.println(Arrays.toString(tenRun(test_case_12))); // Expected output: [1, 2, 3, 4, 5, 10]

    // Test case 13
    int[] test_case_13 = {10, 1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(tenRun(test_case_13))); // Expected output: [10, 10, 10, 10, 10, 10]
    }    
    public static void main(String[] args)
    {
        TenRun s = new TenRun();
        s.test_tenRun(args);
    }
}