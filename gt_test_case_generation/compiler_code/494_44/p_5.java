public class COUNTEVENS{
public int countEvens(int[] nums){
try {
int evenSum = 0;
    for (int i = 0;i < nums.length; i++)
    {
        if (nums[i] % 2 == 0)
        {
         	evenSum += nums[i];
        }
    }
    return evenSum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countEvens_test(String []s){
System.out.println(countEvens(new int[]{2, 4, 6, 8, 10, 12, 14}));
System.out.println(countEvens(new int[]{2, 2, 2}));
System.out.println(countEvens(new int[]{2, 2}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 10}));
System.out.println(countEvens(new int[]{2, 2, 2, 2}));
System.out.println(countEvens(new int[]{2, 4, 6, 8}));
System.out.println(countEvens(new int[]{2, 2, 2, 2, 2}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 10, 12}));
System.out.println(countEvens(new int[]{2}));
System.out.println(countEvens(new int[]{2, 4, 6}));
}

public static void main(String []args){
COUNTEVENS obj = new COUNTEVENS();
obj.countEvens_test(args);
}

}
