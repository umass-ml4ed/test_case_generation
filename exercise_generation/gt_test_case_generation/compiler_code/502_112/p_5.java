public class SERIESUP{
public int[] seriesUp(int n){
try {
int[] arr = new int[n*(n+1)/2];
    for (int i = 0; i < arr.length; i++)
    {
        arr[0] = 1;
        if (n > 1)
        {
            arr[1] = 1;
            arr[2] = 2;
        }
        if (n > 2)
        {
            arr[3] = 1;
            arr[4] = 2;
            arr[5] = 3;
        }
        if (n > 3)
        {
            arr[6] = 1;
            arr[7] = 2;
            arr[8] = 3;
            arr[9] = 4;
        }
    }
            return arr;
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
