public class SAMEENDS{
public boolean sameEnds(int[] nums, int n){
try {
if (n == 0)
    {
        if (nums[0] == nums[nums.length - 1])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else if (n == 1)
    {
        if (nums[0] == nums[nums.length - n])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else if (n == 2)
    {
        if (nums[0] == nums[nums.length - n] && nums[n - 1] == nums[nums.length - 1])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else if (n == 3)
    {
        if (nums[0] == nums[nums.length - n] && nums[n - 1] == nums[nums.length - 1] && nums[n-2] == nums[nums.length-2])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else if (n == 4)
    {
        if (nums[0] == nums[nums.length - n] && nums[n - 1] == nums[nums.length - 1] && nums[n-2] == nums[nums.length-2] && nums[n-3] == nums[nums.length-3])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else if (n == 5)
    {
        if (nums[0] == nums[nums.length - n] && nums[n - 1] == nums[nums.length - 1] && nums[n-2] == nums[nums.length-2] && nums[n-3] == nums[nums.length-3] && nums[n-4] == nums[nums.length-4])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    {
        return false;
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void sameEnds_test(String []s){
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3}, 3));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}, 6));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}, 5));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, 1));
System.out.println(sameEnds(new int[]{1, 2, 3, 1, 2, 3, 4, 5, 6, 7}, 1));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3}, 1));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4}, 2));
System.out.println(sameEnds(new int[]{1, 2, 1, 2, 3, 4, 5, 6, 7, 8}, 2));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4}, 4));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, 5));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5, 6}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2}, 2));
System.out.println(sameEnds(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4));
}

public static void main(String []args){
SAMEENDS obj = new SAMEENDS();
obj.sameEnds_test(args);
}

}
