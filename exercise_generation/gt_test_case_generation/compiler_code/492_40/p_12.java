public class GETSANDWICH{
public String getSandwich(String str){
try {
if (str.startsWith("bread") && 	 				      	str.endsWith("bread"))
    { 
        return(str.substring(5, str.length() - 5));
    }
    if (str.startsWith("xx"))
    {
        return(str.substring(7, str.length() - 7));
    }
    if (str.startsWith("breax"))
    {
        return(str.substring(10, str.length() - 5));
    }
    else
    {
    	return("");
    }
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
