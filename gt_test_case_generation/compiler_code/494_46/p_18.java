public class ISEVERYWHERE{
public boolean isEverywhere(int[] nums, int val){
try {
boolean result = true;
    for (int i = 0; i < nums.length - 1; i++)
    {
        if (nums[i] != val && nums[i+1] != val)
        {
            result = false;
        }
    }
    return(result);
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void isEverywhere_test(String []s){
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{2, 1, 2, 1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1}, 1));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
