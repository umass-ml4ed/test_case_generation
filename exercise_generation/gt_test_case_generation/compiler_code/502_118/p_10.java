public class SHIFTLEFT{
public int[] shiftLeft(int[] nums){
try {
int[] array = new int[nums.length];
    int a = nums[0];
    int b = 0;
    for (int i = 1; i < nums.length; i++)
    {
        array[b] = nums[i];
        b++;
    }
    array[b] = a;
    return array;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void shiftLeft_test(String []s){
System.out.println(shiftLeft(new int[]{26, 27, 28, 29, 30}));
System.out.println(shiftLeft(new int[]{11, 12, 13, 14, 15}));
System.out.println(shiftLeft(new int[]{1, 2, 3, 4, 5}));
System.out.println(shiftLeft(new int[]{16, 17, 18, 19, 20}));
System.out.println(shiftLeft(new int[]{21, 22, 23, 24, 25}));
System.out.println(shiftLeft(new int[]{6, 7, 8, 9, 10}));
System.out.println(shiftLeft(new int[]{}));
System.out.println(shiftLeft(new int[]{36, 37, 38, 39, 40}));
System.out.println(shiftLeft(new int[]{46, 47, 48, 49, 50}));
System.out.println(shiftLeft(new int[]{31, 32, 33, 34, 35}));
System.out.println(shiftLeft(new int[]{41, 42, 43, 44, 45}));
}

public static void main(String []args){
SHIFTLEFT obj = new SHIFTLEFT();
obj.shiftLeft_test(args);
}

}
