public class SAMEENDS{
public boolean sameEnds(int[] nums, int n){
try {
boolean result = false;
    if (nums[0] == nums[nums.length - 1] && nums[n] == nums[nums.length - (n+1)])
    {
        result = true;
    }
    else if (n == 0)
    {
        result = true;
    }
    else if (n == nums.length)
    {
        result = true;
    }
    return result;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void sameEnds_test(String []s){
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2}, 0));
System.out.println(sameEnds(new int[]{1, 1, 1, 1, 1, 1, 1}, 0));
System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 7));
System.out.println(sameEnds(new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 7));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2}, 7));
System.out.println(sameEnds(new int[]{1, 1, 1, 1, 1, 1, 1}, 3));
System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
System.out.println(sameEnds(new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 15));
System.out.println(sameEnds(new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 15));
System.out.println(sameEnds(new int[]{1, 1, 1, 1, 1, 1, 1}, 7));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5}, 5));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2}, 2));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 7));
System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 0));
}

public static void main(String []args){
SAMEENDS obj = new SAMEENDS();
obj.sameEnds_test(args);
}

}
