public class REPEATEND{
public String repeatEnd(String str, int n){
try {
String end = str.substring(str.length() - n);
    return end;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void repeatEnd_test(String []s){
System.out.println(repeatEnd("World", 3));
System.out.println(repeatEnd("Hello", 2));
System.out.println(repeatEnd("Test", 3));
System.out.println(repeatEnd("World", 1));
System.out.println(repeatEnd("Case", 1));
System.out.println(repeatEnd("Test", 1));
System.out.println(repeatEnd("Programming", 1));
System.out.println(repeatEnd("Hello", 1));
System.out.println(repeatEnd("Java", 1));
System.out.println(repeatEnd("Programming", 4));
System.out.println(repeatEnd("Java", 2));
}

public static void main(String []args){
REPEATEND obj = new REPEATEND();
obj.repeatEnd_test(args);
}

}
