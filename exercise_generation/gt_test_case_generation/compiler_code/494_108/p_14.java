public class FIX45{
public int[] fix45(int[] nums){
try {
int fourCount = 0;
    int fiveCount = 0;
    int z = 0;
    
    for (int i = 0; i < nums.length - 1; i++)
    {
        if (nums[i] == 4 && nums[i+1] != 5)
        {
            for (z = z; !(nums[z] == 5 && nums[z-1] != 4 && (z == 0 || z > 0)); z++);
            {
                nums[z] = nums[i+1];
                nums[i+1] = 5;
            }
        }
    }
    return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void fix45_test(String []s){
System.out.println(fix45(new int[]{5, 4, 1, 4, 5}));
System.out.println(fix45(new int[]{5, 4, 1, 4, 5, 2, 4, 3, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 1, 5}));
System.out.println(fix45(new int[]{4, 2, 4, 5, 2, 5}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5}));
System.out.println(fix45(new int[]{5, 4, 2, 2, 5, 4, 5}));
System.out.println(fix45(new int[]{1, 4, 1, 5, 4, 5}));
System.out.println(fix45(new int[]{4, 5}));
System.out.println(fix45(new int[]{1, 4, 1, 5, 4, 2, 2, 5}));
System.out.println(fix45(new int[]{1, 4, 1, 5, 4, 5, 2, 2, 2}));
System.out.println(fix45(new int[]{5, 4, 2, 4, 2, 5, 5}));
System.out.println(fix45(new int[]{1, 4, 1, 5, 4, 2, 5, 2}));
System.out.println(fix45(new int[]{5, 4, 4, 1, 5}));
System.out.println(fix45(new int[]{4, 2, 4, 2, 5, 5}));
System.out.println(fix45(new int[]{4, 4, 5, 5}));
System.out.println(fix45(new int[]{4, 2, 2, 5, 4, 5}));
System.out.println(fix45(new int[]{1, 4, 1, 5, 4, 5, 2, 2}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5, 2, 4, 3, 5}));
}

public static void main(String []args){
FIX45 obj = new FIX45();
obj.fix45_test(args);
}

}
