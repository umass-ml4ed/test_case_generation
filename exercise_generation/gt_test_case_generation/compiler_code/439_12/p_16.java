public class SQUIRRELPLAY{
public boolean squirrelPlay(int temp, boolean isSummer){
try {
if ((isSummer) && (temp >= 60 || temp <= 100))
    {
        return true;
    }
    else if ((!isSummer) && (temp >= 60 && temp <= 90))
    {
        return true;
    }
    return false;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void squirrelPlay_test(String []s){
System.out.println(squirrelPlay(60, true));
System.out.println(squirrelPlay(90, true));
System.out.println(squirrelPlay(100, true));
System.out.println(squirrelPlay(59, true));
System.out.println(squirrelPlay(101, true));
System.out.println(squirrelPlay(60, false));
System.out.println(squirrelPlay(90, false));
System.out.println(squirrelPlay(59, false));
System.out.println(squirrelPlay(91, false));
System.out.println(squirrelPlay(100, false));
System.out.println(squirrelPlay(59, true));
System.out.println(squirrelPlay(101, true));
System.out.println(squirrelPlay(60, false));
System.out.println(squirrelPlay(90, false));
System.out.println(squirrelPlay(59, false));
System.out.println(squirrelPlay(91, false));
System.out.println(squirrelPlay(100, false));
System.out.println(squirrelPlay(75, true));
System.out.println(squirrelPlay(85, true));
System.out.println(squirrelPlay(95, true));
}

public static void main(String []args){
SQUIRRELPLAY obj = new SQUIRRELPLAY();
obj.squirrelPlay_test(args);
}

}
