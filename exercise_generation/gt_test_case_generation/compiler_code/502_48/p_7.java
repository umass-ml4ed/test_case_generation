public class WITHOUTTEN{
public int[] withoutTen(int[] nums){
try {
int[] newNums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
    	if (nums[i] == 10) {
        	nums[i] = 0;
        }
    }
    int start = 0;
    int count = 0;
    for (int j = 0; j < nums.length; j++) {
    	if (nums[j] != 0) {
            newNums[start] = nums[j];
            start++;
        }
        else {
        	count++;
        }
    }
    
    for (int x = count; x < nums.length; x++) {
    	newNums[x] = nums[x];
    }
    return newNums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void withoutTen_test(String []s){
System.out.println(withoutTen(new int[]{6, 7, 8, 9, 0}));
System.out.println(withoutTen(new int[]{26, 27, 28, 29, 30}));
System.out.println(withoutTen(new int[]{11, 12, 13, 14, 15}));
System.out.println(withoutTen(new int[]{10, 2, 10, 3, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5}));
System.out.println(withoutTen(new int[]{1, 2, 3, 10, 10}));
System.out.println(withoutTen(new int[]{16, 17, 18, 19, 20}));
System.out.println(withoutTen(new int[]{21, 22, 23, 24, 25}));
System.out.println(withoutTen(new int[]{1, 10, 2, 10, 3}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{31, 32, 33, 34, 35}));
}

public static void main(String []args){
WITHOUTTEN obj = new WITHOUTTEN();
obj.withoutTen_test(args);
}

}
