public class SORTASUM{
public int sortaSum(int a, int b){
try {
int sum = a + b;
    if (sum > 10)
        if (sum <19)
            return 20;
    return sum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sortaSum_test(String []s){
System.out.println(sortaSum(3, 7));
System.out.println(sortaSum(3, 2));
System.out.println(sortaSum(3, 8));
System.out.println(sortaSum(4, 7));
System.out.println(sortaSum(0, 10));
System.out.println(sortaSum(5, 6));
System.out.println(sortaSum(8, 2));
System.out.println(sortaSum(4, 3));
System.out.println(sortaSum(1, 10));
System.out.println(sortaSum(7, 3));
System.out.println(sortaSum(0, 0));
System.out.println(sortaSum(0, 19));
System.out.println(sortaSum(10, 0));
System.out.println(sortaSum(2, 2));
System.out.println(sortaSum(11, 0));
System.out.println(sortaSum(1, 9));
System.out.println(sortaSum(4, 4));
System.out.println(sortaSum(19, 0));
System.out.println(sortaSum(10, 1));
System.out.println(sortaSum(2, 8));
System.out.println(sortaSum(2, 9));
System.out.println(sortaSum(9, 2));
System.out.println(sortaSum(6, 5));
System.out.println(sortaSum(4, 6));
System.out.println(sortaSum(9, 1));
System.out.println(sortaSum(3, 3));
System.out.println(sortaSum(8, 3));
System.out.println(sortaSum(7, 4));
System.out.println(sortaSum(5, 5));
System.out.println(sortaSum(6, 4));
System.out.println(sortaSum(1, 1));
}

public static void main(String []args){
SORTASUM obj = new SORTASUM();
obj.sortaSum_test(args);
}

}
