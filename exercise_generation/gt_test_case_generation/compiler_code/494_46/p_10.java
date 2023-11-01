public class ISEVERYWHERE{
public boolean isEverywhere(int[] nums, int val){
try {
boolean result = false;
    for (int i = 0; i < nums.length - 2; i++)
    {
        if (nums[i] == val && nums[i+1] != val && nums[i+2] == val )
        {
            result = true;
        }
    }
    return(result);
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void isEverywhere_test(String []s){
System.out.println(isEverywhere(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 10));
System.out.println(isEverywhere(new int[]{7, 8, 7, 10, 7}, 7));
System.out.println(isEverywhere(new int[]{7, 1, 7, 1, 7, 1, 7, 1, 7}, 7));
System.out.println(isEverywhere(new int[]{8, 9, 8, 11, 8}, 8));
System.out.println(isEverywhere(new int[]{3, 4, 3, 6, 3}, 3));
System.out.println(isEverywhere(new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, 8));
System.out.println(isEverywhere(new int[]{6, 6, 6, 6, 6, 6, 6, 6}, 6));
System.out.println(isEverywhere(new int[]{6, 7, 6, 9, 6}, 6));
System.out.println(isEverywhere(new int[]{5, 6, 7, 8, 9}, 5));
System.out.println(isEverywhere(new int[]{4, 5, 4, 7, 4}, 4));
System.out.println(isEverywhere(new int[]{2, 3, 2, 5, 2}, 2));
System.out.println(isEverywhere(new int[]{4, 4, 4, 4, 4, 4, 4}, 4));
System.out.println(isEverywhere(new int[]{3, 1, 3, 1, 3}, 3));
System.out.println(isEverywhere(new int[]{2, 2, 2, 2, 2}, 2));
System.out.println(isEverywhere(new int[]{5, 1, 5, 1, 5, 1, 5}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 1, 4, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 1}, 1));
System.out.println(isEverywhere(new int[]{9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9}, 9));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
