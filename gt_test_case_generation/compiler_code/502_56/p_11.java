public class CENTEREDAVERAGE{
public int centeredAverage(int[] nums){
try {
int smallest = nums[0];
    int largest = nums[0];
    int sum = 0;
    int number = 0;
    for (int i = 0; i < nums.length; i++)
    {
        if (nums[i] < smallest)
        {
            smallest = nums[i];
        }
        else if (nums[i] > largest)
        {
            largest = nums[i];
        }
        else
        {
            sum = sum + nums[i];
            number++;
        }
    }
    int mean = sum / number;
    return mean;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void centeredAverage_test(String []s){
System.out.println(centeredAverage(new int[]{13, 14, 14, 15, 16}));
System.out.println(centeredAverage(new int[]{33, 34, 35, 36}));
System.out.println(centeredAverage(new int[]{5, 6, 7, 8}));
System.out.println(centeredAverage(new int[]{29, 30, 30, 31, 32}));
System.out.println(centeredAverage(new int[]{21, 22, 22, 23, 24}));
System.out.println(centeredAverage(new int[]{37, 38, 38, 39, 40}));
System.out.println(centeredAverage(new int[]{21, 22, 23, 24}));
System.out.println(centeredAverage(new int[]{9, 10, 11, 12}));
System.out.println(centeredAverage(new int[]{17, 18, 19, 20}));
System.out.println(centeredAverage(new int[]{1, 2, 2, 3, 4}));
System.out.println(centeredAverage(new int[]{29, 30, 31, 32}));
System.out.println(centeredAverage(new int[]{17, 18, 18, 19, 20}));
System.out.println(centeredAverage(new int[]{41, 42, 43, 44}));
System.out.println(centeredAverage(new int[]{13, 14, 15, 16}));
System.out.println(centeredAverage(new int[]{25, 26, 26, 27, 28}));
System.out.println(centeredAverage(new int[]{25, 26, 27, 28}));
System.out.println(centeredAverage(new int[]{33, 34, 34, 35, 36}));
System.out.println(centeredAverage(new int[]{1, 2, 3, 4}));
System.out.println(centeredAverage(new int[]{9, 10, 10, 11, 12}));
System.out.println(centeredAverage(new int[]{37, 38, 39, 40}));
System.out.println(centeredAverage(new int[]{5, 6, 6, 7, 8}));
}

public static void main(String []args){
CENTEREDAVERAGE obj = new CENTEREDAVERAGE();
obj.centeredAverage_test(args);
}

}
