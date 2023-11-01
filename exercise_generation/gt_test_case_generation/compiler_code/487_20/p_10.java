public class LONESUM{
public int loneSum(int a, int b, int c){
try {
if (a == b && b == c)
    {
        return 0;
    }
    else if (a == b || b == c)
    {
        return a+c;
    }
    else if (a == c)
    {
        return b;
    }
    else
    {
      	return a+b+c;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void loneSum_test(String []s){
System.out.println(loneSum(1, 2, 3));
System.out.println(loneSum(19, 20, 21));
System.out.println(loneSum(31, 31, 32));
System.out.println(loneSum(7, 7, 8));
System.out.println(loneSum(4, 5, 6));
System.out.println(loneSum(25, 26, 27));
System.out.println(loneSum(28, 29, 30));
System.out.println(loneSum(35, 35, 36));
System.out.println(loneSum(13, 14, 15));
System.out.println(loneSum(33, 33, 34));
System.out.println(loneSum(37, 37, 38));
System.out.println(loneSum(22, 22, 23));
System.out.println(loneSum(16, 17, 18));
System.out.println(loneSum(10, 11, 12));
}

public static void main(String []args){
LONESUM obj = new LONESUM();
obj.loneSum_test(args);
}

}
