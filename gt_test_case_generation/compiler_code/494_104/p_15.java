public class ZEROMAX{
private int a = 0;
public int[] zeroMax(int[] nums){
try {
for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (max < nums[j] && nums[j] % 2 != 0) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void zeroMax_test(String []s){
System.out.println(zeroMax(new int[]{0, 5, 0, 3}));
System.out.println(zeroMax(new int[]{0}));
System.out.println(zeroMax(new int[]{1, 0, 3, 0, 5, 0}));
System.out.println(zeroMax(new int[]{0, 1, 0}));
System.out.println(zeroMax(new int[]{1, 0, 1, 0, 1, 0}));
System.out.println(zeroMax(new int[]{0, 0, 0}));
System.out.println(zeroMax(new int[]{2, 0, 0, 0}));
System.out.println(zeroMax(new int[]{0, 4, 0, 3}));
System.out.println(zeroMax(new int[]{1, 0, 0, 0}));
System.out.println(zeroMax(new int[]{2, 0, 4, 0, 6, 0}));
System.out.println(zeroMax(new int[]{1, 0, 3, 0, 5, 0, 7, 0}));
System.out.println(zeroMax(new int[]{0, 1, 5}));
System.out.println(zeroMax(new int[]{0, 2, 5}));
System.out.println(zeroMax(new int[]{0, 0, 1}));
System.out.println(zeroMax(new int[]{2, 0, 2, 0, 2, 0}));
}

public static void main(String []args){
ZEROMAX obj = new ZEROMAX();
obj.zeroMax_test(args);
}

}
