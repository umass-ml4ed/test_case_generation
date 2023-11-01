public class GETSANDWICH{
public String getSandwich(String str){
try {
int first = -1;
    int last = -1;
    for(int i = 0; i < str.length() - 5; i++)
    {
        if(str.substring(i, i + 5).equals("bread"))
        {
            first = i;
            break;
        }
    }
    for(int i = str.length() - 5; i >= 0; i--)
    {
        if(str.substring(i, i + 5).equals("bread"))
        {
            last = i;
            break;
        }
    }
    if(first != -1 && last != -1 && first != last)
    {
        return str.substring(first + 5, last);
    }
    return "";
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void getSandwich_test(String []s){
System.out.println(getSandwich("breadstrawberryjambread"));
System.out.println(getSandwich("breadbutterbread"));
System.out.println(getSandwich("breadavocadobread"));
System.out.println(getSandwich("breadchocolatebread"));
System.out.println(getSandwich("jambreadbutterbread"));
System.out.println(getSandwich("breadpeanutbutterbread"));
System.out.println(getSandwich("jambreadnutellabread"));
System.out.println(getSandwich("breadjambread"));
System.out.println(getSandwich("breadvegemitebread"));
System.out.println(getSandwich("breadmarmaladebread"));
System.out.println(getSandwich("breadmayobread"));
System.out.println(getSandwich("breadcheesebread"));
System.out.println(getSandwich("breadhoneybread"));
}

public static void main(String []args){
GETSANDWICH obj = new GETSANDWICH();
obj.getSandwich_test(args);
}

}
