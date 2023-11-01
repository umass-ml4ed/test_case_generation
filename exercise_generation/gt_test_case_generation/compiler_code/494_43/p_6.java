public class FRONTPIECE{
public int[] frontPiece(int[] nums){
try {
int[] sum = new int [nums.length-1];
    if (nums.length ==1)
        return nums;
    if (nums.length == 2)
        return nums;  
    else
       // int[] sum = new int [nums.length];
        sum[0] = nums[0];
        sum[1] = nums[1];
        return sum;
    
   // int[] sum = new int [nums.length-1];
    //for (int i = 0; i < nums.length; i++)
      //  sum[i] = nums[i];
   //return sum;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void frontPiece_test(String []s){
System.out.println(frontPiece(new int[]{3, 4}));
System.out.println(frontPiece(new int[]{8}));
System.out.println(frontPiece(new int[]{11, 12, 13}));
System.out.println(frontPiece(new int[]{6, 7}));
System.out.println(frontPiece(new int[]{9, 10}));
System.out.println(frontPiece(new int[]{1, 2}));
System.out.println(frontPiece(new int[]{5}));
System.out.println(frontPiece(new int[]{}));
}

public static void main(String []args){
FRONTPIECE obj = new FRONTPIECE();
obj.frontPiece_test(args);
}

}
