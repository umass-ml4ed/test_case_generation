public class DATEFASHION{
public int dateFashion(int you, int date){
try {
if (you >=5 && you >= 10 || date >= 5 && date <= 10)
    {
        return 2;
    }
    
    else if (you >=2 && you <=9 || date >=2 && date <=9)
    {
        return 0;
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
System.out.println(dateFashion(2, 2));
System.out.println(dateFashion(1, 9));
System.out.println(dateFashion(7, 6));
System.out.println(dateFashion(7, 5));
System.out.println(dateFashion(10, 10));
System.out.println(dateFashion(6, 9));
System.out.println(dateFashion(1, 1));
System.out.println(dateFashion(2, 10));
System.out.println(dateFashion(9, 1));
System.out.println(dateFashion(9, 9));
System.out.println(dateFashion(6, 6));
System.out.println(dateFashion(5, 10));
System.out.println(dateFashion(5, 5));
System.out.println(dateFashion(10, 2));
}

public static void main(String []args){
DATEFASHION obj = new DATEFASHION();
obj.dateFashion_test(args);
}

}
