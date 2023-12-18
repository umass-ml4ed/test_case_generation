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
System.out.println(repeatEnd("hello", 2));
System.out.println(repeatEnd("world", 3));
System.out.println(repeatEnd("abcde", 0));
System.out.println(repeatEnd("xyz", 1));
System.out.println(repeatEnd("programming", 5));
System.out.println(repeatEnd("java", 4));
System.out.println(repeatEnd("test", 2));
System.out.println(repeatEnd("code", 3));
System.out.println(repeatEnd("example", 1));
System.out.println(repeatEnd("string", 6));
System.out.println(repeatEnd("algorithm", 0));
}

public static void main(String []args){
REPEATEND obj = new REPEATEND();
obj.repeatEnd_test(args);
}

}
