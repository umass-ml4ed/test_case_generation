public class PLUSOUT{
public String plusOut(String str, String word){
try {
String string = new String();
    int length = word.length();
    for (int i = 0; i < str.length() - length; i++)
    {
        if (str.substring(i, i + length).equals(word))
        {
            string = string + word;
            i = i + length - 1;
        }
        else
        {
            string = string + "+";
        }
    }
    if (str.substring(str.length() - length, 			str.length()).equals(word))
    {
        return string + word;
    }
    else if (length == 1)
    {
    	return string + "+";
    }
    else if (length == 2)
    {
    	return string + "++";
    }
    else
    {
    	return string + "+++";
    }
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void plusOut_test(String []s){
System.out.println(plusOut("HelloWorld", "lo"));
System.out.println(plusOut("HelloWorld", "Hel"));
System.out.println(plusOut("HelloWorld", "H"));
System.out.println(plusOut("Hello", "He"));
System.out.println(plusOut("Hello", "ll"));
System.out.println(plusOut("HelloWorld", "llo"));
System.out.println(plusOut("Hello", "el"));
System.out.println(plusOut("Hello", "o"));
System.out.println(plusOut("Hello", "e"));
System.out.println(plusOut("Hello", "llo"));
System.out.println(plusOut("Hello", "Hell"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
