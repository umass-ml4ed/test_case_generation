public class DATEFASHION{
public int dateFashion(int you, int date){
try {
if (you >= 8)
    {
        if (date <= 2)
        {
            return 0;
        }
        else
        {
        	return 2;
        }
    }
    else if (date >= 8)
    {
        if (you <= 2)
        {
            return 0;
        }
        else
        {
        	return 2;
        }
    }
    else
    {
        return 1;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void dateFashion_test(String []s){
System.out.println(dateFashion(2, 8));
System.out.println(dateFashion(1, 9));
System.out.println(dateFashion(8, 2));
System.out.println(dateFashion(1, 6));
System.out.println(dateFashion(10, 10));
System.out.println(dateFashion(7, 5));
System.out.println(dateFashion(10, 7));
System.out.println(dateFashion(9, 1));
System.out.println(dateFashion(6, 1));
System.out.println(dateFashion(5, 7));
System.out.println(dateFashion(6, 6));
System.out.println(dateFashion(7, 2));
System.out.println(dateFashion(8, 9));
System.out.println(dateFashion(2, 7));
}

public static void main(String []args){
DATEFASHION obj = new DATEFASHION();
obj.dateFashion_test(args);
}

}
