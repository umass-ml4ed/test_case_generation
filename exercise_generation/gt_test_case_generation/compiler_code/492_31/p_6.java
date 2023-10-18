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
System.out.println(repeatEnd("abc", 2));
System.out.println(repeatEnd("hello", 0));
System.out.println(repeatEnd("programming", 5));
System.out.println(repeatEnd("test", 4));
System.out.println(repeatEnd("java", 1));
System.out.println(repeatEnd("code", 3));
System.out.println(repeatEnd("abcde", 5));
System.out.println(repeatEnd("xyz", 2));
System.out.println(repeatEnd("hello world", 11));
System.out.println(repeatEnd("programming", 0));
System.out.println(repeatEnd("test", 1));
}

public static void main(String []args){
REPEATEND obj = new REPEATEND();
obj.repeatEnd_test(args);
}

}
