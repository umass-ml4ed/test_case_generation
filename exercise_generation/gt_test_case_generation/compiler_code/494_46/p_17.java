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
System.out.println(isEverywhere(new int[]{1, 1, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 1}, 1));
System.out.println(isEverywhere(new int[]{}, 1));
System.out.println(isEverywhere(new int[]{2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{2, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{2, 1}, 1));
System.out.println(isEverywhere(new int[]{2}, 2));
System.out.println(isEverywhere(new int[]{1, 1, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 1, 2}, 1));
System.out.println(isEverywhere(new int[]{1, 2, 2}, 1));
System.out.println(isEverywhere(new int[]{2, 2, 1, 1}, 1));
System.out.println(isEverywhere(new int[]{2, 1, 2, 1}, 1));
System.out.println(isEverywhere(new int[]{1}, 1));
System.out.println(isEverywhere(new int[]{1, 1, 1}, 1));
}

public static void main(String []args){
ISEVERYWHERE obj = new ISEVERYWHERE();
obj.isEverywhere_test(args);
}

}
