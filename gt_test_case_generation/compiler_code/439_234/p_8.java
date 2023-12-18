public class CIGARPARTY{
public boolean cigarParty(int cigars, boolean isWeekend){
try {
if ((cigars >=40 && cigars <=60) && (!isWeekend))
    {
        return true;
    }
    
    else if ((cigars >=40 && cigars <=60) && (isWeekend))
    {
        return false;
       
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

public void cigarParty_test(String []s){
System.out.println(cigarParty(80, true));
System.out.println(cigarParty(35, false));
System.out.println(cigarParty(100, true));
System.out.println(cigarParty(50, false));
System.out.println(cigarParty(45, false));
System.out.println(cigarParty(70, false));
System.out.println(cigarParty(65, true));
System.out.println(cigarParty(55, false));
System.out.println(cigarParty(60, false));
System.out.println(cigarParty(75, true));
System.out.println(cigarParty(40, false));
System.out.println(cigarParty(70, true));
System.out.println(cigarParty(65, false));
}

public static void main(String []args){
CIGARPARTY obj = new CIGARPARTY();
obj.cigarParty_test(args);
}

}
