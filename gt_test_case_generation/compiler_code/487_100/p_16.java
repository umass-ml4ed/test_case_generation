public class ROUNDSUM{
public int roundSum(int a, int b, int c){
try {
return round10(a + b + c);
}

public int round10(int num)
{
    int x = num % 10;
    if (x >= 5)
    {
        return num + (10 - x);
    }
    else
    {
        return num - x;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void roundSum_test(String []s){
System.out.println(roundSum(37, 38, 19));
System.out.println(roundSum(31, 32, 16));
System.out.println(roundSum(49, 50, 25));
System.out.println(roundSum(1, 2, 1));
System.out.println(roundSum(39, 40, 20));
System.out.println(roundSum(11, 12, 6));
System.out.println(roundSum(33, 34, 17));
System.out.println(roundSum(25, 26, 13));
System.out.println(roundSum(9, 10, 5));
System.out.println(roundSum(23, 24, 12));
System.out.println(roundSum(47, 48, 24));
System.out.println(roundSum(45, 46, 23));
System.out.println(roundSum(53, 54, 27));
System.out.println(roundSum(43, 44, 22));
System.out.println(roundSum(21, 22, 11));
System.out.println(roundSum(29, 30, 15));
System.out.println(roundSum(51, 52, 26));
System.out.println(roundSum(5, 6, 3));
System.out.println(roundSum(41, 42, 21));
System.out.println(roundSum(13, 14, 7));
System.out.println(roundSum(19, 20, 10));
System.out.println(roundSum(27, 28, 14));
System.out.println(roundSum(15, 16, 8));
System.out.println(roundSum(7, 8, 4));
System.out.println(roundSum(3, 4, 2));
System.out.println(roundSum(35, 36, 18));
System.out.println(roundSum(17, 18, 9));
System.out.println(roundSum(55, 56, 28));
}

public static void main(String []args){
ROUNDSUM obj = new ROUNDSUM();
obj.roundSum_test(args);
}

}
