public class COUNTEVENS{
public int countEvens(int[] nums){
try {
int total = 0;
    for( int i = 0; i < nums.length; i++) {
     	if (nums[i] == 2) {
            total = total + 1;
        }
        else if (nums[i] == 4) {
            total = total + 1;
        }
        else if (nums[i] == 6) {
         	total = total + 1;   
        }
        else if (nums[i] == 8) {
         	total = total + 1;   
        }
        else if (nums[i] == 0) {
         	total = total + 1;   
        }
    }
    return total;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countEvens_test(String []s){
System.out.println(countEvens(new int[]{8, 8, 8, 8, 8}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 0}));
System.out.println(countEvens(new int[]{0, 0, 0, 0, 0}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 0, 2, 4, 6, 8, 0, 2, 4, 6, 8, 0}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 0, 10}));
System.out.println(countEvens(new int[]{2, 2, 2, 2, 2}));
System.out.println(countEvens(new int[]{6, 6, 6, 6, 6}));
System.out.println(countEvens(new int[]{2, 2, 4, 4, 6, 6, 8, 8, 0, 0}));
System.out.println(countEvens(new int[]{2, 4, 6, 8, 0, 2, 4, 6, 8, 0}));
System.out.println(countEvens(new int[]{4, 4, 4, 4, 4}));
}

public static void main(String []args){
COUNTEVENS obj = new COUNTEVENS();
obj.countEvens_test(args);
}

}
