public class ALARMCLOCK{
public String alarmClock(int day, boolean vacation){
try {
if (vacation)
    {
        if (day == 0 || day == 6)
        {
            return "off";
        }
        else
        {
            return "10:00";
        }
    }
    else
    {
        if (day == 0 || day == 6)
        {
            return "10:00";
        }
        else
        {
            return "7:00";
        }
    }
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void alarmClock_test(String []s){
System.out.println(alarmClock((2, true)));
System.out.println(alarmClock((5, true)));
System.out.println(alarmClock(5, false));
System.out.println(alarmClock((3, false)));
System.out.println(alarmClock(0, true));
System.out.println(alarmClock(4, false));
System.out.println(alarmClock(0, false));
System.out.println(alarmClock((6, true)));
System.out.println(alarmClock(1, false));
System.out.println(alarmClock(1, true));
System.out.println(alarmClock((6, false)));
System.out.println(alarmClock(4, true));
System.out.println(alarmClock((1, true)));
System.out.println(alarmClock((4, false)));
System.out.println(alarmClock(6, true));
System.out.println(alarmClock((3, true)));
System.out.println(alarmClock((0, true)));
System.out.println(alarmClock(2, false));
System.out.println(alarmClock((5, false)));
System.out.println(alarmClock(5, true));
System.out.println(alarmClock((1, false)));
System.out.println(alarmClock((2, false)));
System.out.println(alarmClock(3, true));
System.out.println(alarmClock((0, false)));
System.out.println(alarmClock(6, false));
System.out.println(alarmClock((4, true)));
System.out.println(alarmClock(2, true));
System.out.println(alarmClock(3, false));
}

public static void main(String []args){
ALARMCLOCK obj = new ALARMCLOCK();
obj.alarmClock_test(args);
}

}
