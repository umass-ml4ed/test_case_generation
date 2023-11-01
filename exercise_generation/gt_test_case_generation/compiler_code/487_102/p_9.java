public class WITHOUT2{
public String without2(String str){
try {
if (str.length() == 2)
    {
        return(str.substring(0, 0));
    }
    else if (str.length() == 1 || str.length() == 0)
    {
        return(str.substring(0));
    }
    else if (str.substring(0, 2) == str.substring(str.length() - 2))
    {
        return(str.substring(2));
    }
    else 
    {
        return(str.substring(0));
    }
} catch (Exception e) {
System.out.print(e + " ");
return "ERROR";
}
}

public void without2_test(String []s){
System.out.println(without2("abcdef"));
System.out.println(without2("Hello"));
System.out.println(without2(""));
System.out.println(without2("abab"));
System.out.println(without2("Hi"));
System.out.println(without2("abcabc"));
System.out.println(without2("HelloHe"));
System.out.println(without2("aba"));
System.out.println(without2("abcdeabc"));
System.out.println(without2("a"));
System.out.println(without2("abcd"));
System.out.println(without2("abc"));
}

public static void main(String []args){
WITHOUT2 obj = new WITHOUT2();
obj.without2_test(args);
}

}
