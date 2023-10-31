public class SORTASUM{
public int sortaSum(int a, int b){
try {
if (a >= 5 && b >= 5)
        return 20;
    else
        return a+b;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sortaSum_test(String []s){
System.out.println(sortaSum(10, 0));
System.out.println(sortaSum(2, 2));
System.out.println(sortaSum(8, 2));
System.out.println(sortaSum(0, 0));
System.out.println(sortaSum(1, 1));
System.out.println(sortaSum(3, 2));
System.out.println(sortaSum(9, 1));
System.out.println(sortaSum(6, 4));
System.out.println(sortaSum(3, 3));
System.out.println(sortaSum(4, 3));
System.out.println(sortaSum(4, 4));
System.out.println(sortaSum(6, 5));
System.out.println(sortaSum(7, 3));
System.out.println(sortaSum(5, 6));
System.out.println(sortaSum(5, 5));
}

public static void main(String []args){
SORTASUM obj = new SORTASUM();
obj.sortaSum_test(args);
}

}
