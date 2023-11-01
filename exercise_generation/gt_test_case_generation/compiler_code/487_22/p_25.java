public class NOTEENSUM{
public int noTeenSum(int a, int b, int c){
try {
return (fixTeen(a) + fixTeen(b) +fixTeen(c));
}

public int fixTeen(int n)
{
    if(n < 13 || n > 19 || n == 15 || n == 16)

		return n;

	return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void noTeenSum_test(String []s){
System.out.println(noTeenSum(1, 2, 3));
System.out.println(noTeenSum(66, 67, 68));
System.out.println(noTeenSum(78, 79, 80));
System.out.println(noTeenSum(57, 58, 59));
System.out.println(noTeenSum(48, 49, 50));
System.out.println(noTeenSum(63, 64, 65));
System.out.println(noTeenSum(4, 5, 6));
System.out.println(noTeenSum(33, 34, 35));
System.out.println(noTeenSum(54, 55, 56));
System.out.println(noTeenSum(30, 31, 32));
System.out.println(noTeenSum(51, 52, 53));
System.out.println(noTeenSum(69, 70, 71));
System.out.println(noTeenSum(39, 40, 41));
System.out.println(noTeenSum(24, 25, 26));
System.out.println(noTeenSum(27, 28, 29));
System.out.println(noTeenSum(7, 8, 9));
System.out.println(noTeenSum(42, 43, 44));
System.out.println(noTeenSum(45, 46, 47));
System.out.println(noTeenSum(21, 22, 23));
System.out.println(noTeenSum(72, 73, 74));
System.out.println(noTeenSum(60, 61, 62));
System.out.println(noTeenSum(36, 37, 38));
System.out.println(noTeenSum(75, 76, 77));
System.out.println(noTeenSum(15, 16, 20));
System.out.println(noTeenSum(10, 11, 12));
}

public static void main(String []args){
NOTEENSUM obj = new NOTEENSUM();
obj.noTeenSum_test(args);
}

}
