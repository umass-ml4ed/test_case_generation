public class ATFIRST{
public String atFirst(String str){
try {
if (str.length() < 2)
        return str.substring(0, 2) + '@';
    else
        return str.substring(0, 2);
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void atFirst_test(String []s){
System.out.println(atFirst("Hello"));
System.out.println(atFirst("Code"));
System.out.println(atFirst("A"));
System.out.println(atFirst("1"));
System.out.println(atFirst(""));
System.out.println(atFirst("Test"));
System.out.println(atFirst("World"));
System.out.println(atFirst("B"));
System.out.println(atFirst("Program"));
System.out.println(atFirst("Java"));
}

public static void main(String []args){
ATFIRST obj = new ATFIRST();
obj.atFirst_test(args);
}

}
