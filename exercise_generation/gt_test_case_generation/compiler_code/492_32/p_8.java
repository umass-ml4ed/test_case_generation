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
System.out.println(plusOut("abXYabcXYZ", "abc"));
System.out.println(plusOut("abXYabcXYZ", "XY"));
System.out.println(plusOut("abXYabcXYZ", "XYZ"));
System.out.println(plusOut("abXYabcXYZ", "ab"));
System.out.println(plusOut("abXYabcXYZ", "cd"));
System.out.println(plusOut("abXYabcXYZ", ""));
System.out.println(plusOut("abXYabcXYZ", "a"));
System.out.println(plusOut("abXYabcXYZ", "X"));
System.out.println(plusOut("abXYabcXYZ", "Y"));
System.out.println(plusOut("abXYabcXYZ", "Z"));
System.out.println(plusOut("abXYabcXYZ", "XYabc"));
}

public static void main(String []args){
PLUSOUT obj = new PLUSOUT();
obj.plusOut_test(args);
}

}
