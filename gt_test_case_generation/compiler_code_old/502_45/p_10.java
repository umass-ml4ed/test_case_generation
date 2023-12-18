public class SUM67{
public int sum67(int[] nums){
try {
int sum = 0;
    if (nums.length == 0)
        return 0;
    else 
        for (int i = 0;i<nums.length;i++)
        {
            if (nums[i] ==6)
                while (nums[i+1] != 7)
                    i++;
            else if (nums[i] != 7)
                sum += nums[i];
        }
    return sum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sum67_test(String []s){
System.out.println(sum67(new int[]{1, 2, 3, 4, 5}));
System.out.println(sum67(new int[]{6, 7, 8, 9, 10}));
System.out.println(sum67(new int[]{1, 6, 2, 7, 3, 4, 5}));
System.out.println(sum67(new int[]{6, 7, 1, 2, 3, 4, 5}));
System.out.println(sum67(new int[]{1, 2, 3, 6, 7, 8, 9, 10}));
System.out.println(sum67(new int[]{6, 7, 8, 9, 10, 6, 7, 8, 9, 10}));
System.out.println(sum67(new int[]{6, 7, 6, 7, 6, 7, 6, 7}));
System.out.println(sum67(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(sum67(new int[]{6, 7, 8, 9, 10, 6, 7, 8, 9, 10, 6, 7, 8, 9, 10}));
System.out.println(sum67(new int[]{6, 7, 6, 7, 6, 7, 6, 7, 6, 7}));
System.out.println(sum67(new int[]{6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7}));
System.out.println(sum67(new int[]{6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7}));
System.out.println(sum67(new int[]{6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7}));
System.out.println(sum67(new int[]{6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7, 6, 7}));
System.out.println(sum67(new int[]{}));
}

public static void main(String []args){
SUM67 obj = new SUM67();
obj.sum67_test(args);
}

}
