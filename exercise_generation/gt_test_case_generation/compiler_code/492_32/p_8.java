public class PLUSOUT{
public String plusOut(String str, String word){
try {
String out = "";
    for (int i = 0; i < str.length(); i++) {
        if (i >= str.length() - word.length()) {
            out = out + "+";
        }
        else if (str.substring(i, i + word.length()).equals(word)) {
            out = out + word;
            i += word.length()-1;
        }
        else {
            out = out + "+";
        }
    }
    return out;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void plusOut_test(String []s){
System.out.println(plusOut("Hello World", "Hello World Hello World"));
System.out.println(plusOut("Hello World", "World"));
System.out.println(plusOut("Hello World", "d"));
System.out.println(plusOut("Hello llo World", "llo"));
System.out.println(plusOut("Hello World World", "World World"));
System.out.println(plusOut("Hello World", "o Wo"));
System.out.println(plusOut("Hello World Hello", "Hello"));
System.out.println(plusOut("Hello World", "Hello World"));
System.out.println(plusOut("Hello World", "XYZ"));
System.out.println(plusOut("Hello H World", "H"));
System.out.println(plusOut("Hello World", " "));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
