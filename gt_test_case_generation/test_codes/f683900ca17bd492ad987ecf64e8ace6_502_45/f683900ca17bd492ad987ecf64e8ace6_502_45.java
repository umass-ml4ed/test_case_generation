public class Sum67
{
    public int sum67_incorrect(int[] nums)
    {
        int sum = 0; 
        boolean six = false; 
        for (int i = 0; i < nums.length; i++)
        {
           if (six) 
           {
                if (nums[i] == 7)
                {
                    six = false; 
                }
                else if (nums[i] == 6)
                {
                    six = true;
                }
                else
                {
                    sum += nums[i];
                }
           }
        }
            
     return sum;
    }

    public int sum67_correct(int[] nums)
    {
    int sum = 0; 
    boolean six = false; 
       if (nums.length < 1)
       {
           return 0;
       }

    for (int i = 0; i < nums.length; i++)
    {
        if(nums[i] == 6)
        {
           while(nums[i] != 7)
           {
               i++;
           }
        }
         else{
             sum += nums[i];
           }
    }
    return sum;
    }

public void test_Sum67(String[] args)
{
    int[] test_case_1 = {1, 2, 3};
    int[] test_case_2 = {6, 2, 7, 1};
    int[] test_case_3 = {6, 2, 2, 7, 1};
    int[] test_case_4 = {1, 6, 2, 7, 2};
    int[] test_case_5 = {1, 6, 2, 2, 7, 2};
    int[] test_case_6 = {1, 2, 2, 2, 2};
    int[] test_case_7 = {6, 7};
    int[] test_case_8 = {6, 2, 2, 2, 7};
    int[] test_case_9 = {1, 6, 7, 2};
    int[] test_case_10 = {1, 2, 6, 7, 2};
    int[] test_case_11 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] test_case_12 = {6, 2, 3, 4, 5, 7, 8, 9};
    int[] test_case_13 = {1, 2, 3, 4, 5, 6, 2, 2, 7, 8, 9};
    int[] test_case_14 = {1, 2, 3, 4, 5, 6, 7};
    int[] test_case_15 = {1, 2, 3, 4, 5, 6, 2, 7, 8, 9};

    System.out.println("test_case_1: " + sum67_incorrect(test_case_1) + ", " + sum67_correct(test_case_1));
    System.out.println("test_case_2: " + sum67_incorrect(test_case_2) + ", " + sum67_correct(test_case_2));
    System.out.println("test_case_3: " + sum67_incorrect(test_case_3) + ", " + sum67_correct(test_case_3));
    System.out.println("test_case_4: " + sum67_incorrect(test_case_4) + ", " + sum67_correct(test_case_4));
    System.out.println("test_case_5: " + sum67_incorrect(test_case_5) + ", " + sum67_correct(test_case_5));
    System.out.println("test_case_6: " + sum67_incorrect(test_case_6) + ", " + sum67_correct(test_case_6));
    System.out.println("test_case_7: " + sum67_incorrect(test_case_7) + ", " + sum67_correct(test_case_7));
    System.out.println("test_case_8: " + sum67_incorrect(test_case_8) + ", " + sum67_correct(test_case_8));
    System.out.println("test_case_9: " + sum67_incorrect(test_case_9) + ", " + sum67_correct(test_case_9));
    System.out.println("test_case_10: " + sum67_incorrect(test_case_10) + ", " + sum67_correct(test_case_10));
    System.out.println("test_case_11: " + sum67_incorrect(test_case_11) + ", " + sum67_correct(test_case_11));
    System.out.println("test_case_12: " + sum67_incorrect(test_case_12) + ", " + sum67_correct(test_case_12));
    System.out.println("test_case_13: " + sum67_incorrect(test_case_13) + ", " + sum67_correct(test_case_13));
    System.out.println("test_case_14: " + sum67_incorrect(test_case_14) + ", " + sum67_correct(test_case_14));
    System.out.println("test_case_15: " + sum67_incorrect(test_case_15) + ", " + sum67_correct(test_case_15));
}

    public static void main(String[] args)
    {
        Sum67 s = new Sum67();
        s.test_Sum67(args);
    }
}