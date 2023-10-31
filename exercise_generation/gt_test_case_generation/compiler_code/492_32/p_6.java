public class PLUSOUT{
public String plusOut(String str, String word){
try {
String returnString = "";
    for (int i = 0; i < str.length()+1; i++)
    {
     	if (str.substring(i).startsWith(word))
        {
         	returnString = returnString + word;
            i = i + word.length();
        }
        else
        {
         	returnString = returnString + "+";   
        }
    }
    return returnString;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void plusOut_test(String []s){
System.out.println(plusOut("World", "d"));
System.out.println(plusOut("Hello World", "W"));
System.out.println(plusOut("abcabcabc", "a"));
System.out.println(plusOut("Hello World Hello", "Hello"));
System.out.println(plusOut("This is a test This is a test", "test"));
System.out.println(plusOut("Java Programming Java", "Java"));
System.out.println(plusOut("I love Java I love coding", "coding"));
System.out.println(plusOut("Hello World", "l"));
System.out.println(plusOut("abcabcabc", "b"));
System.out.println(plusOut("Hello World", "H"));
System.out.println(plusOut("Hello World", "orld"));
System.out.println(plusOut("abcabcabc", "abc"));
System.out.println(plusOut("I am a developer", "developer"));
System.out.println(plusOut("Hello Hello", "Hello"));
System.out.println(plusOut("Hello", "o"));
System.out.println(plusOut("I love coding", "coding"));
System.out.println(plusOut("This is a sentence", "sentence"));
System.out.println(plusOut("Hello World", "d"));
System.out.println(plusOut("Hello World", "o"));
System.out.println(plusOut("Hello Hello Hello", "Hello"));
System.out.println(plusOut("abcabcabc", "c"));
System.out.println(plusOut("Hello World", "ld"));
System.out.println(plusOut("Hello World", "World"));
System.out.println(plusOut("Java Programming", "Programming"));
System.out.println(plusOut("Hello World", " "));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
