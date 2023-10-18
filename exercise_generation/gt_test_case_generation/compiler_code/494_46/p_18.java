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
System.out.println(isEverywhere(new int[]{1, 2, 3}, 2));
System.out.println(isEverywhere(new int[]{4, 5, 6}, 4));
System.out.println(isEverywhere(new int[]{7, 7, 7, 7}, 7));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 3));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 5));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2, 3, 3}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2, 3, 3}, 2));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2, 3, 3}, 3));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2, 3, 3}, 4));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2, 3, 3}, 5));
System.out.println(isEverywhere(new int[]{}, 1));
System.out.println(isEverywhere(new int[]{1}, 1));
System.out.println(isEverywhere(new int[]{1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1, 2}, 1));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}