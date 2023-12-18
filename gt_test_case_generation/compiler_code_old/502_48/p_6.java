public class WITHOUTTEN{
public int[] withoutTen(int[] nums){
try {
int[] newNums = new int[nums.length];
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (j < nums.length) {
            if (nums[j] == 10) {
                i--;
                j++;
            }
            else {
                newNums[i] = nums[j];
                i++;
                j++;
            }
        }
        else {
            newNums[i] = 0;
        }
    }
    return newNums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void withoutTen_test(String []s){
System.out.println(withoutTen(new int[]{1, 10, 10, 2}));
System.out.println(withoutTen(new int[]{10, 2, 10, 3, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 1, 2, 3, 4, 5, 6}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5, 6, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 10, 4, 5, 10}));
System.out.println(withoutTen(new int[]{1, 10, 2, 10, 3, 10, 4, 10, 5}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 20, 30, 40, 50}));
System.out.println(withoutTen(new int[]{10, 1, 10, 2, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 1, 2, 3}));
System.out.println(withoutTen(new int[]{10, 10, 10, 1, 2, 3}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(withoutTen(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 20, 30, 40, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 10, 2, 10, 3}));
}

public static void main(String []args){
WITHOUTTEN obj = new WITHOUTTEN();
obj.withoutTen_test(args);
}

}
