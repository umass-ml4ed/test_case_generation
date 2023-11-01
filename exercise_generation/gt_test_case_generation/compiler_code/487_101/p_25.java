public class MAKECHOCOLATE{
public int makeChocolate(int small, int big, int goal){
try {
int maxBig = goal/5;

	if(maxBig <= big)

		goal -= maxBig*5;

	else

		goal -= big*5;

	if(goal <= small)

		return goal;

	return -1;
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void makeChocolate_test(String []s){
System.out.println(makeChocolate(11, 2, 16));
System.out.println(makeChocolate(16, 2, 16));
System.out.println(makeChocolate(19, 4, 26));
System.out.println(makeChocolate(4, 2, 16));
System.out.println(makeChocolate(9, 4, 26));
System.out.println(makeChocolate(5, 3, 21));
System.out.println(makeChocolate(23, 0, 6));
System.out.println(makeChocolate(21, 2, 16));
System.out.println(makeChocolate(8, 0, 6));
System.out.println(makeChocolate(2, 0, 6));
System.out.println(makeChocolate(18, 0, 6));
System.out.println(makeChocolate(12, 1, 11));
System.out.println(makeChocolate(3, 1, 11));
System.out.println(makeChocolate(17, 1, 11));
System.out.println(makeChocolate(20, 3, 21));
System.out.println(makeChocolate(10, 3, 21));
System.out.println(makeChocolate(22, 1, 11));
System.out.println(makeChocolate(7, 1, 11));
System.out.println(makeChocolate(0, 3, 21));
System.out.println(makeChocolate(13, 0, 6));
System.out.println(makeChocolate(6, 2, 16));
System.out.println(makeChocolate(14, 4, 26));
System.out.println(makeChocolate(15, 3, 21));
System.out.println(makeChocolate(1, 4, 26));
System.out.println(makeChocolate(24, 5, 27));
}

public static void main(String []args){
MAKECHOCOLATE obj = new MAKECHOCOLATE();
obj.makeChocolate_test(args);
}

}
