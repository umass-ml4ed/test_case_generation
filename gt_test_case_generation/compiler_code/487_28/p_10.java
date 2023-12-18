public class ATFIRST{
public String atFirst(String str){
try {
int len = str.length();

	if(len >= 2)

		return str.substring(0, 2);

	else if(len == 1)

		return (str.charAt(0)+"@");

	else

		return "@@";
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void atFirst_test(String []s){
System.out.println(atFirst("Hello"));
System.out.println(atFirst("A"));
System.out.println(atFirst("C++"));
System.out.println(atFirst("ABCD"));
System.out.println(atFirst(""));
System.out.println(atFirst("Python"));
System.out.println(atFirst("Hi"));
System.out.println(atFirst("ABC"));
System.out.println(atFirst("Java"));
System.out.println(atFirst("JavaScript"));
}

public static void main(String []args){
ATFIRST obj = new ATFIRST();
obj.atFirst_test(args);
}

}
