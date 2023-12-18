public class HAS77{
public boolean has77(int[] nums){
try {
int blob = 0;
    for (int i = 0; i < nums.length - 1; i++)
    {
        if (nums[i] == nums[i + 1] && nums[i] == 7)
        {
            blob = blob + 100;
        }
        else
        {
            blob = blob + 1;
        }
    }
    return blob >= 100;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void has77_test(String []s){
System.out.println(has77(new int[]{1, 2, 3, 4, 7, 5, 7}));
System.out.println(has77(new int[]{1, 2, 3, 7, 7, 4, 5}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3, 4, 5}));
System.out.println(has77(new int[]{1, 2, 3, 7, 7, 7}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3}));
System.out.println(has77(new int[]{1, 7, 2, 7, 3}));
System.out.println(has77(new int[]{7, 1, 7, 2, 3}));
System.out.println(has77(new int[]{1, 7, 7, 2, 3}));
System.out.println(has77(new int[]{1, 2, 7, 7, 7}));
System.out.println(has77(new int[]{1, 2, 3, 4, 5, 7, 7}));
System.out.println(has77(new int[]{1, 2, 3, 4, 7, 7, 5}));
System.out.println(has77(new int[]{1, 2, 7, 7, 3}));
System.out.println(has77(new int[]{1, 2, 3, 7, 7}));
System.out.println(has77(new int[]{1, 7, 7, 2, 3, 4, 5}));
System.out.println(has77(new int[]{1, 2, 7, 3, 7}));
System.out.println(has77(new int[]{1, 2, 7, 7, 3, 4, 5}));
System.out.println(has77(new int[]{7, 7, 7, 2, 3}));
System.out.println(has77(new int[]{7, 7, 1, 2, 3, 4, 5, 6, 7}));
System.out.println(has77(new int[]{1, 2, 3, 7, 4, 7}));
}

public static void main(String []args){
HAS77 obj = new HAS77();
obj.has77_test(args);
}

}
