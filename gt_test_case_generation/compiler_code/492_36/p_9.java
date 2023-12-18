public class COUNTCODE{
public int countCode(String str){
try {
int stringLength = str.length();
    if (stringLength > 0)
    {
        for (int i = 0; i < stringLength; i++)
    	{
       	 	int findCO = str.indexOf("co", i);
    		int findE = str.indexOf("e", i);
        	int numberOfCode = 0;
        	if (findE - findCO == 3)
        	{
            	numberOfCode = numberOfCode + 1;
        	}
        	return numberOfCode;
    	}
    }
    else
    {
        return 0;
    }
    return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countCode_test(String []s){
System.out.println(countCode("coqe"));
System.out.println(countCode("coye"));
System.out.println(countCode("coie"));
System.out.println(countCode("co e"));
System.out.println(countCode("co  e"));
System.out.println(countCode("co   e"));
System.out.println(countCode("co      e"));
System.out.println(countCode("coue"));
System.out.println(countCode("cope"));
System.out.println(countCode("cooe"));
System.out.println(countCode("c o e"));
System.out.println(countCode("coae"));
System.out.println(countCode("code"));
System.out.println(countCode("co       e"));
System.out.println(countCode("coze"));
System.out.println(countCode("co     e"));
System.out.println(countCode("co    e"));
}

public static void main(String []args){
COUNTCODE obj = new COUNTCODE();
obj.countCode_test(args);
}

}
