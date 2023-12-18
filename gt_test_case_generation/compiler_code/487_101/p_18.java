public class MAKECHOCOLATE{
public int makeChocolate(int small, int big, int goal){
try {
if (small + big*5 < goal)
        return -1;
    int mem = goal % 5;
    return mem;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void makeChocolate_test(String []s){
System.out.println(makeChocolate(2, 6, 32));
System.out.println(makeChocolate(1, 4, 21));
System.out.println(makeChocolate(3, 4, 23));
System.out.println(makeChocolate(2, 5, 27));
System.out.println(makeChocolate(6, 4, 26));
System.out.println(makeChocolate(3, 2, 11));
System.out.println(makeChocolate(3, 3, 18));
System.out.println(makeChocolate(3, 5, 28));
System.out.println(makeChocolate(4, 5, 29));
System.out.println(makeChocolate(5, 2, 15));
System.out.println(makeChocolate(6, 3, 21));
System.out.println(makeChocolate(4, 4, 24));
System.out.println(makeChocolate(1, 6, 31));
System.out.println(makeChocolate(4, 2, 14));
System.out.println(makeChocolate(6, 2, 16));
System.out.println(makeChocolate(5, 3, 20));
System.out.println(makeChocolate(5, 4, 25));
System.out.println(makeChocolate(6, 1, 11));
System.out.println(makeChocolate(2, 3, 17));
System.out.println(makeChocolate(3, 6, 33));
System.out.println(makeChocolate(2, 4, 22));
System.out.println(makeChocolate(1, 7, 36));
System.out.println(makeChocolate(4, 3, 19));
System.out.println(makeChocolate(5, 1, 6));
System.out.println(makeChocolate(1, 5, 26));
}

public static void main(String []args){
MAKECHOCOLATE obj = new MAKECHOCOLATE();
obj.makeChocolate_test(args);
}

}
