public class SUM13{
public int sum13(int[] nums){
try {
int number = 0;
    if (nums.length != 0)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 13)
            {
                number = number + nums[i];
                break;
            }
        }
        return number;
    }
    else
    {
        return number;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sum13_test(String []s){
System.out.println(sum13(new int[]{2, 13, 3}));
System.out.println(sum13(new int[]{3, 4}));
System.out.println(sum13(new int[]{2}));
System.out.println(sum13(new int[]{13, 1}));
System.out.println(sum13(new int[]{1}));
System.out.println(sum13(new int[]{4, 5}));
System.out.println(sum13(new int[]{2, 3}));
System.out.println(sum13(new int[]{5}));
System.out.println(sum13(new int[]{1, 2}));
System.out.println(sum13(new int[]{5, 6}));
System.out.println(sum13(new int[]{3, 4, 13, 5}));
System.out.println(sum13(new int[]{}));
System.out.println(sum13(new int[]{13}));
System.out.println(sum13(new int[]{13, 1, 2}));
System.out.println(sum13(new int[]{3}));
System.out.println(sum13(new int[]{4}));
System.out.println(sum13(new int[]{13, 14}));
}

public static void main(String []args){
SUM13 obj = new SUM13();
obj.sum13_test(args);
}

}
