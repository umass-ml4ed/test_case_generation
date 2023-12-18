public class ZIPZAP{
public String zipZap(String str){
try {
int num = str.length();
    String str1 = "";
    String str2 = str;
    while(str2.length() > 0)
    {
        if(str2.startsWith("z") && str2.substring(2).startsWith("p"))
        {
            str1 = str1 + "zp";
            str2 = str2.substring(3);
            num = num - 3;
        }
        else
        {
            str1 = str1 + str2.charAt(0);
            str2 = str2.substring(1);
            num = num - 1;
        }
    }
    return str1;
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
