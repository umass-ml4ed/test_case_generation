public class ISEVERYWHERE{
public boolean isEverywhere(int[] nums, int val){
try {
for (int i = 0; i < nums.length - 1; i += 2)
    {
        if ( nums[i] == val || nums[i + 1] == val)
        {           
        }
        else
        {
            return false;
        }        
    }
    
    return true;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void isEverywhere_test(String []s){
System.out.println(isEverywhere(new int[]{6, 6, 6, 6, 6}, 6));
System.out.println(isEverywhere(new int[]{2, 1, 2, 1, 2}, 2));
System.out.println(isEverywhere(new int[]{5, 5, 5, 5, 5}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 1}, 1));
System.out.println(isEverywhere(new int[]{4, 4, 4, 4, 4}, 4));
System.out.println(isEverywhere(new int[]{2, 3, 4, 5, 6}, 2));
System.out.println(isEverywhere(new int[]{5, 1, 5, 1, 5}, 5));
System.out.println(isEverywhere(new int[]{7, 1, 7, 1, 7}, 7));
System.out.println(isEverywhere(new int[]{4, 5, 6, 7, 8}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 1));
System.out.println(isEverywhere(new int[]{3, 4, 5, 6, 7}, 3));
System.out.println(isEverywhere(new int[]{5, 6, 7, 8, 9}, 5));
System.out.println(isEverywhere(new int[]{3, 1, 3, 1, 3}, 3));
System.out.println(isEverywhere(new int[]{2, 2, 2, 2, 2}, 2));
System.out.println(isEverywhere(new int[]{3, 3, 3, 3, 3}, 3));
System.out.println(isEverywhere(new int[]{6, 1, 6, 1, 6}, 6));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{4, 1, 4, 1, 4}, 4));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
