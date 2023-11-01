public class SAMEENDS{
public boolean sameEnds(int[] nums, int n){
try {
if (n == 0)
        return true;
    
    if (nums.length == 0)
        return false;
    
    int starting[] = new int[n];
    int ending[] = new int[n];
    
    for (int i = 0; i < n; i++)
        starting[i] = nums[i];
    
    for (int j = nums.length - n; j < nums.length; j++)
    {
        int beginning = 0;
        ending[beginning] = nums[j];
        beginning++;
    }
    for (int k = 0; k < n; k++)
    {
     	if (starting[k] != ending[k])
            return false;
    }
    return true;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void sameEnds_test(String []s){
System.out.println(sameEnds(new int[]{46, 47, 48, 49, 50, 46, 47, 48, 49, 50}, 20));
System.out.println(sameEnds(new int[]{41, 42, 43, 44, 45, 41, 42, 43, 44, 45}, 0));
System.out.println(sameEnds(new int[]{36, 37, 38, 39, 40, 36, 37, 38, 39, 40}, 20));
System.out.println(sameEnds(new int[]{51, 52, 53, 54, 55, 51, 52, 53, 54, 55}, 5));
System.out.println(sameEnds(new int[]{11, 12, 13, 14, 15, 11, 12, 13, 14, 15}, 5));
System.out.println(sameEnds(new int[]{71, 72, 73, 74, 75, 76, 77, 78, 79, 80}, 5));
System.out.println(sameEnds(new int[]{16, 17, 18, 19, 20, 16, 17, 18, 19, 20}, 20));
System.out.println(sameEnds(new int[]{81, 82, 83, 84, 85, 86, 87, 88, 89, 90}, 5));
System.out.println(sameEnds(new int[]{6, 7, 8, 9, 10}, 10));
System.out.println(sameEnds(new int[]{31, 32, 33, 34, 35, 31, 32, 33, 34, 35}, 5));
System.out.println(sameEnds(new int[]{91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, 5));
System.out.println(sameEnds(new int[]{26, 27, 28, 29, 30, 26, 27, 28, 29, 30}, 20));
System.out.println(sameEnds(new int[]{21, 22, 23, 24, 25, 21, 22, 23, 24, 25}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5}, 0));
System.out.println(sameEnds(new int[]{61, 62, 63, 64, 65, 66, 67, 68, 69, 70}, 5));
System.out.println(sameEnds(new int[]{56, 57, 58, 59, 60, 56, 57, 58, 59, 60}, 20));
}

public static void main(String []args){
SAMEENDS obj = new SAMEENDS();
obj.sameEnds_test(args);
}

}
