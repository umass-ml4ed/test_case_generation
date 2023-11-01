public class XYBALANCE{
public boolean xyBalance(String str){
try {
int x = 0;
    int y = 0;
    boolean answer = false;
    for (int i = 0; i < str.length(); i++)
    {
        if (str.substring(i, i + 1).equals("x"))
        {
         	x = i;   
        }
        else if (str.substring(i, i + 1).equals("y"))
        {
         	y = i;   
        }
    }
    if (x == 0)
    {
        answer = true;
    }
    else if (y > x)
    {
     	answer = true;   
    }
        
    
    
    return answer;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void xyBalance_test(String []s){
System.out.println(xyBalance("xyyxxy"));
System.out.println(xyBalance("xyyxxyyxyx"));
System.out.println(xyBalance("xyyxxyyxyxyxx"));
System.out.println(xyBalance("xyyxxyyxx"));
System.out.println(xyBalance("xxy"));
System.out.println(xyBalance("xyyxxyyxyxyxy"));
System.out.println(xyBalance("xyyxxyy"));
System.out.println(xyBalance("xyyxxyyxyxy"));
System.out.println(xyBalance("xx"));
System.out.println(xyBalance("xyxy"));
System.out.println(xyBalance("xyyxxyyxyxyxyx"));
System.out.println(xyBalance("xyyxxyyxyxyxyxx"));
System.out.println(xyBalance("xyyxxyyxyxyxyxy"));
System.out.println(xyBalance("xyyx"));
System.out.println(xyBalance("xyyxxyyxyxx"));
System.out.println(xyBalance("xyyxxyyxyxyx"));
System.out.println(xyBalance("xyyxxyyx"));
System.out.println(xyBalance("xyyxxyyxy"));
}

public static void main(String []args){
XYBALANCE obj = new XYBALANCE();
obj.xyBalance_test(args);
}

}
