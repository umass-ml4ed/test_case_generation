public class GETSANDWICH{
public String getSandwich(String str){
try {
int l = str.length();
    // first bread
    int p = 0;
    int i = 0;
    while (i <= l)
    {
        int iend = i + 5;
        String bread1 = str.substring(i, iend);
        if (bread1.equals("bread"))
        {
            p = iend;
            i = l + 1;
        }
        i = i + 1;
    }
    // last bread
    int pl = 0;
    int o = l;
    while (o >= p)
    {
        int ostart = o - 5;
        String bread2 = str.substring(ostart, o);
        if (bread2.equals("bread"))
        {
            pl = ostart;
            o = p - 1;
        }
        o = o - 1;
    }
    int p0 = pl - 1;
    if (p != p0)
    {
    	String re = str.substring(p, pl);
    	return re;
    }
    else
    {
        return "";
    }
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void getSandwich_test(String []s){
System.out.println(getSandwich("eggmayobread"));
System.out.println(getSandwich("breadeggmayobread"));
System.out.println(getSandwich("breadlettucebread"));
System.out.println(getSandwich("breadjambread"));
System.out.println(getSandwich("tomatobread"));
System.out.println(getSandwich("lettucebread"));
System.out.println(getSandwich("baconbread"));
System.out.println(getSandwich("breadtomatobread"));
System.out.println(getSandwich("breadchicken"));
System.out.println(getSandwich("jambread"));
System.out.println(getSandwich("cheesebread"));
System.out.println(getSandwich("breadcheesebread"));
System.out.println(getSandwich("breadbaconbread"));
}

public static void main(String []args){
GETSANDWICH obj = new GETSANDWICH();
obj.getSandwich_test(args);
}

}
