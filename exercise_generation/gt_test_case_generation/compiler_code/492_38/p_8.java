public class XYZTHERE{
public boolean xyzThere(String str){
try {
String word = str + "         ";
    int breadnum = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    boolean answer = true;
    for (int i = 0; i < word.length() - 2; i++)
    {
   		if (word.substring(i, i + 2).equals("xyz"))
        {
            answer = true;
        }
        else 
        {
         	answer = false;   
        }
    }
    return answer;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void xyzThere_test(String []s){
System.out.println(xyzThere("abcxyz"));
System.out.println(xyzThere("xyzabc"));
System.out.println(xyzThere("xxyz"));
System.out.println(xyzThere("xyz"));
System.out.println(xyzThere("abcxyz.abcxyz"));
System.out.println(xyzThere("abcxyz.xyzabcxyz"));
System.out.println(xyzThere("abc.xyzxyzabc"));
System.out.println(xyzThere("abcxyz.xyzabc"));
System.out.println(xyzThere("abcxxyzabc"));
System.out.println(xyzThere("abcxyzabc"));
System.out.println(xyzThere("xyzxyzxyz"));
System.out.println(xyzThere("abcxxyzabcxyz"));
System.out.println(xyzThere(".xyzxyz"));
System.out.println(xyzThere(".xyz"));
System.out.println(xyzThere("abc.xyzabc"));
}

public static void main(String []args){
XYZTHERE obj = new XYZTHERE();
obj.xyzThere_test(args);
}

}
