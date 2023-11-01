public class CIGARPARTY{
public boolean cigarParty(int cigars, boolean isWeekend){
try {
if (isWeekend)
    {
        if (cigars >= 40)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    {
        if (40 <= cigars)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void cigarParty_test(String []s){
System.out.println(cigarParty(30, true));
System.out.println(cigarParty(60, true));
System.out.println(cigarParty(80, true));
System.out.println(cigarParty(61, false));
System.out.println(cigarParty(40, true));
System.out.println(cigarParty(50, false));
System.out.println(cigarParty(90, true));
System.out.println(cigarParty(30, false));
System.out.println(cigarParty(59, false));
System.out.println(cigarParty(60, false));
System.out.println(cigarParty(40, false));
System.out.println(cigarParty(50, true));
System.out.println(cigarParty(70, true));
}

public static void main(String []args){
CIGARPARTY obj = new CIGARPARTY();
obj.cigarParty_test(args);
}

}
