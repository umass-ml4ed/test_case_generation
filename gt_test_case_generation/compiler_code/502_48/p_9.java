public class WITHOUTTEN{
public int[] withoutTen(int[] nums){
try {
int[] array = new int[nums.length];
    for (int i = 0; i < nums.length; i++)
    {
                 if (nums[i] != 10)
        		 {
            		array[i] = nums[i];
                 }
                else
        		{
        	    	array[i] = 0;
        		}
        
    }
    for (int i = 0; i < nums.length; i++)
    {
        if (array[i] == 0)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if  (array[j] != 0)
                {
                    int f = array[i];
                    array[i] = array[j];
                    array[j] = f;
                }
            }
        }
    }
    return array;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void withoutTen_test(String []s){
System.out.println(withoutTen(new int[]{6, 7, 8, 9, 0}));
System.out.println(withoutTen(new int[]{26, 27, 28, 29, 30}));
System.out.println(withoutTen(new int[]{11, 12, 13, 14, 15}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5}));
System.out.println(withoutTen(new int[]{16, 17, 18, 19, 20}));
System.out.println(withoutTen(new int[]{21, 22, 23, 24, 25}));
System.out.println(withoutTen(new int[]{10, 1, 2, 3, 4}));
System.out.println(withoutTen(new int[]{36, 37, 38, 39, 40}));
System.out.println(withoutTen(new int[]{31, 32, 33, 34, 35}));
System.out.println(withoutTen(new int[]{41, 42, 43, 44, 45}));
System.out.println(withoutTen(new int[]{10, 10, 5, 6, 7}));
}

public static void main(String []args){
WITHOUTTEN obj = new WITHOUTTEN();
obj.withoutTen_test(args);
}

}
