public class CAUGHTSPEEDING{
public int caughtSpeeding(int speed, boolean isBirthday){
try {
if (isBirthday)
    {
        if (speed < 66)
            return 0;
        else if (speed >= 66 && speed < 86)
            return 1;
        else if (speed > 86)
            return 2;
    }
        if (speed < 61)
            return 0;
        else if (speed >= 61 && speed < 81)
            return 1;
        else if (speed > 81)
            return 2;
    return 3;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void caughtSpeeding_test(String []s){
System.out.println(caughtSpeeding(55, true));
System.out.println(caughtSpeeding(90, true));
System.out.println(caughtSpeeding(86, true));
System.out.println(caughtSpeeding(45, false));
System.out.println(caughtSpeeding(95, false));
System.out.println(caughtSpeeding(25, false));
System.out.println(caughtSpeeding(15, false));
System.out.println(caughtSpeeding(95, true));
System.out.println(caughtSpeeding(80, true));
System.out.println(caughtSpeeding(60, false));
System.out.println(caughtSpeeding(100, true));
System.out.println(caughtSpeeding(82, false));
System.out.println(caughtSpeeding(61, false));
System.out.println(caughtSpeeding(100, false));
System.out.println(caughtSpeeding(75, true));
System.out.println(caughtSpeeding(55, false));
System.out.println(caughtSpeeding(70, true));
System.out.println(caughtSpeeding(65, false));
System.out.println(caughtSpeeding(70, false));
System.out.println(caughtSpeeding(65, true));
System.out.println(caughtSpeeding(86, false));
System.out.println(caughtSpeeding(50, true));
System.out.println(caughtSpeeding(30, false));
System.out.println(caughtSpeeding(75, false));
System.out.println(caughtSpeeding(85, true));
System.out.println(caughtSpeeding(60, true));
System.out.println(caughtSpeeding(35, false));
System.out.println(caughtSpeeding(80, false));
System.out.println(caughtSpeeding(81, false));
System.out.println(caughtSpeeding(90, false));
System.out.println(caughtSpeeding(50, false));
System.out.println(caughtSpeeding(85, false));
System.out.println(caughtSpeeding(66, true));
}

public static void main(String []args){
CAUGHTSPEEDING obj = new CAUGHTSPEEDING();
obj.caughtSpeeding_test(args);
}

}
