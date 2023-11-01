public class ZIPZAP{
public String zipZap(String str){
try {
String string = new String();
    if (str.length() >= 3)
    {
    	for (int i = 0;  i < str.length() - 2; i++)
    	{
        	if (str.substring(i, i + 1).equals("z") && 			str.substring(i + 2, i + 3).equals("p"))
     	   {
        	    string = string + "zp";
            	i = i + 2;
        	}
        	else
        	{
            	string = string + str.substring(i, i + 1);
        	}
    	}
    	if (str.substring(str.length()) != "p")
    	{
        	return string + str.substring(str.length());
    	}
    	else
    	{
    		return string;
    	}
    }
    else
    {
        return str;
    }
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void zipZap_test(String []s){
System.out.println(zipZap("zipzapzipzapzipzapzipzap"));
System.out.println(zipZap("zipzap"));
System.out.println(zipZap("zipzapzip"));
System.out.println(zipZap("zi"));
System.out.println(zipZap("zipzapzipzapzip"));
System.out.println(zipZap("zipzapzipzapzipzapzip"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzip"));
System.out.println(zipZap("ziz"));
System.out.println(zipZap("ziap"));
System.out.println(zipZap("z"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzapzip"));
System.out.println(zipZap("zipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzapzipzapzipzap"));
System.out.println(zipZap("zipzapzipzapzipzap"));
}

public static void main(String []args){
ZIPZAP obj = new ZIPZAP();
obj.zipZap_test(args);
}

}
