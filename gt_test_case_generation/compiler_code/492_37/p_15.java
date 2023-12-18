public class ENDOTHER{
public boolean endOther(String a, String b){
try {
int aLen = a.length();
	int bLen = b.length();
	String end;
	String temp;
	a = a.toLowerCase();
	b = b.toLowerCase();
	if(aLen >= bLen)
	{
		end = a.substring(aLen - bLen);
		temp = b;
	}
	else
	{
		end = b.substring(bLen - aLen);
	    temp = a;
	}
	return (end.equals(temp));
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void endOther_test(String []s){
System.out.println(endOther("Hello", "HELlO"));
System.out.println(endOther("Hello", "lo"));
System.out.println(endOther("Hello", "hElLo"));
System.out.println(endOther("Hello", "Hello"));
System.out.println(endOther("Hello", "hELLO"));
System.out.println(endOther("Hello", "hELLo"));
System.out.println(endOther("Hello", "llo"));
System.out.println(endOther("Hello", "world"));
System.out.println(endOther("Hello", "heLLO"));
System.out.println(endOther("Hello", "HeLLo"));
System.out.println(endOther("Hello", "LLO"));
System.out.println(endOther("Hello", "HELLO"));
System.out.println(endOther("Hello", "HELlo"));
System.out.println(endOther("Hello", "o"));
System.out.println(endOther("Hello", "hello"));
}

public static void main(String []args){
ENDOTHER obj = new ENDOTHER();
obj.endOther_test(args);
}

}
