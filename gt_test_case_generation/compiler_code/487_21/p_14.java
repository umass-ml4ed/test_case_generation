public class LUCKYSUM{
public int luckySum(int a, int b, int c){
try {
int small = 0;
    int med = 0;
    int large = 0;
    
    if (a < b && a < c)
    {
        small = a;
        if (b < c)
        {
            med = b;
            large = c;
        }
        else
        {
            med = c;
            large = b;
        }
    }
    
     if (b < a && b < c)
    {
        small = b;
        if (a < c)
        {
            med = a;
            large = c;
        }
        else
        {
            med = c;
            large = a;
        }
    }
    
    if (c < b && c < a)
    {
        small = c;
        if (a < b)
        {
            med = a;
            large = b;
        }
        else
        {
            med = b;
            large = a;
        }
    }
    int sum = 0;
    if (small == 13)
    {
        sum = 0;
    }
    else if (med == 13)
    {
        sum = small;
    }
    else if (large == 13)
    {
        sum = small + med;
    }
    else
    {
        sum = small + med + large;
    }
    
    return sum;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void luckySum_test(String []s){
System.out.println(luckySum(1, 2, 3));
System.out.println(luckySum(13, 14, 15));
System.out.println(luckySum(-3, 13, -4));
System.out.println(luckySum(12, 13, 14));
System.out.println(luckySum(-1, 13, -3));
System.out.println(luckySum(0, 0, 0));
System.out.println(luckySum(-2, 13, -1));
System.out.println(luckySum(-3, -2, 13));
System.out.println(luckySum(-1, -2, 13));
System.out.println(luckySum(3, 13, 4));
System.out.println(luckySum(13, 20, 30));
System.out.println(luckySum(10, 20, 30));
System.out.println(luckySum(13, 13, 13));
System.out.println(luckySum(-1, -2, -3));
System.out.println(luckySum(2, 13, 3));
System.out.println(luckySum(13, -2, -3));
System.out.println(luckySum(10, 13, 30));
System.out.println(luckySum(3, 2, 13));
System.out.println(luckySum(10, 20, 13));
System.out.println(luckySum(1, 2, 13));
}

public static void main(String []args){
LUCKYSUM obj = new LUCKYSUM();
obj.luckySum_test(args);
}

}
