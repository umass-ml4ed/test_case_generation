public class FIX45{
public int[] fix45(int[] nums){
try {
int[] positions = new int[1];
    int position = 0;
    int used = 0;
    for (int i = 0; i < nums.length; i++)
    {
        if (nums[i] == 5)
        {
            positions[position] = i;
            position = position + 1;
        }
    }
    for (int j = 0; j < nums.length; j++)
    {
        if (nums[j] == 4)
        {
            nums[positions[used]] = nums[j + 1];
            used = used + 1;
            nums[j + 1] = 5;
        }
    }
    return nums;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void fix45_test(String []s){
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 5, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 1, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5, 6, 7}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 4, 5, 5, 5}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 4, 5, 5, 5, 6, 7}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5, 6}));
System.out.println(fix45(new int[]{4, 5, 4, 5}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 5, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
System.out.println(fix45(new int[]{4, 1, 4, 5, 5}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 4, 5, 5, 5, 6}));
System.out.println(fix45(new int[]{4, 1, 4, 2, 3, 4, 5, 5, 5, 6, 7, 8}));
System.out.println(fix45(new int[]{4, 5, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8}));
}

public static void main(String []args){
FIX45 obj = new FIX45();
obj.fix45_test(args);
}

}
