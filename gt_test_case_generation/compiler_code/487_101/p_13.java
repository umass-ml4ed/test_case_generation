public class MAKECHOCOLATE{
public int makeChocolate(int small, int big, int goal){
try {
if ((small * 1) == goal)
    {
        return(small);
    }
    else if ((big * 5) == goal)
    {
        return(0);
    }
    else if ((big * 5) + (small * 1) == goal)
    {
        return(small);
    }
    else if ((goal - 5) == (small * 1))
    {
        return(small);
    }
    else 
    {
        return(-1);
    }
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void makeChocolate_test(String []s){
System.out.println(makeChocolate(10, 4, 20));
System.out.println(makeChocolate(6, 2, 12));
System.out.println(makeChocolate(11, 2, 22));
System.out.println(makeChocolate(19, 3, 19));
System.out.println(makeChocolate(21, 2, 26));
System.out.println(makeChocolate(24, 3, 39));
System.out.println(makeChocolate(15, 4, 23));
System.out.println(makeChocolate(20, 4, 24));
System.out.println(makeChocolate(16, 2, 18));
System.out.println(makeChocolate(14, 3, 19));
System.out.println(makeChocolate(12, 1, 17));
System.out.println(makeChocolate(13, 2, 26));
System.out.println(makeChocolate(8, 2, 16));
System.out.println(makeChocolate(5, 2, 10));
System.out.println(makeChocolate(7, 1, 7));
System.out.println(makeChocolate(3, 2, 10));
System.out.println(makeChocolate(17, 1, 22));
System.out.println(makeChocolate(2, 3, 15));
System.out.println(makeChocolate(9, 3, 18));
System.out.println(makeChocolate(22, 1, 27));
System.out.println(makeChocolate(4, 1, 5));
System.out.println(makeChocolate(23, 2, 33));
System.out.println(makeChocolate(1, 4, 20));
System.out.println(makeChocolate(18, 2, 28));
System.out.println(makeChocolate(25, 4, 45));
}

public static void main(String []args){
MAKECHOCOLATE obj = new MAKECHOCOLATE();
obj.makeChocolate_test(args);
}

}
