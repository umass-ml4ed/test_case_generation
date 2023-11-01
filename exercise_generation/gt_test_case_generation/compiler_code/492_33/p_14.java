public class MIXSTRING{
public String mixString(String a, String b){
try {
String result = "";
int i = 0;
while (i<a.length()&&i<b.length()){
result = result + a.charAt(i) + b.charAt(i);
i++;
}
return result+a.substring(i)+b.substring(i);
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void mixString_test(String []s){
System.out.println(mixString("abcdefg", "hijklm"));
System.out.println(mixString("abc", "defgh"));
System.out.println(mixString("abcde", ""));
System.out.println(mixString("abcdefghi", "jklmno"));
System.out.println(mixString("abc", "def"));
System.out.println(mixString("abcd", "efgh"));
System.out.println(mixString("a", "b"));
System.out.println(mixString("abc", "defg"));
System.out.println(mixString("abcdefgh", "ijklmn"));
System.out.println(mixString("abcde", "fghij"));
System.out.println(mixString("", "defgh"));
System.out.println(mixString("abcde", "fgh"));
System.out.println(mixString("abcdefghij", "klmnopqr"));
System.out.println(mixString("abcdef", "ghijk"));
System.out.println(mixString("ab", "cd"));
}

public static void main(String []args){
MIXSTRING obj = new MIXSTRING();
obj.mixString_test(args);
}

}
