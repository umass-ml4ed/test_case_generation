public class CENTEREDAVERAGE{
public int centeredAverage(int[] nums){
try {
int sum = 0;
    int leg = nums.length;
    int max = nums[0];
    int min = nums[0];
    for (int i = 0; i < nums.length; i++)
    {
        if (nums[i] > max)
        {
            max = nums[i];
        }
        if (nums[i] < min)
        {
            min = nums[i];
        }
        sum += nums[i];
    }
    sum = (sum - max - min) / (leg - 2);
    return sum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void centeredAverage_test(String []s){
System.out.println(centeredAverage(new int[]{46, 47, 48}));
System.out.println(centeredAverage(new int[]{55, 56, 57}));
System.out.println(centeredAverage(new int[]{49, 50, 51}));
System.out.println(centeredAverage(new int[]{7, 8, 9}));
System.out.println(centeredAverage(new int[]{40, 41, 42}));
System.out.println(centeredAverage(new int[]{31, 32, 33}));
System.out.println(centeredAverage(new int[]{28, 29, 30}));
System.out.println(centeredAverage(new int[]{43, 44, 45}));
System.out.println(centeredAverage(new int[]{10, 11, 12}));
System.out.println(centeredAverage(new int[]{1, 2, 3}));
System.out.println(centeredAverage(new int[]{4, 5, 6}));
System.out.println(centeredAverage(new int[]{37, 38, 39}));
System.out.println(centeredAverage(new int[]{34, 35, 36}));
System.out.println(centeredAverage(new int[]{58, 59, 60}));
System.out.println(centeredAverage(new int[]{1, 1, 2, 2, 3, 3}));
System.out.println(centeredAverage(new int[]{16, 17, 18}));
System.out.println(centeredAverage(new int[]{13, 14, 15}));
System.out.println(centeredAverage(new int[]{19, 20, 21}));
System.out.println(centeredAverage(new int[]{25, 26, 27}));
System.out.println(centeredAverage(new int[]{22, 23, 24}));
System.out.println(centeredAverage(new int[]{52, 53, 54}));
}

public static void main(String []args){
CENTEREDAVERAGE obj = new CENTEREDAVERAGE();
obj.centeredAverage_test(args);
}

}
