public class REPEATEND{
public String repeatEnd(String str, int n){
try {
int length = str.length();
    int i = 1;
    String rep = str.substring(length - n, length);
    while (i < n)
    {
        rep = rep + rep;
        i++;
    }
    return rep;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void repeatEnd_test(String []s){
System.out.println(repeatEnd("Bug", 1));
System.out.println(repeatEnd("World", 3));
System.out.println(repeatEnd("Hello", 2));
System.out.println(repeatEnd("World", 2));
System.out.println(repeatEnd("Case", 0));
System.out.println(repeatEnd("Programming", 1));
System.out.println(repeatEnd("Hello", 1));
System.out.println(repeatEnd("Test", 0));
System.out.println(repeatEnd("Java", 1));
System.out.println(repeatEnd("Java", 2));
System.out.println(repeatEnd("Fix", 1));
}

public static void main(String []args){
REPEATEND obj = new REPEATEND();
obj.repeatEnd_test(args);
}

}
