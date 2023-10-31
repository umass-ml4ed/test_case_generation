public class SORTASUM{
public int sortaSum(int a, int b){
try {
int C = a + b;
	if(C >= 10 && C <= 19)
    {
		return 20;
    }
    else
    {
	    return C;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void sortaSum_test(String []s){
System.out.println(sortaSum(10, 0));
System.out.println(sortaSum(2, 8));
System.out.println(sortaSum(1, 9));
System.out.println(sortaSum(8, 2));
System.out.println(sortaSum(0, 19));
System.out.println(sortaSum(19, 0));
System.out.println(sortaSum(0, 10));
System.out.println(sortaSum(9, 1));
System.out.println(sortaSum(6, 4));
System.out.println(sortaSum(7, 4));
System.out.println(sortaSum(4, 6));
System.out.println(sortaSum(4, 7));
System.out.println(sortaSum(7, 3));
System.out.println(sortaSum(3, 7));
System.out.println(sortaSum(5, 5));
}

public static void main(String []args){
SORTASUM obj = new SORTASUM();
obj.sortaSum_test(args);
}

}
