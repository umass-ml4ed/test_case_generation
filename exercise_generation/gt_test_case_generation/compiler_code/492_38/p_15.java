public class XYZTHERE{
public boolean xyzThere(String str){
try {
int len = str.length() - 2;
	for(int i = 0; i < len; i++)
	{
		if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z')
		{
			if(i == 0 || str.charAt(i-1) != '.')
				return true;
		}
	}
	return false;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void xyzThere_test(String []s){
System.out.println(xyzThere("xyzbxyz"));
System.out.println(xyzThere("xyz"));
System.out.println(xyzThere("bxyzxyz"));
System.out.println(xyzThere("xyzxyz"));
System.out.println(xyzThere("axyzbxyzbxyz"));
System.out.println(xyzThere("bxyzbxyzbxyzbxyz"));
System.out.println(xyzThere("bxyzbxyzbxyzbxyzbxyz"));
System.out.println(xyzThere(".xyzbxyz"));
System.out.println(xyzThere("bxyzbxyzbxyz"));
System.out.println(xyzThere("axyzxyz"));
System.out.println(xyzThere("axyzbxyz"));
System.out.println(xyzThere("axyzbxyzbxyzbxyz"));
System.out.println(xyzThere("axyz"));
System.out.println(xyzThere("bxyz"));
System.out.println(xyzThere("bxyzbxyz"));
}

public static void main(String []args){
XYZTHERE obj = new XYZTHERE();
obj.xyzThere_test(args);
}

}
