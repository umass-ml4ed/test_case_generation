public class PLUSOUT{
public String plusOut(String str, String word)
{
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
}

public void plusOut_test(String []s){
System.out.println(plusOut("hello", "lo"));
System.out.println(plusOut("hello", "o"));
System.out.println(plusOut("hello", "hello"));
System.out.println(plusOut("hello", "he"));
System.out.println(plusOut("hello", "l"));
System.out.println(plusOut("hello", ""));
System.out.println(plusOut("abcabcabc", "abc"));
System.out.println(plusOut("abcabcabc", "b"));
System.out.println(plusOut("abcabcabc", "c"));
System.out.println(plusOut("abcabcabc", "d"));
System.out.println(plusOut("abcabcabc", "abcabcabc"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
