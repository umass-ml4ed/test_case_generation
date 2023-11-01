public class HAS77{
public boolean has77(int[] nums){
try {
boolean result = false;
    for (int i = 0; i < nums.length - 1; i++)
    {
        if (nums[i] == 7 && nums[i+1] == 7)
        {
            result = true;
        }
    }
    for (int i = 0; i < nums.length - 2; i++)
    {
        if (nums[i] == 7 && nums[i+2] == 7)
        {
            result = true;
        }
    }
    return result;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void has77_test(String []s){
System.out.println(has77(new int[]{7, 1, 1, 1, 1, 7}));
System.out.println(has77(new int[]{1, 1, 1, 1, 7, 7}));
System.out.println(has77(new int[]{1, 1, 7, 7}));
System.out.println(has77(new int[]{7, 1, 7}));
System.out.println(has77(new int[]{1, 1, 1, 1, 1, 7, 7}));
System.out.println(has77(new int[]{7, 1, 1, 7, 7}));
System.out.println(has77(new int[]{1, 7, 7, 1, 1}));
System.out.println(has77(new int[]{1, 1, 7, 1, 7}));
System.out.println(has77(new int[]{1, 7, 7, 1}));
System.out.println(has77(new int[]{1, 1, 1, 7, 7}));
System.out.println(has77(new int[]{1, 7, 7, 1, 1, 1}));
System.out.println(has77(new int[]{1, 1, 7, 1, 1, 7}));
System.out.println(has77(new int[]{1, 7, 7}));
System.out.println(has77(new int[]{7, 7, 1, 1}));
System.out.println(has77(new int[]{7, 7}));
System.out.println(has77(new int[]{7, 7, 1, 1, 1}));
System.out.println(has77(new int[]{7, 1, 7, 7}));
System.out.println(has77(new int[]{7, 7, 1, 1, 1, 1}));
System.out.println(has77(new int[]{7, 1, 1, 1, 7}));
System.out.println(has77(new int[]{7, 7, 1}));
}

public static void main(String []args){
HAS77 obj = new HAS77();
obj.has77_test(args);
}

}
