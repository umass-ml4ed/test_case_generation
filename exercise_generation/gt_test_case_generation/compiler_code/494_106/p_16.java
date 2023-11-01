public class SAMEENDS{
public boolean sameEnds(int[] nums, int n){
try {
boolean result = false;
    if (n == 0)
    {
        result = true;
    }
    else if (n == nums.length)
    {
        result = true;
    }
    else if (nums[0] == nums[nums.length - n]) 
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
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3}, 3));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}, 6));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}, 5));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, 1));
System.out.println(sameEnds(new int[]{1, 2, 3, 1, 2, 3, 4, 5, 6, 7}, 1));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3}, 1));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4}, 2));
System.out.println(sameEnds(new int[]{1, 2, 1, 2, 3, 4, 5, 6, 7, 8}, 2));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4}, 4));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, 5));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5, 6}, 0));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2}, 2));
System.out.println(sameEnds(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
System.out.println(sameEnds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4));
}

public static void main(String []args){
SAMEENDS obj = new SAMEENDS();
obj.sameEnds_test(args);
}

}
