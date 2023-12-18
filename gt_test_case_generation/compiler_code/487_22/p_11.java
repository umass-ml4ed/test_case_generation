public class NOTEENSUM{
public int noTeenSum(int a, int b, int c){
try {
if (a >= 13  && a <= 19) 
        if (a != 15 || a!=16)
    {
    	a = 0;
    }
    if (b >= 13  && b <= 19)  
        if (b != 15 || b!=16)
    {
    	b = 0;
    }
    if (c >= 13  &&  c <= 19) 
        if (c != 15 || c!=16)
    {
    	c = 0;
    }
    int sum = a + b + c;
    return sum;
}

public int fixTeen(int n)
{
    n = 3;
    return n;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void noTeenSum_test(String []s){
System.out.println(noTeenSum(1, 2, 3));
System.out.println(noTeenSum(19, 20, 21));
System.out.println(noTeenSum(37, 38, 39));
System.out.println(noTeenSum(28, 29, 30));
System.out.println(noTeenSum(0, 17, 18));
System.out.println(noTeenSum(22, 23, 24));
System.out.println(noTeenSum(4, 5, 6));
System.out.println(noTeenSum(33, 34, 35));
System.out.println(noTeenSum(30, 31, 32));
System.out.println(noTeenSum(15, 16, 0));
System.out.println(noTeenSum(43, 44, 45));
System.out.println(noTeenSum(40, 41, 42));
System.out.println(noTeenSum(46, 47, 48));
System.out.println(noTeenSum(52, 53, 54));
System.out.println(noTeenSum(13, 14, 0));
System.out.println(noTeenSum(24, 25, 26));
System.out.println(noTeenSum(27, 28, 29));
System.out.println(noTeenSum(7, 8, 9));
System.out.println(noTeenSum(0, 0, 20));
System.out.println(noTeenSum(21, 22, 23));
System.out.println(noTeenSum(34, 35, 36));
System.out.println(noTeenSum(49, 50, 51));
System.out.println(noTeenSum(31, 32, 33));
System.out.println(noTeenSum(25, 26, 27));
System.out.println(noTeenSum(10, 11, 12));
}

public static void main(String []args){
NOTEENSUM obj = new NOTEENSUM();
obj.noTeenSum_test(args);
}

}
