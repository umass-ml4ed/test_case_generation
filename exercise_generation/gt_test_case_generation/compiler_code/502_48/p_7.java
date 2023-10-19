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
System.out.println(withoutTen(new int[]{1, 10, 10, 2}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5}));
System.out.println(withoutTen(new int[]{10, 1, 10, 2, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 1, 2, 3}));
System.out.println(withoutTen(new int[]{1, 2, 3, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(withoutTen(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 1, 2, 3, 4, 5, 6}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5, 6, 10, 10, 10, 10}));
}

public static void main(String []args){
WITHOUTTEN obj = new WITHOUTTEN();
obj.withoutTen_test(args);
}

}
