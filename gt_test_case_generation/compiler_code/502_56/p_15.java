public class CENTEREDAVERAGE{
public int centeredAverage(int[] nums){
try {
for(int x = 0; x < nums.length; x++)
   {
       for(int y = x; y < nums.length -1; y++)
       {
           if(nums[y] > nums[y+1])
           {
               int start = nums[y+1];
               nums[y+1] = nums[y];
               nums[y] = start; 
           }
       }
   }
   
    int sum = 0;
   for(int i = 1; i < nums.length-1; i++)
   {
       sum += nums[i];
   }
    
    return (sum / (nums.length-2));
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void centeredAverage_test(String []s){
System.out.println(centeredAverage(new int[]{8, 9, 10, 11, 12}));
System.out.println(centeredAverage(new int[]{34, 35, 36, 37, 38, 39, 40, 41, 42}));
System.out.println(centeredAverage(new int[]{53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63}));
System.out.println(centeredAverage(new int[]{32, 33, 31, 34, 35, 36, 37, 38, 39, 40}));
System.out.println(centeredAverage(new int[]{24, 25, 23, 26, 27, 28, 29, 30, 31}));
System.out.println(centeredAverage(new int[]{1, 2, 3}));
System.out.println(centeredAverage(new int[]{2, 3, 1, 4, 5}));
System.out.println(centeredAverage(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102}));
System.out.println(centeredAverage(new int[]{4, 5, 6, 7}));
System.out.println(centeredAverage(new int[]{134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150}));
System.out.println(centeredAverage(new int[]{13, 14, 15, 16, 17, 18}));
System.out.println(centeredAverage(new int[]{26, 27, 28, 29, 30, 31, 32, 33}));
System.out.println(centeredAverage(new int[]{19, 20, 21, 22, 23, 24, 25}));
System.out.println(centeredAverage(new int[]{11, 12, 10, 13, 14, 15, 16}));
System.out.println(centeredAverage(new int[]{76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88}));
System.out.println(centeredAverage(new int[]{17, 18, 16, 19, 20, 21, 22, 23}));
System.out.println(centeredAverage(new int[]{118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133}));
System.out.println(centeredAverage(new int[]{43, 44, 45, 46, 47, 48, 49, 50, 51, 52}));
System.out.println(centeredAverage(new int[]{6, 7, 5, 8, 9, 10}));
System.out.println(centeredAverage(new int[]{103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117}));
System.out.println(centeredAverage(new int[]{64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75}));
}

public static void main(String []args){
CENTEREDAVERAGE obj = new CENTEREDAVERAGE();
obj.centeredAverage_test(args);
}

}
