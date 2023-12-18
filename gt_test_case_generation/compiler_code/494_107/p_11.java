public class COUNTCLUMPS{
public int countClumps(int[] nums){
try {
int clumps = 0;
	boolean isClump = false;
  for(int i = 0; i < nums.length - 1; i++)
  {
  	if(isClump)
  	{
	  	if(nums[i] != nums[i+1])
	  		isClump = false;
	  }
  	else if(nums[i] == nums[i+1])
  	{
  		isClump = true;
  		clumps++;
  	}
  }
  return clumps;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countClumps_test(String []s){
System.out.println(countClumps(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10}));
System.out.println(countClumps(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9}));
System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10}));
System.out.println(countClumps(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15}));
System.out.println(countClumps(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10}));
System.out.println(countClumps(new int[]{1, 1, 2, 3, 3, 4, 5, 5}));
System.out.println(countClumps(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15}));
System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4, 5}));
}

public static void main(String []args){
COUNTCLUMPS obj = new COUNTCLUMPS();
obj.countClumps_test(args);
}

}
