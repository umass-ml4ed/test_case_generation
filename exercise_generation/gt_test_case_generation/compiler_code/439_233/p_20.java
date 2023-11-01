public class LOVE6{
public boolean love6(int a, int b){
try {
if (a == 6 || b == 6 || a + b == 6 || a - b == 6)
        
    {
        return true;
    }
    
    else
    {
        return false;
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void love6_test(String []s){
System.out.println(love6(10, 16));
System.out.println(love6(10, 4));
System.out.println(love6(3, 3));
System.out.println(love6(6, 0));
System.out.println(love6(6, 6));
System.out.println(love6(0, -6));
System.out.println(love6(-6, 0));
System.out.println(love6(2, 4));
System.out.println(love6(1, 6));
System.out.println(love6(8, 2));
System.out.println(love6(6, 1));
System.out.println(love6(7, 1));
System.out.println(love6(9, 3));
System.out.println(love6(3, 9));
System.out.println(love6(-3, -3));
System.out.println(love6(0, 6));
System.out.println(love6(2, 8));
System.out.println(love6(4, 2));
System.out.println(love6(1, 7));
System.out.println(love6(-6, -6));
System.out.println(love6(4, 10));
}

public static void main(String []args){
LOVE6 obj = new LOVE6();
obj.love6_test(args);
}

}
