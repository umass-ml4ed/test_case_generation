public class SHIFTLEFT{
public int[] shiftLeft(int[] nums){
try {
int store = 0;
    int start = nums[0];
    for(int x = 1; x < nums.length-1; x++)
    {
        store = nums[x];
        nums[x] = nums[x+1];
        nums[x-1] = store; 
    }
    nums[nums.length-1] = start;
    return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void shiftLeft_test(String []s){
System.out.println(shiftLeft(new int[]{31, 32, 33, 34, 35, 36, 37, 38, 39}));
System.out.println(shiftLeft(new int[]{73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}));
System.out.println(shiftLeft(new int[]{23, 24, 25, 26, 27, 28, 29, 30}));
System.out.println(shiftLeft(new int[]{1, 2, 3, 4}));
System.out.println(shiftLeft(new int[]{50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60}));
System.out.println(shiftLeft(new int[]{5, 6, 7, 8, 9}));
System.out.println(shiftLeft(new int[]{10, 11, 12, 13, 14, 15}));
System.out.println(shiftLeft(new int[]{61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72}));
System.out.println(shiftLeft(new int[]{}));
System.out.println(shiftLeft(new int[]{40, 41, 42, 43, 44, 45, 46, 47, 48, 49}));
System.out.println(shiftLeft(new int[]{16, 17, 18, 19, 20, 21, 22}));
}

public static void main(String []args){
SHIFTLEFT obj = new SHIFTLEFT();
obj.shiftLeft_test(args);
}

}
