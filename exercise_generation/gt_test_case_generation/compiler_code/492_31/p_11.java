public class REPEATEND{
public String repeatEnd(String str, int n){
try {
StringBuilder stbuild = new StringBuilder(n*n);
	String last = str.substring(str.length()-n);
	for(int i = 0; i < n; i++)
    {
		stbuild.append(last);
    }
	return stbuild.toString();
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void repeatEnd_test(String []s){
System.out.println(repeatEnd("Ruby", 3));
System.out.println(repeatEnd("Hello", 2));
System.out.println(repeatEnd("C++", 2));
System.out.println(repeatEnd("Kotlin", 1));
System.out.println(repeatEnd("Goodbye", 3));
System.out.println(repeatEnd("Swift", 4));
System.out.println(repeatEnd("Hello", 0));
System.out.println(repeatEnd("Python", 6));
System.out.println(repeatEnd("JavaScript", 5));
System.out.println(repeatEnd("Java", 1));
System.out.println(repeatEnd("Programming", 4));
}

public static void main(String []args){
REPEATEND obj = new REPEATEND();
obj.repeatEnd_test(args);
}

}
