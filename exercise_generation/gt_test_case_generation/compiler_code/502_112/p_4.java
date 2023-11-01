public class SERIESUP{
public int[] seriesUp(int n){
try {
int[] out = new int[n * (n + 1)/2];
    int number = 1;
    while (number <= n)
    {
        if (number < 3)
        {
        for (int i = 0; i < number; i++)
        {
            out[number + i - 1] = i + 1;
        }
        number = number + 1;
        }
        else
        {
            for (int j = 1; j <= number; j++)
            {
                out[number + j - 1] = j;
            }
            number = number + 1;
        }
    }
    return out;
} catch (Exception e) {
System.out.print(e + " ");
return new int[] {-999};
}
}

public void seriesUp_test(String []s){
System.out.println(seriesUp(0));
System.out.println(seriesUp(1));
System.out.println(seriesUp(3));
System.out.println(seriesUp(5));
System.out.println(seriesUp(4));
}

public static void main(String []args){
SERIESUP obj = new SERIESUP();
obj.seriesUp_test(args);
}

}
