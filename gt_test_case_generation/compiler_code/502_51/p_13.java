public class TENRUN{
public int[] tenRun(int[] nums){
try {
if (nums.length < 1) {
            return nums;
        }

        int runner = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (runner % 10 != 0) {
                runner = nums[i];
            }
            if (nums[i] % 10 == 0) {
                runner = nums[i];
            }
            nums[i] = runner;
        }
        return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void tenRun_test(String []s){
System.out.println(tenRun(new int[]{90, 19, 20, 100, 21}));
System.out.println(tenRun(new int[]{50, 11, 12, 60, 13}));
System.out.println(tenRun(new int[]{20, 5, 6, 30, 7}));
System.out.println(tenRun(new int[]{10, 3, 4, 20, 5}));
System.out.println(tenRun(new int[]{70, 15, 16, 80, 17}));
System.out.println(tenRun(new int[]{80, 17, 18, 90, 19}));
System.out.println(tenRun(new int[]{100, 21, 22, 110, 23}));
System.out.println(tenRun(new int[]{2, 10, 3, 4, 20, 5}));
System.out.println(tenRun(new int[]{40, 9, 10, 50, 11}));
System.out.println(tenRun(new int[]{110, 23, 24, 120, 25}));
System.out.println(tenRun(new int[]{30, 7, 8, 40, 9}));
System.out.println(tenRun(new int[]{10}));
System.out.println(tenRun(new int[]{60, 13, 14, 70, 15}));
}

public static void main(String []args){
TENRUN obj = new TENRUN();
obj.tenRun_test(args);
}

}
