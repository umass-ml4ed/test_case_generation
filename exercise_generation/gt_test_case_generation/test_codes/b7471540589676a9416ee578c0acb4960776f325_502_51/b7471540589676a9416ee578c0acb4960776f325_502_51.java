import java.util.Arrays;

public class TenRun
{
    public int[] tenRun(int[] nums)
    {
        int check = 1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]%10 == 0)
            {
                check = nums[i];
            }
            if (check%10 == 0)
            {
                nums[i] = check;
            }
        }
        return nums;
    }
    
    public void test_tenRun(String[] args)
    {
        // Test case 1
        int[] test_case_1 = {2, 10, 3, 4, 20, 5};
        System.out.println(Arrays.toString(tenRun(test_case_1)));

        // Test case 2
        int[] test_case_2 = {10, 1, 20, 50};
        System.out.println(Arrays.toString(tenRun(test_case_2)));

        // Test case 3
        int[] test_case_3 = {10, 1, 9, 20};
        System.out.println(Arrays.toString(tenRun(test_case_3)));

        // Test case 4
        int[] test_case_4 = {1, 2, 50, 1};
        System.out.println(Arrays.toString(tenRun(test_case_4)));

        // Test case 5
        int[] test_case_5 = {10, 10};
        System.out.println(Arrays.toString(tenRun(test_case_5)));

        // Test case 6
        int[] test_case_6 = {10, 2};
        System.out.println(Arrays.toString(tenRun(test_case_6)));

        // Test case 7
        int[] test_case_7 = {0, 2};
        System.out.println(Arrays.toString(tenRun(test_case_7)));

        // Test case 8
        int[] test_case_8 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(tenRun(test_case_8)));

        // Test case 9
        int[] test_case_9 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(tenRun(test_case_9)));

        // Test case 10
        int[] test_case_10 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(tenRun(test_case_10)));

        // Test case 11
        int[] test_case_11 = {1, 2, 3, 4, 5, 10};
        System.out.println(Arrays.toString(tenRun(test_case_11)));

        // Test case 12
        int[] test_case_12 = {10, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(tenRun(test_case_12)));

        // Test case 13
        int[] test_case_13 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(tenRun(test_case_13)));
    }
    public static void main(String[] args)
    {
        TenRun s = new TenRun();
        s.test_tenRun(args);
    }
}