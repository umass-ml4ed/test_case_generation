public class IN1TO10{
public boolean in1To10(int n, boolean outsideMode){
try {
if(outsideMode)
    {
		return (n <= 1 || n >= 10);
    }
    else
    {
	    return (n >= 1 && n <= 10);
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void in1To10_test(String []s){
System.out.println(in1To10(11, true));
System.out.println(in1To10(2, false));
System.out.println(in1To10(3, false));
System.out.println(in1To10(1, true));
System.out.println(in1To10(0, true));
System.out.println(in1To10(100, true));
System.out.println(in1To10(20, true));
System.out.println(in1To10(1, false));
System.out.println(in1To10(5, true));
System.out.println(in1To10(10, true));
System.out.println(in1To10(4, false));
System.out.println(in1To10(9, false));
System.out.println(in1To10(10, false));
System.out.println(in1To10(15, true));
System.out.println(in1To10(-5, true));
System.out.println(in1To10(-1, true));
}

public static void main(String []args){
IN1TO10 obj = new IN1TO10();
obj.in1To10_test(args);
}

}
