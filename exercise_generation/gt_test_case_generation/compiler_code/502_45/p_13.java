public class SUM67{
public int sum67(int[] nums){
try {
int sum = 0;
    int a = 0;
    for (int i = 0; i < nums.length; i++)
    {
        if (nums[i] == 6)
        {
            for (int j = 0; nums[j] != 7; j++)
            {
                nums[j] = 0;
                a = j;
            }
            nums[a+1] = 0;
        }
        else
        {
            sum += nums[i];
        }
    }
    return sum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sum67_test(String []s){
System.out.println(sum67(new int[]{6, 6, 7, 1, 2, 3}));
System.out.println(sum67(new int[]{1, 2, 3, 4, 5}));
System.out.println(sum67(new int[]{1, 2, 3, 6, 4, 7}));
System.out.println(sum67(new int[]{1, 6, 2, 3, 4, 7}));
System.out.println(sum67(new int[]{1, 2, 6, 6, 7, 3}));
System.out.println(sum67(new int[]{1, 2, 3, 4, 6, 7}));
System.out.println(sum67(new int[]{6, 1, 2, 7, 3}));
System.out.println(sum67(new int[]{6, 7, 8, 9, 10}));
System.out.println(sum67(new int[]{1, 2, 6, 3, 4, 7}));
System.out.println(sum67(new int[]{6, 7, 1, 2, 3}));
System.out.println(sum67(new int[]{1, 2, 3, 6, 7}));
System.out.println(sum67(new int[]{1, 2, 6, 7, 3}));
System.out.println(sum67(new int[]{1, 6, 7, 2, 3}));
System.out.println(sum67(new int[]{1, 6, 2, 7, 3}));
System.out.println(sum67(new int[]{6, 1, 2, 3, 4, 7}));
}

public static void main(String []args){
SUM67 obj = new SUM67();
obj.sum67_test(args);
}

}
