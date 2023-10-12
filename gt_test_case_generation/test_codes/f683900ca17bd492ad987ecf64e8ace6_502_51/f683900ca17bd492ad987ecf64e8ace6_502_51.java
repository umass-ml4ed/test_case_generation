import java.util.Arrays;

public class TenRun
{
    public int[] tenRun_incorrect(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 10 == 0)
            {
            for (int j = i; j < nums.length && !(nums[j] % 10 == 0); j++) 
                {
                    nums[j] = nums[i];
                }
            }
        }
        
        return nums;
        
    }

    public int[] tenRun_correct(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 10 == 0)
            {
            for (int j = i+1; j < nums.length && !(nums[j] % 10 == 0); j++) 
                {
                    nums[j] = nums[i];
                }
            }
        }
        
        return nums;
    }
    
    public void test_tenRun(String[] args)
    {
        int[] test_case_1 = {2, 3, 4, 5};
        int[] test_case_2 = {1, 2, 3, 10};
        int[] test_case_3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] test_case_4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test_case_5 = {1, 2, 3, 4, 5, 10};
        int[] test_case_6 = {10, 1, 2, 3};
        int[] test_case_7 = {2, 10, 3, 4, 20, 5};
        int[] test_case_8 = {10, 1, 20, 2};
        int[] test_case_9 = {10, 1, 9, 20};
        int[] test_case_10 = {1, 20, 50, 1};
        int[] test_case_11 = {10, 10};
        int[] test_case_12 = {10, 2};
        int[] test_case_13 = {0, 2};
        
        // For test case 1
        int [] test_case_1_copy = test_case_1.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_1)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_1_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_1), tenRun_correct(test_case_1_copy)));

        // For test case 2
        int [] test_case_2_copy = test_case_2.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_2)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_2_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_2), tenRun_correct(test_case_2_copy)));

        // For test case 3
        int [] test_case_3_copy = test_case_3.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_3)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_3_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_3), tenRun_correct(test_case_3_copy)));

        // For test case 4
        int [] test_case_4_copy = test_case_4.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_4)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_4_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_4), tenRun_correct(test_case_4_copy)));

        // For test case 5
        int [] test_case_5_copy = test_case_5.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_5)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_5_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_5), tenRun_correct(test_case_5_copy)));

        // For test case 6
        int [] test_case_6_copy = test_case_6.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_6)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_6_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_6), tenRun_correct(test_case_6_copy)));

        // For test case 7
        int [] test_case_7_copy = test_case_7.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_7)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_7_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_7), tenRun_correct(test_case_7_copy)));

        // For test case 8
        int [] test_case_8_copy = test_case_8.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_8)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_8_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_8), tenRun_correct(test_case_8_copy)));

        // For test case 9
        int [] test_case_9_copy = test_case_9.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_9)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_9_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_9), tenRun_correct(test_case_9_copy)));

        // For test case 10
        int [] test_case_10_copy = test_case_10.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_10)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_10_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_10), tenRun_correct(test_case_10_copy)));

        // For test case 11
        int [] test_case_11_copy = test_case_11.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_11)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_11_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_11), tenRun_correct(test_case_11_copy)));

        // For test case 12
        int [] test_case_12_copy = test_case_12.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_12)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_12_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_12), tenRun_correct(test_case_12_copy)));

        // For test case 13
        int [] test_case_13_copy = test_case_13.clone();
        System.out.println(Arrays.toString(tenRun_incorrect(test_case_13)));
        System.out.println(Arrays.toString(tenRun_correct(test_case_13_copy)));
        System.out.println(Arrays.equals(tenRun_incorrect(test_case_13), tenRun_correct(test_case_13_copy)));
    }

    public static void main(String[] args)
    {
        TenRun s = new TenRun();
        s.test_tenRun(args);
    }
}