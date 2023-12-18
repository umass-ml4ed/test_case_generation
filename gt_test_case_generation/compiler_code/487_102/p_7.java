public class WITHOUT2{
public String without2(String str){
try {
if (str.length() <= 2)
    {
        return(str.substring(0, 0));
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
System.out.println(without2("abcdeabcdf"));
System.out.println(without2("abcdefabcdef"));
System.out.println(without2("Hello"));
System.out.println(without2("abcdf"));
System.out.println(without2("ab"));
System.out.println(without2("abab"));
System.out.println(without2("abcabf"));
System.out.println(without2("abcdeg"));
System.out.println(without2("abcdefh"));
System.out.println(without2("abcab"));
System.out.println(without2("Hi"));
System.out.println(without2("abcdabcd"));
System.out.println(without2("a"));
}

public static void main(String []args){
WITHOUT2 obj = new WITHOUT2();
obj.without2_test(args);
}

}
