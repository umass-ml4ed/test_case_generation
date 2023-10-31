public class SORTASUM{
public int sortaSum(int a, int b){
try {
int sum = a + b;
    if (a + b < 19 && a + b > 10)
    {
        return(20);
    }
    else
    {
        return(sum);
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sortaSum_test(String []s){
System.out.println(sortaSum(11, 0));
System.out.println(sortaSum(7, 3));
System.out.println(sortaSum(6, 4));
System.out.println(sortaSum(8, 3));
System.out.println(sortaSum(3, 8));
System.out.println(sortaSum(1, 10));
System.out.println(sortaSum(7, 4));
System.out.println(sortaSum(6, 5));
System.out.println(sortaSum(4, 7));
System.out.println(sortaSum(9, 2));
System.out.println(sortaSum(2, 9));
System.out.println(sortaSum(10, 1));
System.out.println(sortaSum(4, 6));
System.out.println(sortaSum(5, 5));
System.out.println(sortaSum(5, 6));
}

public static void main(String []args){
SORTASUM obj = new SORTASUM();
obj.sortaSum_test(args);
}

}
