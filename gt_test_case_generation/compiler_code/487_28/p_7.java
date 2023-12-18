public class ATFIRST{
public String atFirst(String str){
try {
int length = str.length();
    if (length == 0)
        return "@@";
    else if (length == 1)
    {
        return str;
    }
    else
        return str.substring(0,2);
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void atFirst_test(String []s){
System.out.println(atFirst("abcdef"));
System.out.println(atFirst("abcdefgh"));
System.out.println(atFirst("abcdefg"));
System.out.println(atFirst("b"));
System.out.println(atFirst("ab"));
System.out.println(atFirst("z"));
System.out.println(atFirst("a"));
System.out.println(atFirst("abcd"));
System.out.println(atFirst("abc"));
System.out.println(atFirst("abcde"));
}

public static void main(String []args){
ATFIRST obj = new ATFIRST();
obj.atFirst_test(args);
}

}
