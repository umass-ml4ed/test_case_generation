public class BOBTHERE{
public boolean bobThere(String str){
try {
int len = str.length() - 2;
	for(int i = 0; i < len; i++)
	{
		if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
			return true;
	}
	return false;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void bobThere_test(String []s){
System.out.println(bobThere("vwx"));
System.out.println(bobThere("pqr"));
System.out.println(bobThere("b7b"));
System.out.println(bobThere("b2b"));
System.out.println(bobThere("bob"));
System.out.println(bobThere("b1b"));
System.out.println(bobThere("mno"));
System.out.println(bobThere("b6b"));
System.out.println(bobThere("b5b"));
System.out.println(bobThere("bb"));
System.out.println(bobThere("jkl"));
System.out.println(bobThere("abcb"));
System.out.println(bobThere("stu"));
System.out.println(bobThere("def"));
System.out.println(bobThere("b3b"));
System.out.println(bobThere("b4b"));
System.out.println(bobThere("abc"));
System.out.println(bobThere("ghi"));
}

public static void main(String []args){
BOBTHERE obj = new BOBTHERE();
obj.bobThere_test(args);
}

}
