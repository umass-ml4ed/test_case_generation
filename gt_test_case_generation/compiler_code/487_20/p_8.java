public class LONESUM{
public int loneSum(int a, int b, int c){
try {
int sum = a+b+c;
    if (a!=b && b!=c && a!=c)
    {
        return sum;
    }
    
    else if (a==c)
    {
        return b;
    }
    
    
    
    
    
    
    return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void loneSum_test(String []s){
System.out.println(loneSum(19, 20, 19));
System.out.println(loneSum(17, 18, 17));
System.out.println(loneSum(1, 2, 3));
System.out.println(loneSum(5, 5, 6));
System.out.println(loneSum(11, 12, 11));
System.out.println(loneSum(13, 14, 13));
System.out.println(loneSum(15, 16, 15));
System.out.println(loneSum(3, 2, 3));
System.out.println(loneSum(23, 24, 23));
System.out.println(loneSum(1, 1, 1));
System.out.println(loneSum(7, 8, 8));
System.out.println(loneSum(9, 10, 9));
System.out.println(loneSum(2, 2, 3));
System.out.println(loneSum(21, 22, 21));
}

public static void main(String []args){
LONESUM obj = new LONESUM();
obj.loneSum_test(args);
}

}
