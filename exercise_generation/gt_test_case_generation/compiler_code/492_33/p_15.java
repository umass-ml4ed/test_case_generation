public class MIXSTRING{
public String mixString(String a, String b){
try {
int aLen = a.length();
	int bLen = b.length();
	int i = 0;
	StringBuilder stbuild = new StringBuilder(aLen+bLen);

	for(; i < aLen && i < bLen; i++)
	{
		stbuild.append(a.charAt(i));
		stbuild.append(b.charAt(i));
	}
	for(; i < aLen; i++)
    {
		stbuild.append(a.charAt(i));
    }
	for(; i < bLen; i++)
    {
		stbuild.append(b.charAt(i));
    }
	return stbuild.toString();
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void mixString_test(String []s){
System.out.println(mixString("abcdefg", "hijklm"));
System.out.println(mixString("abc", "defgh"));
System.out.println(mixString("abcde", ""));
System.out.println(mixString("abcdefghi", "jklmno"));
System.out.println(mixString("abc", "def"));
System.out.println(mixString("abcd", "efgh"));
System.out.println(mixString("a", "b"));
System.out.println(mixString("abc", "defg"));
System.out.println(mixString("abcdefgh", "ijklmn"));
System.out.println(mixString("abcde", "fghij"));
System.out.println(mixString("", "defgh"));
System.out.println(mixString("abcde", "fgh"));
System.out.println(mixString("abcdefghij", "klmnopqr"));
System.out.println(mixString("abcdef", "ghijk"));
System.out.println(mixString("ab", "cd"));
}

public static void main(String []args){
MIXSTRING obj = new MIXSTRING();
obj.mixString_test(args);
}

}
