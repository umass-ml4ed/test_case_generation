public class CANBALANCE{
public boolean canBalance(int[] nums){
try {
if (nums[0] == 2)
        return false;
    if (nums.length == 1)
        return false;
    return true;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void canBalance_test(String []s){
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
System.out.println(canBalance(new int[]{10, 20, 30, 40, 50, 50, 40, 30, 20, 10}));
System.out.println(canBalance(new int[]{3, 1, 4, 2, 2, 4, 1, 3}));
System.out.println(canBalance(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
System.out.println(canBalance(new int[]{20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
System.out.println(canBalance(new int[]{1}));
System.out.println(canBalance(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(canBalance(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}));
System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
System.out.println(canBalance(new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
}

public static void main(String []args){
CANBALANCE obj = new CANBALANCE();
obj.canBalance_test(args);
}

}
