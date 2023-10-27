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
System.out.println(repeatEnd("hello", 2));
System.out.println(repeatEnd("world", 3));
System.out.println(repeatEnd("abcde", 0));
System.out.println(repeatEnd("xyz", 1));
System.out.println(repeatEnd("programming", 5));
System.out.println(repeatEnd("java", 4));
System.out.println(repeatEnd("test", 2));
System.out.println(repeatEnd("code", 3));
System.out.println(repeatEnd("hello world", 11));
System.out.println(repeatEnd("abc", 2));
System.out.println(repeatEnd("xyz", 0));
}

public static void main(String []args){
REPEATEND obj = new REPEATEND();
obj.repeatEnd_test(args);
}

}
