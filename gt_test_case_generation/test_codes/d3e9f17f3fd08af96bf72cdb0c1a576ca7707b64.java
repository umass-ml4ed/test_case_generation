public class Sum67
{
    public static int sum67(int[] nums)
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

    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum67(nums));
    }
}