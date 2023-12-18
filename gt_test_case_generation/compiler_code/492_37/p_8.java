public class ENDOTHER{
public boolean endOther(String a, String b){
try {
int la = a.length();
    int lb = b.length();
    if (la - lb >= 0)
    {
        String sa = a.substring(la - lb, la);
    	if (sa == b)
    	{
        	return true;
    	}
    	else
    	{
        	return false;
    	}
    }
    else if (lb - la >= 0)
    {
    	String sb = b.substring(lb - la, lb);
    	if (sb == a)
    	{
        	return true;
    	}
    	else
    	{
        	return false;
    	}
    }
    else
    {
        return false;
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void endOther_test(String []s){
System.out.println(endOther("Hello", "lo"));
System.out.println(endOther("Hello", "HE"));
System.out.println(endOther("Hello", "He"));
System.out.println(endOther("abc", "abc"));
System.out.println(endOther("abc", "c"));
System.out.println(endOther("", "abc"));
System.out.println(endOther("Hello", "LO"));
System.out.println(endOther("ABC", "abc"));
System.out.println(endOther("abc", "b"));
System.out.println(endOther("abc", "B"));
System.out.println(endOther("abc", "A"));
System.out.println(endOther("abc", ""));
System.out.println(endOther("abc", "a"));
System.out.println(endOther("abc", "C"));
System.out.println(endOther("abc", "ABC"));
}

public static void main(String []args){
ENDOTHER obj = new ENDOTHER();
obj.endOther_test(args);
}

}
