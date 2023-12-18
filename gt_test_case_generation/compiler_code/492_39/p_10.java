public class XYBALANCE{
public boolean xyBalance(String str){
try {
int len = str.length() - 3;
    for (int i=0; i <= len; i ++)
    {
        if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'x')
            return false;
        
    }
    return true;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void xyBalance_test(String []s){
System.out.println(xyBalance("xyyxxy"));
System.out.println(xyBalance("xyxxy"));
System.out.println(xyBalance("xyxyxy"));
System.out.println(xyBalance("xxyx"));
System.out.println(xyBalance("xxyyx"));
System.out.println(xyBalance("xxy"));
System.out.println(xyBalance("xyyxx"));
System.out.println(xyBalance("yyxx"));
System.out.println(xyBalance("xxyxy"));
System.out.println(xyBalance("xyyxxyx"));
System.out.println(xyBalance("yxx"));
System.out.println(xyBalance("xyxyx"));
System.out.println(xyBalance("xxyyxx"));
System.out.println(xyBalance("xy"));
System.out.println(xyBalance("xyx"));
System.out.println(xyBalance("xxyy"));
System.out.println(xyBalance("xyxx"));
System.out.println(xyBalance("xxyyxxy"));
}

public static void main(String []args){
XYBALANCE obj = new XYBALANCE();
obj.xyBalance_test(args);
}

}
