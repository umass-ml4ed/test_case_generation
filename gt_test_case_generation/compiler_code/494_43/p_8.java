public class FRONTPIECE{
public int[] frontPiece(int[] nums){
try {
if (nums.length >= 2)
    {
        int [] a = {nums[0], nums[1]};
        return(a);           
    }
    else
    {
        return(nums);
    }
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void frontPiece_test(String []s){
System.out.println(frontPiece(new int[]{16, 17, 18, 19, 20, 21, 22, 23, 24, 25}));
System.out.println(frontPiece(new int[]{8}));
System.out.println(frontPiece(new int[]{1, 2, 3, 4, 5}));
System.out.println(frontPiece(new int[]{9, 10, 11, 12, 13, 14, 15}));
System.out.println(frontPiece(new int[]{6, 7}));
System.out.println(frontPiece(new int[]{}));
System.out.println(frontPiece(new int[]{27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}));
System.out.println(frontPiece(new int[]{26}));
}

public static void main(String []args){
FRONTPIECE obj = new FRONTPIECE();
obj.frontPiece_test(args);
}

}
