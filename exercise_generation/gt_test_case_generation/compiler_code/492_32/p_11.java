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
System.out.println(plusOut("Hello World", "d"));
System.out.println(plusOut("Hello World", "r"));
System.out.println(plusOut("Hello World", "e"));
System.out.println(plusOut("Hello World", "Hello"));
System.out.println(plusOut("Hello World", "He"));
System.out.println(plusOut("Hello Worldl", "l"));
System.out.println(plusOut("Hello World", "W"));
System.out.println(plusOut("Hello World", "H"));
System.out.println(plusOut("Hello World", "o"));
System.out.println(plusOut("Hello World", " "));
System.out.println(plusOut("Hello World", "World"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
