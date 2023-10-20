public class CAUGHTSPEEDING{
public int caughtSpeeding(int speed, boolean isBirthday){
try {
if (isBirthday)
    {
        if (speed <= 65)
        {
            return 0;
        }
        else if (66 <=speed&& speed <= 85)
        {
            return 1;
        }
        else if (86 <= speed)
        {
            return 2;
        }
    }
    if (!isBirthday)
    {
        if (speed <= 60)
        {
            return 0;
        }
        else if (61 <= speed && speed <= 80)
        {
            return 1;
        }
        else if (81 <= speed)
        {
            return 2;
        }
    }
    return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void caughtSpeeding_test(String []s){
System.out.println(caughtSpeeding(90, false));
System.out.println(caughtSpeeding(50, false));
System.out.println(caughtSpeeding(90, true));
System.out.println(caughtSpeeding(120, true));
System.out.println(caughtSpeeding(120, false));
System.out.println(caughtSpeeding(0, true));
System.out.println(caughtSpeeding(95, false));
System.out.println(caughtSpeeding(75, false));
System.out.println(caughtSpeeding(65, true));
System.out.println(caughtSpeeding(95, true));
System.out.println(caughtSpeeding(85, true));
System.out.println(caughtSpeeding(100, true));
System.out.println(caughtSpeeding(81, true));
System.out.println(caughtSpeeding(65, false));
System.out.println(caughtSpeeding(80, false));
System.out.println(caughtSpeeding(55, true));
System.out.println(caughtSpeeding(80, true));
System.out.println(caughtSpeeding(86, true));
System.out.println(caughtSpeeding(85, false));
System.out.println(caughtSpeeding(60, false));
System.out.println(caughtSpeeding(55, false));
System.out.println(caughtSpeeding(70, true));
System.out.println(caughtSpeeding(66, false));
System.out.println(caughtSpeeding(100, false));
System.out.println(caughtSpeeding(50, true));
System.out.println(caughtSpeeding(0, false));
System.out.println(caughtSpeeding(61, true));
System.out.println(caughtSpeeding(81, false));
System.out.println(caughtSpeeding(45, true));
System.out.println(caughtSpeeding(40, false));
System.out.println(caughtSpeeding(61, false));
System.out.println(caughtSpeeding(60, true));
System.out.println(caughtSpeeding(86, false));
System.out.println(caughtSpeeding(75, true));
System.out.println(caughtSpeeding(66, true));
System.out.println(caughtSpeeding(70, false));
}

public static void main(String []args){
CAUGHTSPEEDING obj = new CAUGHTSPEEDING();
obj.caughtSpeeding_test(args);
}

}
