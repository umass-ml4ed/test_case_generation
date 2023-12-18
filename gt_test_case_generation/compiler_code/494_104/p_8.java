public class ZEROMAX{
public int[] zeroMax(int[] nums){
try {
for(int i =0; i < nums.length; i++)
    {
        if(nums[i] == 0)
        {
            nums[i] = largestOdd(nums);
        }
        
    }
    
     return nums;
    
}

public int largestOdd(int[] xyz)
{
    int max = xyz[0];
    for( int i = 0; i < xyz.length - 1; i++)
    {
        if(xyz[i] == 0)
        {
            max = xyz[i+1];
            for(int x = 1; x < xyz.length-i; x++)
            {
                if(xyz[i + x] > max && xyz[i+x]%2 == 1)
              {
                max = xyz[i+x];
              }
            }
        }
    }
    return max;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void zeroMax_test(String []s){
System.out.println(zeroMax(new int[]{0, 5, 0, 3}));
System.out.println(zeroMax(new int[]{0}));
System.out.println(zeroMax(new int[]{1, 0, 3, 0, 5, 0}));
System.out.println(zeroMax(new int[]{0, 1, 0}));
System.out.println(zeroMax(new int[]{1, 0, 1, 0, 1, 0}));
System.out.println(zeroMax(new int[]{0, 0, 0}));
System.out.println(zeroMax(new int[]{2, 0, 0, 0}));
System.out.println(zeroMax(new int[]{0, 4, 0, 3}));
System.out.println(zeroMax(new int[]{1, 0, 0, 0}));
System.out.println(zeroMax(new int[]{2, 0, 4, 0, 6, 0}));
System.out.println(zeroMax(new int[]{1, 0, 3, 0, 5, 0, 7, 0}));
System.out.println(zeroMax(new int[]{0, 1, 5}));
System.out.println(zeroMax(new int[]{0, 2, 5}));
System.out.println(zeroMax(new int[]{0, 0, 1}));
System.out.println(zeroMax(new int[]{2, 0, 2, 0, 2, 0}));
}

public static void main(String []args){
ZEROMAX obj = new ZEROMAX();
obj.zeroMax_test(args);
}

}
