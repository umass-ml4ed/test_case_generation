public class COUNTCODE{
public int countCode(String str){
try {
int s = 0;
    for (int i = 0; i < str.length() - 3; i++) 
    {
    if ("co".equals(str.substring(i, i + 2)) && (str.charAt(i + 3) == 'e'))
        {
            return s + 1;
        }
    }
    return s;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countCode_test(String []s){
System.out.println(countCode("coqe"));
System.out.println(countCode("coye"));
System.out.println(countCode("cooecooe"));
System.out.println(countCode("coie"));
System.out.println(countCode("cobe"));
System.out.println(countCode("codecode"));
System.out.println(countCode("coce"));
System.out.println(countCode("cove"));
System.out.println(countCode("cofe"));
System.out.println(countCode("coue"));
System.out.println(countCode("coaecoae"));
System.out.println(countCode("cope"));
System.out.println(countCode("coae"));
System.out.println(countCode("code"));
System.out.println(countCode("coze"));
System.out.println(countCode("copecope"));
System.out.println(countCode("coiecoie"));
}

public static void main(String []args){
COUNTCODE obj = new COUNTCODE();
obj.countCode_test(args);
}

}
