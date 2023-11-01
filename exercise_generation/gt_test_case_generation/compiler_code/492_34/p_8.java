public class ZIPZAP{
public String zipZap(String str){
try {
String out = "";
    for (int i = 0; i < str.length() - 2; i++) {
        if (!(str.charAt(i) == 'z' && str.charAt(i+2) == 'p')) {
            out = out + str.substring(i, i+1);
        }
        else {
            out = out + str.substring(i, i+1) + str.substring(i+2, i+3);
            i += 2;
        }
    }
    return out;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void zipZap_test(String []s){
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzipzapzp"));
System.out.println(zipZap("zipzapzipzapzipzapzp"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzp"));
System.out.println(zipZap("zipzap"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzp"));
System.out.println(zipZap("zipzapzipzapzp"));
System.out.println(zipZap("zipzapzp"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzipzapzipzapzipzapzipzap"));
System.out.println(zipZap("zipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzipzapzipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzapzipzap"));
}

public static void main(String []args){
ZIPZAP obj = new ZIPZAP();
obj.zipZap_test(args);
}

}
