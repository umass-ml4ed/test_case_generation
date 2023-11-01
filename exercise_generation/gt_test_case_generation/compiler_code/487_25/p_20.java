public class EVENLYSPACED{
public boolean evenlySpaced(int a, int b, int c){
try {
if (a < b && b < c)
    {
        if (b - a == c - b)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    else if (b < c && c < a)
    {
        if (c-b == a-c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    {
         if ( a - c == b-a)
         { 
             return true;
         }
         else
         {
             return false;
         }
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void evenlySpaced_test(String []s){
System.out.println(evenlySpaced(1, 2, 3));
System.out.println(evenlySpaced(15, 10, 5));
System.out.println(evenlySpaced(6, 8, 4));
System.out.println(evenlySpaced(4, 8, 6));
System.out.println(evenlySpaced(2, 3, 1));
System.out.println(evenlySpaced(2, 1, 3));
System.out.println(evenlySpaced(3, 2, 1));
System.out.println(evenlySpaced(3, 1, 2));
System.out.println(evenlySpaced(10, 15, 5));
System.out.println(evenlySpaced(4, 6, 8));
System.out.println(evenlySpaced(5, 10, 15));
System.out.println(evenlySpaced(7, 14, 21));
System.out.println(evenlySpaced(8, 4, 6));
System.out.println(evenlySpaced(8, 6, 4));
System.out.println(evenlySpaced(21, 14, 7));
System.out.println(evenlySpaced(15, 5, 10));
System.out.println(evenlySpaced(1, 3, 2));
System.out.println(evenlySpaced(5, 15, 10));
System.out.println(evenlySpaced(14, 7, 21));
System.out.println(evenlySpaced(6, 4, 8));
System.out.println(evenlySpaced(10, 5, 15));
}

public static void main(String []args){
EVENLYSPACED obj = new EVENLYSPACED();
obj.evenlySpaced_test(args);
}

}
