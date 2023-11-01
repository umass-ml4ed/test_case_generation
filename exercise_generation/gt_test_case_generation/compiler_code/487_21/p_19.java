public class LUCKYSUM{
public int luckySum(int a, int b, int c){
try {
if (a == 13)
    {
        if (b == 13)
        {
            return 0;
        }
        else if (c == 13)
        {
            return 0;
        }
        else 
        {
            return c;
        }
    }
    else if (b == 13)
    {
        return a;
    }
    else if (c == 13)
    {
        return a + b;
    }
    else
    {
        return a + b + c;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void luckySum_test(String []s){
System.out.println(luckySum(1, 2, 3));
System.out.println(luckySum(19, 20, 21));
System.out.println(luckySum(37, 38, 39));
System.out.println(luckySum(28, 29, 30));
System.out.println(luckySum(13, 14, 15));
System.out.println(luckySum(22, 23, 24));
System.out.println(luckySum(4, 5, 6));
System.out.println(luckySum(43, 44, 45));
System.out.println(luckySum(40, 41, 42));
System.out.println(luckySum(46, 47, 48));
System.out.println(luckySum(52, 53, 54));
System.out.println(luckySum(16, 17, 18));
System.out.println(luckySum(7, 8, 9));
System.out.println(luckySum(13, 58, 59));
System.out.println(luckySum(34, 35, 36));
System.out.println(luckySum(49, 50, 51));
System.out.println(luckySum(31, 32, 33));
System.out.println(luckySum(25, 26, 27));
System.out.println(luckySum(10, 11, 12));
System.out.println(luckySum(55, 56, 57));
}

public static void main(String []args){
LUCKYSUM obj = new LUCKYSUM();
obj.luckySum_test(args);
}

}
