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
System.out.println(plusOut("HelloWorldHelloWorld", "Hello"));
System.out.println(plusOut("HelloWorldHelloWorldHelloWorldHelloWorldHello", "Hello"));
System.out.println(plusOut("HelloWorldHello", "Hello"));
System.out.println(plusOut("HelloWorldHelloWorldHelloWorldHello", "Hello"));
System.out.println(plusOut("HelloWorldHelloWorldHelloWorldHelloWorld", "Hello"));
System.out.println(plusOut("HelloHelloHelloHello", "Hello"));
System.out.println(plusOut("HelloHelloHello", "Hello"));
System.out.println(plusOut("HelloWorldHelloWorldHelloWorld", "Hello"));
System.out.println(plusOut("HelloWorldHelloWorldHello", "Hello"));
System.out.println(plusOut("HelloHelloHelloHelloHello", "Hello"));
System.out.println(plusOut("HelloWorld", "Hello"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
