public class GETSANDWICH{
public String getSandwich(String str){
try {
int firstBread = -1;
    int lastBread = -1;
    for (int i = 0; i < str.length() - 5; i++)
    {
        if (str.substring(i, i+5).equals("bread"))
        {
            firstBread = i;
            i = str.length();
        }
    }
    for (int j = str.length() - 5; j > 0; j--)
    {
        if (str.substring(j, j+5).equals("bread"))
        {
            lastBread = j;
            j = 0;
        }
    }
    return str.substring(firstBread + 5, lastBread);
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void getSandwich_test(String []s){
System.out.println(getSandwich("breadcheeseandbreadandmayobread"));
System.out.println(getSandwich("breadbutterbread"));
System.out.println(getSandwich("breadpeanutbutterandbreadandjellybread"));
System.out.println(getSandwich("breadjamandbread"));
System.out.println(getSandwich("breadpeanutbutterbread"));
System.out.println(getSandwich("breadjellybread"));
System.out.println(getSandwich("breadjamandbreadandbutterbread"));
System.out.println(getSandwich("breadjam"));
System.out.println(getSandwich("breadmayobread"));
System.out.println(getSandwich("breadhoneyandbreadandnutellabread"));
System.out.println(getSandwich("breadcheesebread"));
System.out.println(getSandwich("breadhoneybread"));
System.out.println(getSandwich("breadnutellabreadandbread"));
}

public static void main(String []args){
GETSANDWICH obj = new GETSANDWICH();
obj.getSandwich_test(args);
}

}
