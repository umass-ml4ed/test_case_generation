public class Sum67
{
    public static int sum67(int[] nums)
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
    public static void main(String[] args)
    {
        int[] nums = {6, 1, 2, 3, 4, 5, 7, 8, 9, 6, 1, 2, 3, 4, 5, 7};
        System.out.println(sum67(nums));
    }
}
