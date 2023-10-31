public class ISEVERYWHERE{
public boolean isEverywhere(int[] nums, int val){
try {
int totalz = nums.length - 1;
    int counter = 0;
    
    for (int i = 0; i < nums.length - 1; i++)
    {        
		if (nums[i] == val || nums[i+1] == val)
        {
            counter = counter + 1;
        }
        
    }
    
    return (counter == totalz);
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void isEverywhere_test(String []s){
System.out.println(isEverywhere(new int[]{5, 1, 5, 2, 5, 1, 5}, 5));
System.out.println(isEverywhere(new int[]{7, 1, 7, 1, 7}, 7));
System.out.println(isEverywhere(new int[]{17, 16, 17, 16, 17}, 17));
System.out.println(isEverywhere(new int[]{5, 6, 7, 8, 9, 10}, 5));
System.out.println(isEverywhere(new int[]{15, 14, 15, 14, 15}, 15));
System.out.println(isEverywhere(new int[]{7, 6, 7, 6, 7}, 7));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{4, 4, 4, 4, 4}, 4));
System.out.println(isEverywhere(new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, 8));
System.out.println(isEverywhere(new int[]{9, 8, 9, 8, 9}, 9));
System.out.println(isEverywhere(new int[]{2, 3, 4, 5, 6, 7}, 2));
System.out.println(isEverywhere(new int[]{2, 2, 2, 2, 2}, 2));
System.out.println(isEverywhere(new int[]{13, 12, 13, 12, 13}, 13));
System.out.println(isEverywhere(new int[]{6, 5, 6, 5, 6}, 6));
System.out.println(isEverywhere(new int[]{3, 4, 5, 6, 7, 8}, 3));
System.out.println(isEverywhere(new int[]{8, 9, 10, 11, 12}, 8));
System.out.println(isEverywhere(new int[]{6, 6, 6, 6, 6}, 6));
System.out.println(isEverywhere(new int[]{7, 8, 9, 10, 11}, 7));
System.out.println(isEverywhere(new int[]{3, 2, 3, 2, 3}, 3));
System.out.println(isEverywhere(new int[]{6, 7, 8, 9, 10}, 6));
System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 1}, 1));
System.out.println(isEverywhere(new int[]{16, 15, 16, 15, 16}, 16));
System.out.println(isEverywhere(new int[]{6, 1, 6, 1, 6}, 6));
System.out.println(isEverywhere(new int[]{6, 6, 6, 7, 6, 6, 6, 6}, 6));
System.out.println(isEverywhere(new int[]{9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9}, 9));
System.out.println(isEverywhere(new int[]{5, 5, 5, 5, 5}, 5));
System.out.println(isEverywhere(new int[]{8, 7, 8, 7, 8}, 8));
System.out.println(isEverywhere(new int[]{7, 1, 7, 1, 7, 1, 7, 1, 7}, 7));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 1));
System.out.println(isEverywhere(new int[]{4, 5, 6, 7, 8, 9}, 4));
System.out.println(isEverywhere(new int[]{10, 9, 10, 9, 10}, 10));
System.out.println(isEverywhere(new int[]{2, 1, 2, 1, 2}, 2));
System.out.println(isEverywhere(new int[]{2, 3, 4, 5, 6}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 1));
System.out.println(isEverywhere(new int[]{3, 3, 3, 3, 3}, 3));
System.out.println(isEverywhere(new int[]{4, 3, 4, 3, 4}, 4));
System.out.println(isEverywhere(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 10));
System.out.println(isEverywhere(new int[]{4, 4, 4, 4, 4, 4, 4}, 4));
System.out.println(isEverywhere(new int[]{12, 11, 12, 11, 12}, 12));
System.out.println(isEverywhere(new int[]{11, 10, 11, 10, 11}, 11));
System.out.println(isEverywhere(new int[]{4, 1, 4, 1, 4}, 4));
System.out.println(isEverywhere(new int[]{14, 13, 14, 13, 14}, 14));
System.out.println(isEverywhere(new int[]{5, 1, 5, 1, 5}, 5));
System.out.println(isEverywhere(new int[]{5, 4, 5, 4, 5}, 5));
System.out.println(isEverywhere(new int[]{5, 6, 7, 8, 9}, 5));
System.out.println(isEverywhere(new int[]{3, 1, 3, 1, 3}, 3));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
