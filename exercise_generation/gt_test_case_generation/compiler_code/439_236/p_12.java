public class GREENTICKET{
public int greenTicket(int a, int b, int c){
try {
if (a == b)
    {
        if (b == c)
        {
            return 20;
        }
        else
        {
            return 10;
        }
    }
    if (a == c || b == c)
    {
        return 10;
    }
    else
    {
        return 0;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void greenTicket_test(String []s){
System.out.println(greenTicket(1, 1, 1));
System.out.println(greenTicket(3, 3, 3));
System.out.println(greenTicket(2, 3, 2));
System.out.println(greenTicket(2, 2, 2));
System.out.println(greenTicket(3, 4, 3));
System.out.println(greenTicket(1, 2, 1));
System.out.println(greenTicket(4, 4, 4));
System.out.println(greenTicket(3, 4, 4));
System.out.println(greenTicket(2, 3, 3));
System.out.println(greenTicket(4, 5, 5));
System.out.println(greenTicket(1, 2, 2));
System.out.println(greenTicket(4, 5, 4));
}

public static void main(String []args){
GREENTICKET obj = new GREENTICKET();
obj.greenTicket_test(args);
}

}
