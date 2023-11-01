public class DATEFASHION{
public int dateFashion(int you, int date){
try {
if (you >= 8 && date > 2 || date >= 8 && date > 2){
        return 2;
    }
    else if (date <= 2 || you <= 2){
        return 0;
    }
    else{
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
System.out.println(dateFashion(8, 2));
System.out.println(dateFashion(0, 0));
System.out.println(dateFashion(10, 10));
System.out.println(dateFashion(1, 1));
System.out.println(dateFashion(9, 1));
System.out.println(dateFashion(10, 3));
System.out.println(dateFashion(3, 3));
System.out.println(dateFashion(3, 8));
System.out.println(dateFashion(7, 7));
System.out.println(dateFashion(8, 9));
System.out.println(dateFashion(3, 10));
System.out.println(dateFashion(5, 5));
}

public static void main(String []args){
DATEFASHION obj = new DATEFASHION();
obj.dateFashion_test(args);
}

}
