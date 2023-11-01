public class TENRUN{
public int[] tenRun(int[] nums){
try {
int [] newnums = new int[nums.length];
 
    int temp = nums[0];
    for (int i = 0; i < nums.length; i++)
    {
    	if(nums[i] % 10 == 0)
        {
        temp = nums[i];             
        }
        newnums[i] = temp;
    }
return newnums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void tenRun_test(String []s){
System.out.println(tenRun(new int[]{30, 4, 5, 6, 7}));
System.out.println(tenRun(new int[]{3, 4, 5, 30, 6, 7, 40, 8, 9}));
System.out.println(tenRun(new int[]{10, 3, 4, 20, 5}));
System.out.println(tenRun(new int[]{20, 2, 3, 10, 5}));
System.out.println(tenRun(new int[]{2, 3, 4, 20, 5, 6, 30, 7, 8}));
System.out.println(tenRun(new int[]{60, 16, 17, 18, 19}));
System.out.println(tenRun(new int[]{40, 8, 9, 10, 11}));
System.out.println(tenRun(new int[]{80, 24, 25, 26, 27}));
System.out.println(tenRun(new int[]{1, 2, 3, 10, 4, 5, 20, 6, 7}));
System.out.println(tenRun(new int[]{4, 5, 6, 40, 7, 8, 50, 9, 10}));
System.out.println(tenRun(new int[]{50, 12, 13, 14, 15}));
System.out.println(tenRun(new int[]{90, 28, 29, 30, 31}));
System.out.println(tenRun(new int[]{70, 20, 21, 22, 23}));
}

public static void main(String []args){
TENRUN obj = new TENRUN();
obj.tenRun_test(args);
}

}
