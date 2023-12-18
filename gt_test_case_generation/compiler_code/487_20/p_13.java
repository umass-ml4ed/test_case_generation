public class LONESUM{
public int loneSum(int a, int b, int c){
try {
if (a == c) {
        if (c == b || a == b) {
            return 0;
        }
        else {
            return b;
        }
    }
    else if (b == c) {
        return a;
    }
    else {
        return a + b + c;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void loneSum_test(String []s){
System.out.println(loneSum(10, 11, 10));
System.out.println(loneSum(1, 2, 3));
System.out.println(loneSum(6, 7, 6));
System.out.println(loneSum(9, 8, 9));
System.out.println(loneSum(3, 2, 3));
System.out.println(loneSum(1, 1, 1));
System.out.println(loneSum(3, 3, 3));
System.out.println(loneSum(4, 5, 4));
System.out.println(loneSum(1, 1, 3));
System.out.println(loneSum(2, 3, 2));
System.out.println(loneSum(5, 4, 5));
System.out.println(loneSum(8, 9, 8));
System.out.println(loneSum(2, 2, 2));
System.out.println(loneSum(7, 6, 7));
}

public static void main(String []args){
LONESUM obj = new LONESUM();
obj.loneSum_test(args);
}

}
