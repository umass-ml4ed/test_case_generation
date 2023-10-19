public class CAUGHTSPEEDING{
public int caughtSpeeding(int speed, boolean isBirthday){
try {
if(isBirthday==true)
  {   
  if(speed<=60)
    {return 0;}
    
  if(speed <= 80 && speed >= 61)
    {return 1;}
    
  if(speed >= 81)
    {return 2;}
  }
  else
  {
   if(speed <= 65)
   {return 0;}
    
  if(speed <= 85 && speed >= 66)
    {return 1;}
    
  if(speed >= 86)
    {return 2;}
  }
return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void caughtSpeeding_test(String []s){
System.out.println(caughtSpeeding(60, true));
System.out.println(caughtSpeeding(61, true));
System.out.println(caughtSpeeding(80, true));
System.out.println(caughtSpeeding(81, true));
System.out.println(caughtSpeeding(85, true));
System.out.println(caughtSpeeding(86, true));
System.out.println(caughtSpeeding(65, false));
System.out.println(caughtSpeeding(66, false));
System.out.println(caughtSpeeding(85, false));
System.out.println(caughtSpeeding(86, false));
System.out.println(caughtSpeeding(60, false));
System.out.println(caughtSpeeding(61, false));
System.out.println(caughtSpeeding(80, false));
System.out.println(caughtSpeeding(81, false));
System.out.println(caughtSpeeding(65, true));
System.out.println(caughtSpeeding(66, true));
System.out.println(caughtSpeeding(85, true));
System.out.println(caughtSpeeding(86, true));
System.out.println(caughtSpeeding(60, true));
System.out.println(caughtSpeeding(61, true));
System.out.println(caughtSpeeding(80, true));
System.out.println(caughtSpeeding(81, true));
System.out.println(caughtSpeeding(85, true));
}

public static void main(String []args){
CAUGHTSPEEDING obj = new CAUGHTSPEEDING();
obj.caughtSpeeding_test(args);
}

}
