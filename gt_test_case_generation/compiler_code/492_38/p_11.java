public class XYZTHERE{
public boolean xyzThere(String str){
try {
if (str.startsWith(","))
    {
        return(false);
    }
    if(str.startsWith("xyz") || str.endsWith("xyz"))
    {
        return(true);
    }
    else
    {
        return(false);
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void xyzThere_test(String []s){
System.out.println(xyzThere("TherexyzThere"));
System.out.println(xyzThere("xyz"));
System.out.println(xyzThere("xyzxyz"));
System.out.println(xyzThere("Therexyz"));
System.out.println(xyzThere("There"));
System.out.println(xyzThere("ThereTherexyz"));
System.out.println(xyzThere("ThereThere.xyzThere"));
System.out.println(xyzThere("xyzThereThere"));
System.out.println(xyzThere("xyzThere"));
System.out.println(xyzThere("There.xyz"));
System.out.println(xyzThere("xyzxyzxyz"));
System.out.println(xyzThere("xyz.xyz"));
System.out.println(xyzThere("xyzTherexyz"));
System.out.println(xyzThere("xyzThereThereThere"));
System.out.println(xyzThere("xyz.xyzThere"));
}

public static void main(String []args){
XYZTHERE obj = new XYZTHERE();
obj.xyzThere_test(args);
}

}
