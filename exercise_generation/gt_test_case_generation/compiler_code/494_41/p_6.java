public class SUM3{
public int sum3(int[] nums){
try {
return(nums[0] + nums[1] + nums[2]);
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sum3_test(String []s){
System.out.println(sum3(new int[]{4, 5, 6}));
System.out.println(sum3(new int[]{10, 11, 12}));
System.out.println(sum3(new int[]{7, 8, 9}));
System.out.println(sum3(new int[]{16, 17, 18}));
System.out.println(sum3(new int[]{13, 14, 15}));
System.out.println(sum3(new int[]{1, 2, 3}));
}

public static void main(String []args){
SUM3 obj = new SUM3();
obj.sum3_test(args);
}

}
