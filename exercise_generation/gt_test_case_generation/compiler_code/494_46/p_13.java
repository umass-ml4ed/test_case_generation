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
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 3));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 5));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 2));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 3));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 4));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 3));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 6));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 7));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 8));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
