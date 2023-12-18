public class NOTEENSUM{
public int noTeenSum(int a, int b, int c){
try {
return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n)
{
 if (n <= 13 || n >= 19 || n == 15 || n == 16) {
     return n;
 }
    else {
        return 0;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void noTeenSum_test(String []s){
System.out.println(noTeenSum(noTeenSum(24, 25, 26)));
System.out.println(noTeenSum(noTeenSum(27, 28, 29)));
System.out.println(noTeenSum(noTeenSum(7, 8, 9)));
System.out.println(noTeenSum(noTeenSum(4, 5, 6)));
System.out.println(noTeenSum(noTeenSum(39, 40, 41)));
System.out.println(noTeenSum(noTeenSum(42, 43, 44)));
System.out.println(noTeenSum(noTeenSum(17, 18, 20)));
System.out.println(noTeenSum(noTeenSum(13, 14, 15)));
System.out.println(noTeenSum(noTeenSum(28, 29, 19)));
System.out.println(noTeenSum(noTeenSum(24, 25, 19)));
System.out.println(noTeenSum(noTeenSum(10, 11, 12)));
System.out.println(noTeenSum(noTeenSum(19, 20, 21)));
System.out.println(noTeenSum(noTeenSum(30, 31, 13)));
System.out.println(noTeenSum(noTeenSum(16, 17, 18)));
System.out.println(noTeenSum(noTeenSum(36, 37, 38)));
System.out.println(noTeenSum(noTeenSum(33, 34, 35)));
System.out.println(noTeenSum(noTeenSum(51, 52, 53)));
System.out.println(noTeenSum(noTeenSum(22, 23, 13)));
System.out.println(noTeenSum(noTeenSum(26, 27, 13)));
System.out.println(noTeenSum(noTeenSum(1, 2, 3)));
System.out.println(noTeenSum(noTeenSum(30, 31, 32)));
System.out.println(noTeenSum(noTeenSum(48, 49, 50)));
System.out.println(noTeenSum(noTeenSum(14, 15, 16)));
System.out.println(noTeenSum(noTeenSum(45, 46, 47)));
System.out.println(noTeenSum(noTeenSum(21, 22, 23)));
}

public static void main(String []args){
NOTEENSUM obj = new NOTEENSUM();
obj.noTeenSum_test(args);
}

}
