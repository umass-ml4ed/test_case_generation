public class FRONTPIECE{
public int[] frontPiece(int[] nums){
try {
if (nums.length >= 2)
    {
        return(nums);           
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
System.out.println(frontPiece(new int[]{0}));
System.out.println(frontPiece(new int[]{1, 2, 3, 4, 5}));
System.out.println(frontPiece(new int[]{1}));
System.out.println(frontPiece(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
System.out.println(frontPiece(new int[]{-1, -2}));
System.out.println(frontPiece(new int[]{1, 2, 3}));
System.out.println(frontPiece(new int[]{1, 2}));
System.out.println(frontPiece(new int[]{}));
}

public static void main(String []args){
FRONTPIECE obj = new FRONTPIECE();
obj.frontPiece_test(args);
}

}
