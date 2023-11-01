public class SHIFTLEFT{
public int[] shiftLeft(int[] nums){
try {
if(nums.length >= 2)
	{
		int temp = nums[0];
        
		for(int i = 0; i < nums.length - 1; i++)
        {
        	nums[i] = nums[i + 1];
			nums[nums.length - 1] = temp;
        }
	}
    
	return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void shiftLeft_test(String []s){
System.out.println(shiftLeft(new int[]{1, 2, 3, 4, 5}));
System.out.println(shiftLeft(new int[]{1}));
System.out.println(shiftLeft(new int[]{1, 2, 3, 4, 5, 6}));
System.out.println(shiftLeft(new int[]{1, 2, 3, 4}));
System.out.println(shiftLeft(new int[]{5, 4, 3, 2, 1}));
System.out.println(shiftLeft(new int[]{1, 2}));
System.out.println(shiftLeft(new int[]{2, 1}));
System.out.println(shiftLeft(new int[]{}));
System.out.println(shiftLeft(new int[]{6, 5, 4, 3, 2, 1}));
System.out.println(shiftLeft(new int[]{4, 3, 2, 1}));
System.out.println(shiftLeft(new int[]{1, 2, 3, 4, 5, 6, 7}));
}

public static void main(String []args){
SHIFTLEFT obj = new SHIFTLEFT();
obj.shiftLeft_test(args);
}

}
