public class CAUGHTSPEEDING{
public int caughtSpeeding(int speed, boolean isBirthday){
try {
int result = 0;
    if (!isBirthday)
    {
    	if (speed <= 60)
   	 	{
           result = 0;
    	}
    	
    	else if (speed >= 61 && speed <= 80)
        {
            result = 1;
        }
    	else if (speed > 81)
        {
            result = 2;
        } 
    }
    else if (isBirthday)
    {
    	if (speed <= 65)
   	 	{
            result = 0;
    	}
    	
    	else if (speed >= 66 && speed <= 85)
        {
            result = 1;
        }
    	else if (speed >= 86)
        {
            result = 2;
        }    
    }
    return result;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void caughtSpeeding_test(String []s){
System.out.println(caughtSpeeding(60, false));
System.out.println(caughtSpeeding(61, false));
System.out.println(caughtSpeeding(80, false));
System.out.println(caughtSpeeding(81, false));
System.out.println(caughtSpeeding(100, false));
System.out.println(caughtSpeeding(65, true));
System.out.println(caughtSpeeding(66, true));
System.out.println(caughtSpeeding(85, true));
System.out.println(caughtSpeeding(86, true));
System.out.println(caughtSpeeding(95, true));
System.out.println(caughtSpeeding(55, false));
System.out.println(caughtSpeeding(70, false));
System.out.println(caughtSpeeding(90, false));
System.out.println(caughtSpeeding(50, true));
System.out.println(caughtSpeeding(75, true));
System.out.println(caughtSpeeding(95, true));
System.out.println(caughtSpeeding(40, false));
System.out.println(caughtSpeeding(55, false));
System.out.println(caughtSpeeding(75, false));
System.out.println(caughtSpeeding(45, true));
System.out.println(caughtSpeeding(60, true));
System.out.println(caughtSpeeding(80, true));
System.out.println(caughtSpeeding(50, false));
}

public static void main(String []args){
CAUGHTSPEEDING obj = new CAUGHTSPEEDING();
obj.caughtSpeeding_test(args);
}

}
