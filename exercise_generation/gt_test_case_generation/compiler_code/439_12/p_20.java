public class SQUIRRELPLAY{
public boolean squirrelPlay(int temp, boolean isSummer){
try {
if(isSummer)
    {
		return (temp >= 60 && temp <= 100);
    }
    else
    {
	    return (temp >= 60 && temp <= 90);
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void squirrelPlay_test(String []s){
System.out.println(squirrelPlay(60, false));
System.out.println(squirrelPlay(90, false));
System.out.println(squirrelPlay(59, false));
System.out.println(squirrelPlay(91, false));
System.out.println(squirrelPlay(59, true));
System.out.println(squirrelPlay(60, true));
System.out.println(squirrelPlay(90, true));
System.out.println(squirrelPlay(100, true));
System.out.println(squirrelPlay(101, true));
System.out.println(squirrelPlay(59, false));
System.out.println(squirrelPlay(60, false));
System.out.println(squirrelPlay(90, false));
System.out.println(squirrelPlay(91, false));
System.out.println(squirrelPlay(59, true));
System.out.println(squirrelPlay(60, true));
System.out.println(squirrelPlay(90, true));
System.out.println(squirrelPlay(100, true));
System.out.println(squirrelPlay(101, true));
System.out.println(squirrelPlay(59, false));
System.out.println(squirrelPlay(60, false));
}

public static void main(String []args){
SQUIRRELPLAY obj = new SQUIRRELPLAY();
obj.squirrelPlay_test(args);
}

}
