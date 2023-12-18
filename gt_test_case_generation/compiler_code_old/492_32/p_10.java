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
System.out.println(plusOut("abXYabcXYZ", "Z"));
System.out.println(plusOut("hello", "he"));
System.out.println(plusOut("abXYabcXYZ", "cd"));
System.out.println(plusOut("hello", "hellooooooo"));
System.out.println(plusOut("abXYabcXYZ", "XYabc"));
System.out.println(plusOut("abcxyzabc", ""));
System.out.println(plusOut("abXYabcXYZ", "abc"));
System.out.println(plusOut("hello", "hello"));
System.out.println(plusOut("abcxyzabc", "def"));
System.out.println(plusOut("hello", "o"));
System.out.println(plusOut("abXYabcXYZ", "XYZ"));
System.out.println(plusOut("hello", "helloooooo"));
System.out.println(plusOut("hello", ""));
System.out.println(plusOut("hello", "helloooo"));
System.out.println(plusOut("abXYabcXYZ", "X"));
System.out.println(plusOut("abc", "abc"));
System.out.println(plusOut("abXYabcXYZ", ""));
System.out.println(plusOut("hello", "lo"));
System.out.println(plusOut("abcxyzabc", "abc"));
System.out.println(plusOut("hello", "helloo"));
System.out.println(plusOut("hello", "hellooooo"));
System.out.println(plusOut("", ""));
System.out.println(plusOut("abXYabcXYZ", "Y"));
System.out.println(plusOut("hello", "hellooo"));
System.out.println(plusOut("abXYabcXYZ", "XY"));
System.out.println(plusOut("hello", "l"));
System.out.println(plusOut("abXYabcXYZ", "a"));
System.out.println(plusOut("abcxyzabc", "xyz"));
System.out.println(plusOut("hello", "hi"));
System.out.println(plusOut("abXYabcXYZ", "ab"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
