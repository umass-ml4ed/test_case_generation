public class XYZTHERE{
public boolean xyzThere(String str){
try {
int occ = str.indexOf("xyz");
    if (occ == 0)
    {
        return true;
    }
    else if (occ > 0)
    {
        String per = str.substring(occ - 1, occ);
        if (per.equals("."))
        {
            return false;
        }
        else
        {
        	return true;
        }
    }
    else
    {
        return false;
    }
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
