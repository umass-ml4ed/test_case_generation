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
            }
            if (nums[i] == 13 && i+1 < nums.length)
            {
                i++;
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
System.out.println(sum13(new int[]{1, 13, 3, 4, 5}));
System.out.println(sum13(new int[]{1, 2, 13, 4, 5}));
System.out.println(sum13(new int[]{1, 2, 3, 13, 5}));
System.out.println(sum13(new int[]{13, 13, 13, 13}));
System.out.println(sum13(new int[]{1, 2, 3, 4, 5}));
System.out.println(sum13(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}));
System.out.println(sum13(new int[]{13, 13, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}));
System.out.println(sum13(new int[]{13, 13, 3, 4, 5}));
System.out.println(sum13(new int[]{13, 13, 13, 13, 13, 13, 13, 13, 13, 13}));
System.out.println(sum13(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(sum13(new int[]{1, 2, 13, 13, 5}));
System.out.println(sum13(new int[]{13, 13, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}));
System.out.println(sum13(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}));
System.out.println(sum13(new int[]{13, 13, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
System.out.println(sum13(new int[]{1, 2, 3, 4, 13}));
System.out.println(sum13(new int[]{13, 13, 3, 4, 13}));
System.out.println(sum13(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
}

public static void main(String []args){
SUM13 obj = new SUM13();
obj.sum13_test(args);
}

}
