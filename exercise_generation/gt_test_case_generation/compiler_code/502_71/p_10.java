public class CANBALANCE{
public boolean canBalance(int[] nums){
try {
int left = 0;
    int right = 0;
    for(int i = 0; i < nums.length; i++)
    {
        right = right + nums[i];
    }
    for(int i = 0; i < nums.length - 2; i++)
    {
        left = left + nums[i];
        right = right - nums[i];
    }
    if(left == right)
    {
        return true;
    }
    return false;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void canBalance_test(String []s){
System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2, 1}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
System.out.println(canBalance(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
System.out.println(canBalance(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
System.out.println(canBalance(new int[]{10, 10, 10, 20, 10}));
System.out.println(canBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
System.out.println(canBalance(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
}

public static void main(String []args){
CANBALANCE obj = new CANBALANCE();
obj.canBalance_test(args);
}

}
