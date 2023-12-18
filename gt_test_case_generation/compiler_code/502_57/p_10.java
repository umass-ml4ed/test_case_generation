public class FIZZARRAY{
public int[] fizzArray(int n){
try {
int a = 0;
    int[] array = new int[n];
    for (int i = 0; i < n; i++)
    {
        array[i] = a;
        a++;
    }
    return array;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void fizzArray_test(String []s){
System.out.println(fizzArray(0));
System.out.println(fizzArray(1));
System.out.println(fizzArray(6));
System.out.println(fizzArray(3));
System.out.println(fizzArray(7));
System.out.println(fizzArray(5));
System.out.println(fizzArray(4));
System.out.println(fizzArray(9));
System.out.println(fizzArray(2));
System.out.println(fizzArray(8));
}

public static void main(String []args){
FIZZARRAY obj = new FIZZARRAY();
obj.fizzArray_test(args);
}

}
