public class COUNTEVENS{
public int countEvens(int[] nums){
try {
for (int i = 0; i < nums.length; i++)
        if (nums[i] % 2 == 0)
            return nums[i];
    return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countEvens_test(String []s){
System.out.println(countEvens(new int[]{21, 23, 25, 27, 6}));
System.out.println(countEvens(new int[]{11, 13, 15, 17, 4}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 10}));
System.out.println(countEvens(new int[]{31, 33, 35, 37, 8}));
System.out.println(countEvens(new int[]{32, 34, 36, 38, 40}));
System.out.println(countEvens(new int[]{41, 43, 45, 47, 10}));
System.out.println(countEvens(new int[]{1, 3, 5, 7, 2}));
System.out.println(countEvens(new int[]{22, 24, 26, 28, 30}));
System.out.println(countEvens(new int[]{51, 53, 55, 57, 12}));
System.out.println(countEvens(new int[]{12, 14, 16, 18, 20}));
}

public static void main(String []args){
COUNTEVENS obj = new COUNTEVENS();
obj.countEvens_test(args);
}

}
