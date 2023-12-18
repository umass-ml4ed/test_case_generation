public class MIXSTRING{
public String mixString(String a, String b){
try {
String word = "";
    int last = 0;
    if (a.length() == b.length())
    {
   		for (int i = 0; i < a.length(); i++)
 	    {
     		word = word + a.substring(i, i + 1) + b.substring(i, i + 1); 
    	}
    }
    else if (a.length() > b.length())
    {
   		for (int i = 0; i < b.length(); i++)
 	    {
            last = i;
     		word = word + a.substring(i, i + 1) + b.substring(i, i + 1);
            
    	}
        word = word + a.substring(last + 1, a.length());
    }
    return word;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void mixString_test(String []s){
System.out.println(mixString("abc", "defghijkl"));
System.out.println(mixString("abcd", "efghijklm"));
System.out.println(mixString("ab", "cdefghijk"));
System.out.println(mixString("abcde", "fghijklmn"));
System.out.println(mixString("abcd", "efg"));
System.out.println(mixString("abcdefg", "jklm"));
System.out.println(mixString("abcdefghij", "stu"));
System.out.println(mixString("abcdefg", "hijklmnop"));
System.out.println(mixString("abcdefghi", "pqr"));
System.out.println(mixString("a", "bcdefghij"));
System.out.println(mixString("abc", "def"));
System.out.println(mixString("abcdef", "ghijklmno"));
System.out.println(mixString("abcdef", "ghi"));
System.out.println(mixString("abcde", "fgh"));
System.out.println(mixString("abcdefgh", "mno"));
}

public static void main(String []args){
MIXSTRING obj = new MIXSTRING();
obj.mixString_test(args);
}

}
