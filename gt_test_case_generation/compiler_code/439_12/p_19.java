public class SQUIRRELPLAY{
public boolean squirrelPlay(int temp, boolean isSummer){
try {
if (isSummer && temp >= 60 && temp <= 100)
    {
        return(true);
    }
    else if (temp > 60 && temp <= 90)
    {
        return(true);
    }
    else
    {
        return(false);
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void squirrelPlay_test(String []s){
System.out.println(squirrelPlay(55, true));
System.out.println(squirrelPlay(40, true));
System.out.println(squirrelPlay(101, true));
System.out.println(squirrelPlay(90, true));
System.out.println(squirrelPlay(95, false));
System.out.println(squirrelPlay(91, true));
System.out.println(squirrelPlay(95, true));
System.out.println(squirrelPlay(80, true));
System.out.println(squirrelPlay(60, false));
System.out.println(squirrelPlay(100, true));
System.out.println(squirrelPlay(100, false));
System.out.println(squirrelPlay(59, false));
System.out.println(squirrelPlay(30, true));
System.out.println(squirrelPlay(55, false));
System.out.println(squirrelPlay(70, true));
System.out.println(squirrelPlay(70, false));
System.out.println(squirrelPlay(91, false));
System.out.println(squirrelPlay(101, false));
System.out.println(squirrelPlay(50, true));
System.out.println(squirrelPlay(105, true));
System.out.println(squirrelPlay(105, false));
System.out.println(squirrelPlay(60, true));
System.out.println(squirrelPlay(80, false));
System.out.println(squirrelPlay(59, true));
System.out.println(squirrelPlay(110, true));
System.out.println(squirrelPlay(120, true));
System.out.println(squirrelPlay(90, false));
System.out.println(squirrelPlay(50, false));
System.out.println(squirrelPlay(85, false));
System.out.println(squirrelPlay(61, true));
}

public static void main(String []args){
SQUIRRELPLAY obj = new SQUIRRELPLAY();
obj.squirrelPlay_test(args);
}

}
