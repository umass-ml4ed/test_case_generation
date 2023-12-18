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
System.out.println(plusOut("Hello World", "d"));
System.out.println(plusOut("Hello World", "r"));
System.out.println(plusOut("Hello World", "e"));
System.out.println(plusOut("Hello World", "Hello"));
System.out.println(plusOut("Hello World", "He"));
System.out.println(plusOut("Hello Worldl", "l"));
System.out.println(plusOut("Hello World", "W"));
System.out.println(plusOut("Hello World", "H"));
System.out.println(plusOut("Hello World", "o"));
System.out.println(plusOut("Hello World", " "));
System.out.println(plusOut("Hello World", "World"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
