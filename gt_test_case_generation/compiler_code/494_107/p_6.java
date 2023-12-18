public class COUNTCLUMPS{
public int countClumps(int[] nums){
try {
int same = 0;
    for (int i = 0; i < nums.length - 1; i++)
    {
        if (nums[i] == nums[i + 1])
        {
            same++;
        }
    }
    return same;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countClumps_test(String []s){
System.out.println(countClumps(new int[]{1, 2, 3, 3, 3, 4}));
System.out.println(countClumps(new int[]{1, 2, 2, 2, 3, 4}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 4, 5}));
System.out.println(countClumps(new int[]{1, 1, 1, 2, 3, 4}));
System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 5}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 5, 6}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 5, 5, 5}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 4, 4}));
System.out.println(countClumps(new int[]{1, 1, 2, 3, 4, 5}));
}

public static void main(String []args){
COUNTCLUMPS obj = new COUNTCLUMPS();
obj.countClumps_test(args);
}

}
