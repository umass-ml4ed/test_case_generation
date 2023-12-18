public class WITHOUT2{
public String without2(String str){
try {
int len = str.length();

	if(len >= 2)

	{

		if(str.substring(0,2).equals(str.substring(len-2, len)))

			return str.substring(2);

		else

			return str;

	}

	else

		return str;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void without2_test(String []s){
System.out.println(without2("abcdeabcde"));
System.out.println(without2("abcdeac"));
System.out.println(without2(""));
System.out.println(without2("abab"));
System.out.println(without2("ab"));
System.out.println(without2("abcdeabce"));
System.out.println(without2("abcdeabcd"));
System.out.println(without2("Hi"));
System.out.println(without2("abcdeabc"));
System.out.println(without2("HelloHe"));
System.out.println(without2("a"));
System.out.println(without2("abcdeab"));
}

public static void main(String []args){
WITHOUT2 obj = new WITHOUT2();
obj.without2_test(args);
}

}
