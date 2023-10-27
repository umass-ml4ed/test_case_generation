public class PLUSOUT{
public String plusOut(String str, String word){
try {
int index = str.indexOf(word);
    String sub1 = str.substring(0, index); 
    String sub2 = str.substring(index + word.length(), str.length());
    
    String p1 = "";
    String p2 = "";
    for(int x =0; x<sub1.length(); x++)
    {
        p1 = p1 + "+";
    }
    
    for(int y =0; y<sub2.length(); y++)
    {
        p2 = p2 + "+";
    }
    return p1 + word + p2;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void plusOut_test(String []s){
System.out.println(plusOut("Hello World", "World"));
System.out.println(plusOut("Hello", "Hello"));
System.out.println(plusOut("Hello", "World"));
System.out.println(plusOut("Hello World World", "World"));
System.out.println(plusOut("Hello World Hello World", "World"));
System.out.println(plusOut("Hello World Hello", "Hello"));
System.out.println(plusOut("Hello World Hello World", "Hello"));
System.out.println(plusOut("Hello Hello Hello", "Hello"));
System.out.println(plusOut("Hello World", "Hello"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
