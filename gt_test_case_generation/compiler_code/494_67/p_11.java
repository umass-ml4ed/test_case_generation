public class HAS77{
public boolean has77(int[] nums){
try {
for (int i = 0; i < nums.length; i++)
    {
        if(nums[i] == 7 && nums[i + 1] == 7 )
        {
            return true;
        }
    }
    return false;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void has77_test(String []s){
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9}));
System.out.println(has77(new int[]{1, 2, 3, 7, 7, 4, 5, 6, 8, 9, 10}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11}));
System.out.println(has77(new int[]{1, 2, 3, 7, 1, 7, 4, 5, 6, 8, 9, 10, 11}));
System.out.println(has77(new int[]{1, 2, 3, 7, 1, 7, 5, 6}));
System.out.println(has77(new int[]{7, 1, 7, 1, 2, 3, 4, 5, 6, 8, 9, 10}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 7, 8, 9}));
System.out.println(has77(new int[]{1, 2, 3, 7, 1, 7, 4, 5, 6, 8, 9}));
System.out.println(has77(new int[]{7, 1, 7, 1, 2, 3, 4, 5, 6, 8, 9}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11}));
System.out.println(has77(new int[]{1, 2, 3, 7, 7, 4, 5, 6, 8, 9}));
System.out.println(has77(new int[]{7, 1, 7, 2, 3, 4, 5, 6}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3, 4, 5, 6, 8, 9, 10}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 7, 1, 7}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 7, 8, 9, 10}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3, 4, 5, 6, 8, 9}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 6, 7, 7}));
System.out.println(has77(new int[]{1, 2, 3, 7, 7, 4, 5, 6}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3, 4, 5, 6}));
}

public static void main(String []args){
HAS77 obj = new HAS77();
obj.has77_test(args);
}

}
