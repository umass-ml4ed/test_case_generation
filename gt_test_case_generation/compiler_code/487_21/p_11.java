public class LUCKYSUM{
public int luckySum(int a, int b, int c){
try {
int sum;
    if (a!=13 && b!=13 && c==13)
    {
        sum = a + b;
    }
    else if (a==13 && b!=13 && c!=13)
    {
        sum = c + b;
    }
    else if (a!=13 && b==13 && c!=13)
    {
        sum = a + c;
    }
    else if (a==13 && b==13 && c!=13)
    {
        sum = c;
    }
    else if (a==13 && b!=13 && c==13)
    {
        sum = b;
    }
    else if (a!=13 && b==13 && c==13)
    {
        sum = a;
    }
    else
    {
     	sum = a + b + c;   
    }
    return sum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void luckySum_test(String []s){
System.out.println(luckySum(13, 17, 16));
System.out.println(luckySum(1, 2, 3));
System.out.println(luckySum(19, 20, 21));
System.out.println(luckySum(13, 14, 13));
System.out.println(luckySum(28, 29, 30));
System.out.println(luckySum(13, 11, 10));
System.out.println(luckySum(13, 23, 22));
System.out.println(luckySum(13, 2, 1));
System.out.println(luckySum(13, 14, 15));
System.out.println(luckySum(13, 5, 4));
System.out.println(luckySum(22, 23, 24));
System.out.println(luckySum(4, 5, 6));
System.out.println(luckySum(13, 8, 7));
System.out.println(luckySum(16, 17, 18));
System.out.println(luckySum(7, 8, 9));
System.out.println(luckySum(31, 32, 33));
System.out.println(luckySum(25, 26, 27));
System.out.println(luckySum(13, 20, 19));
System.out.println(luckySum(13, 26, 25));
System.out.println(luckySum(10, 11, 12));
}

public static void main(String []args){
LUCKYSUM obj = new LUCKYSUM();
obj.luckySum_test(args);
}

}
