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
System.out.println(withoutTen(new int[]{1, 10, 10, 2}));
System.out.println(withoutTen(new int[]{10, 2, 10, 3, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 1, 2, 3, 4, 5, 6}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5, 6, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 10, 4, 5, 10}));
System.out.println(withoutTen(new int[]{1, 10, 2, 10, 3, 10, 4, 10, 5}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 20, 30, 40, 50}));
System.out.println(withoutTen(new int[]{10, 1, 10, 2, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 1, 2, 3}));
System.out.println(withoutTen(new int[]{10, 10, 10, 1, 2, 3}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(withoutTen(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
System.out.println(withoutTen(new int[]{10, 10, 10, 10, 10}));
System.out.println(withoutTen(new int[]{10, 20, 30, 40, 10}));
System.out.println(withoutTen(new int[]{1, 2, 3, 10, 10, 10}));
System.out.println(withoutTen(new int[]{1, 10, 2, 10, 3}));
}

public static void main(String []args){
WITHOUTTEN obj = new WITHOUTTEN();
obj.withoutTen_test(args);
}

}
