public class TENRUN{
public int[] tenRun(int[] nums){
try {
boolean key = false;
    for (int i = 0; i < nums.length; i++)
    {
        if (key)
        {
            if (nums[i] > 10 && nums[i] % 10 == 0)
            {
                key = false;
            }
            else
            {
                nums[i] = 10;
            }
        }
        else if (nums[i] != 10 || nums[i] % 10 != 0)
        {
            nums[i] = nums[i];
        }
        else
        {
            key = true;
        }
    }
    return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void tenRun_test(String []s){
System.out.println(tenRun(new int[]{50, 49, 48, 47, 46, 45}));
System.out.println(tenRun(new int[]{60, 59, 58, 57, 56, 55}));
System.out.println(tenRun(new int[]{20, 19, 18, 17, 16, 15}));
System.out.println(tenRun(new int[]{2, 10, 3, 4, 5, 6}));
System.out.println(tenRun(new int[]{1, 2, 3, 10, 5, 6}));
System.out.println(tenRun(new int[]{1, 2, 10, 4, 5, 6}));
System.out.println(tenRun(new int[]{1, 2, 3, 4, 10, 6}));
System.out.println(tenRun(new int[]{10, 9, 8, 7, 6, 5}));
System.out.println(tenRun(new int[]{40, 39, 38, 37, 36, 35}));
System.out.println(tenRun(new int[]{70, 69, 68, 67, 66, 65}));
System.out.println(tenRun(new int[]{1, 2, 3, 4, 5, 10}));
System.out.println(tenRun(new int[]{10, 1, 2, 3, 4, 5}));
System.out.println(tenRun(new int[]{30, 29, 28, 27, 26, 25}));
}

public static void main(String []args){
TENRUN obj = new TENRUN();
obj.tenRun_test(args);
}

}
