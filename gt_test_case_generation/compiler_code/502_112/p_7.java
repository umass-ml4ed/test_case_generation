public class SERIESUP{
public int[] seriesUp(int n){
try {
int a = 1;
    int b = 1;
    int[] array = new int[n * (n + 1)/2];
    for (int i = 0; i < array.length; i++)
    {
        for (; b <= a; b++)
        {
           array[i] = b;
            i++;
        }
        i--;
        a++;
        b = 1;
    }
    return array;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void seriesUp_test(String []s){
System.out.println(seriesUp(1));
System.out.println(seriesUp(6));
System.out.println(seriesUp(3));
System.out.println(seriesUp(5));
System.out.println(seriesUp(4));
System.out.println(seriesUp(2));
}

public static void main(String []args){
SERIESUP obj = new SERIESUP();
obj.seriesUp_test(args);
}

}
