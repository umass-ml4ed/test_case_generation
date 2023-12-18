public class ISEVERYWHERE{
public boolean isEverywhere(int[] nums, int val){
try {
boolean stillgood = false;
    if(nums.length == 0)
    {return true;}
    
    if(nums.length <= 2)
    {
    for(int h = 0; h < nums.length; h++)
    	{
    		if(nums[h] == val)
            {return true;}
    	}
        return false;
    }
    
    for(int i = 0; i < nums.length; i++)
	if(nums[i] == val)
    {
    	if(i + 2 < nums.length)
        {
        	if(nums[i + 2] == val)
            {
            	stillgood = true;
            }
            else
            {
            stillgood = false;
            }
        }
        else
        {
        if(stillgood)
        {
        	return true;
        }
        }
    }
	
   
    
    
    
    
    if(stillgood)
    {
    return true;
    }
    else
    {return false;}
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void isEverywhere_test(String []s){
System.out.println(isEverywhere(new int[]{}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 8));
System.out.println(isEverywhere(new int[]{1, 1, 1, 2, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 3));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 3));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 2));
System.out.println(isEverywhere(new int[]{1, 2}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 1, 2, 3}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 6));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 7));
System.out.println(isEverywhere(new int[]{1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 1, 2, 3}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 0));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1}, 2));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{2, 2, 2, 2, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 2));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 3, 1, 2, 3}, 3));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 3));
System.out.println(isEverywhere(new int[]{2, 2, 2, 2, 2}, 2));
System.out.println(isEverywhere(new int[]{1, 1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 1, 2, 3}, 4));
System.out.println(isEverywhere(new int[]{1, 2, 2, 2, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5}, 5));
System.out.println(isEverywhere(new int[]{1, 2, 3, 4, 5, 6}, 6));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
