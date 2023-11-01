public class MIXSTRING{
public String mixString(String a, String b){
try {
int k = 0;
    String word = "";
    if (a.length() == b.length())
    {
        for (int i = 0; i < a.length(); i ++)
        {
                word = word + a.charAt(i) + b.charAt(i);
        }
    }
    else if(a.length() < b.length())
    {
        for (int i = 0; i < b.length(); i++)
        {
           if (i < a.length())
           {
             word = word + a.charAt(i) + b.charAt(i);
           }
            else 
            {
                word = word + b.substring(i);
                break;
            }
        }
    }
    else if(a.length() > b.length())
    {
        for (int i = 0; i < a.length(); i++)
        {
           if (i > b.length())
           {
               word = word + a.charAt(i) + b.charAt(i);
             word = word + a.substring(i);
           }
            else 
            {
                word = word + a.substring(i);
                break;
            }
        }
    }
    return word;
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void mixString_test(String []s){
System.out.println(mixString("Test", "Case"));
System.out.println(mixString("Program", "Expert"));
System.out.println(mixString("Bug", "BugFix"));
System.out.println(mixString("ProgrammingExpert", "Code"));
System.out.println(mixString("Hello", "JavaWorld"));
System.out.println(mixString("Bug", "Bug"));
System.out.println(mixString("Java", "Java"));
System.out.println(mixString("String", "Mixing"));
System.out.println(mixString("BugFix", "Bug"));
System.out.println(mixString("Buggy", "Code"));
System.out.println(mixString("HelloWorld", "Java"));
System.out.println(mixString("Test", "TestCase"));
System.out.println(mixString("Hello", "World"));
System.out.println(mixString("Perfect", "Solution"));
System.out.println(mixString("TestCase", "Test"));
}

public static void main(String []args){
MIXSTRING obj = new MIXSTRING();
obj.mixString_test(args);
}

}
