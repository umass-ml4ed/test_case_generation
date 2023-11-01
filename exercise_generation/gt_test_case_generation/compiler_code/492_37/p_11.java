public class ENDOTHER{
public boolean endOther(String a, String b){
try {
a.toLowerCase();
    b.toLowerCase();
    if (a.contains(b) || b.contains(a))
    {
        return true; 
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

public void endOther_test(String []s){
System.out.println(endOther("Hello", "HELLOO"));
System.out.println(endOther(" ", " "));
System.out.println(endOther("Hello", "lo"));
System.out.println(endOther("Hello", "L"));
System.out.println(endOther("Hello", "He"));
System.out.println(endOther("Hello", "Helloo"));
System.out.println(endOther("Hello", "Hello"));
System.out.println(endOther("Hello", "H"));
System.out.println(endOther("Hello", "h"));
System.out.println(endOther("Hello", "HelloHello"));
System.out.println(endOther("Hello", "E"));
System.out.println(endOther("Hello", "HELLO"));
System.out.println(endOther("Hello", "Hell"));
System.out.println(endOther("Hello", "o"));
System.out.println(endOther("Hello", " "));
}

public static void main(String []args){
ENDOTHER obj = new ENDOTHER();
obj.endOther_test(args);
}

}
