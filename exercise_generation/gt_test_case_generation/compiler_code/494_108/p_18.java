public class FIX45{
public int[] fix45(int[] nums){
try {
int i = 0;
    int a = 0;
    while (a < nums.length && nums[a] != 5)
    {
        a++;
    }
    while (i < nums.length)
    {
        if (nums[i] == 4)
        {
            int n = nums[i + 1];
            nums[i + 1] = nums[a];
            nums[a] = n;
        }
        while ((a < nums.length && nums[a] != 5) || a == i + 1)
        {
            a++;
        }
        i++;
    }
    return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void fix45_test(String []s){
System.out.println(fix45(new int[]{4, 5, 4, 1, 5, 3, 2}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 3}));
System.out.println(fix45(new int[]{4, 5, 4, 1, 5, 3}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 3, 2}));
System.out.println(fix45(new int[]{4, 1, 5, 4, 5}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5, 3, 2}));
System.out.println(fix45(new int[]{5, 4, 1, 4, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 1, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 5, 3, 2, 1}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5, 3, 2, 1}));
System.out.println(fix45(new int[]{4, 5, 4, 5}));
System.out.println(fix45(new int[]{4, 1, 5, 4, 5, 3}));
System.out.println(fix45(new int[]{4, 1, 5, 4, 5, 3, 2, 1}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5, 3}));
System.out.println(fix45(new int[]{4, 5, 4, 1, 5, 3, 2, 1}));
System.out.println(fix45(new int[]{4, 1, 5, 4, 5, 3, 2}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5}));
System.out.println(fix45(new int[]{4, 5}));
System.out.println(fix45(new int[]{4, 4, 5, 5}));
}

public static void main(String []args){
FIX45 obj = new FIX45();
obj.fix45_test(args);
}

}
