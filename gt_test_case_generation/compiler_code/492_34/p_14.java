public class ZIPZAP{
public String zipZap(String str){
try {
int len = str.length();
	int lim = len - 2;
	int i = 0;
	char ch;
	StringBuilder stbuild = new StringBuilder(len);
	while(i < len)
	{
		ch = str.charAt(i);
		if(ch == 'z' && i < lim && str.charAt(i+2) == 'p')
		{
			stbuild.append("zp");
			i += 3;
		}
		else
		{
			stbuild.append(ch);
			i++;
		}
	 }
	return stbuild.toString();
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void zipZap_test(String []s){
System.out.println(zipZap("zipZapZop"));
System.out.println(zipZap("zopZop"));
System.out.println(zipZap("zipZap"));
System.out.println(zipZap("zipzapZop"));
System.out.println(zipZap("zipZapZopZop"));
System.out.println(zipZap("zipZop"));
System.out.println(zipZap("zizp"));
System.out.println(zipZap("zipzapZopZop"));
System.out.println(zipZap("zopZapZopZop"));
System.out.println(zipZap("zopZapZop"));
System.out.println(zipZap("zipZopZopZop"));
System.out.println(zipZap("zopZopZop"));
System.out.println(zipZap("zipZopZop"));
System.out.println(zipZap("zopZap"));
}

public static void main(String []args){
ZIPZAP obj = new ZIPZAP();
obj.zipZap_test(args);
}

}
