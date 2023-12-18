public class SORTASUM{
public int sortaSum(int a, int b)
{
    int C = a + b;
	if(C >= 10 && C <= 19)
    {
		return 20;
    }
    else
    {
	    return C;
    }
}

public void sortaSum_test(String []s){
System.out.println(sortaSum(6, 5));
System.out.println(sortaSum(5, 4));
System.out.println(sortaSum(4, 3));
System.out.println(sortaSum(3, 2));
System.out.println(sortaSum(2, 1));
System.out.println(sortaSum(1, 0));
}

public static void main(String []args){
SORTASUM obj = new SORTASUM();
obj.sortaSum_test(args);
}

}
