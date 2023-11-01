public class XYBALANCE{
public boolean xyBalance(String str){
try {
int x = str.indexOf("x");
    int xy = str.indexOf("xy");
    int xxy = str.indexOf("xxy");
    int xbby = str.indexOf("xbby");
    if (xy >= 0 || xxy >= 0 || xbby >= 0)
    {
        return true;
    }
    else
    {
        return false;
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void xyBalance_test(String []s){
System.out.println(xyBalance("xyxxy"));
System.out.println(xyBalance("x"));
System.out.println(xyBalance("xxxy"));
System.out.println(xyBalance("xxyxx"));
System.out.println(xyBalance("xxy"));
System.out.println(xyBalance("xbbyxxy"));
System.out.println(xyBalance("xxyxxy"));
System.out.println(xyBalance("xx"));
System.out.println(xyBalance("xyxy"));
System.out.println(xyBalance("xxyxy"));
System.out.println(xyBalance("xyxbby"));
System.out.println(xyBalance("xy"));
System.out.println(xyBalance("xbbyxx"));
System.out.println(xyBalance("xxyx"));
System.out.println(xyBalance("xyx"));
System.out.println(xyBalance("xbby"));
System.out.println(xyBalance("xbbyxy"));
System.out.println(xyBalance("xbbyx"));
}

public static void main(String []args){
XYBALANCE obj = new XYBALANCE();
obj.xyBalance_test(args);
}

}
