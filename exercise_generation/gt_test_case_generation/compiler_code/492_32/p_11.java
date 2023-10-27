public class PLUSOUT{
public String plusOut(String str, String word){
try {
int len = str.length();
	int wLen = word.length();
	int pos = str.indexOf(word);
	int i = 0;
	StringBuilder stbuild = new StringBuilder(len);
	while(pos != -1)
	{
		while(i < pos)
		{
			stbuild.append('+');
			i++;
		}
		stbuild.append(word);
		i = pos + wLen;
		pos = str.indexOf(word, i);
	}
	for(; i < len; i++)
    {
		stbuild.append('+');
    }
	return stbuild.toString();
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void plusOut_test(String []s){
System.out.println(plusOut("HelloWorld", "lo"));
System.out.println(plusOut("HelloWorld", "Hel"));
System.out.println(plusOut("HelloWorld", "H"));
System.out.println(plusOut("Hello", "He"));
System.out.println(plusOut("Hello", "ll"));
System.out.println(plusOut("HelloWorld", "llo"));
System.out.println(plusOut("Hello", "el"));
System.out.println(plusOut("Hello", "o"));
System.out.println(plusOut("Hello", "e"));
System.out.println(plusOut("Hello", "llo"));
System.out.println(plusOut("Hello", "Hell"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
