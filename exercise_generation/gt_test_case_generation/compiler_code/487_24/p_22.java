public class BLACKJACK{
public int blackjack(int a, int b){
try {
if(a > 21)

	{

		if(b > 21)

			return 0;

		return b;

	}

	if(a < b && b <= 21)

		return b;

	return a;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void blackjack_test(String []s){
System.out.println(blackjack(8, 7));
System.out.println(blackjack(20, 19));
System.out.println(blackjack(4, 3));
System.out.println(blackjack(21, 20));
System.out.println(blackjack(2, 1));
System.out.println(blackjack(14, 13));
System.out.println(blackjack(22, 20));
System.out.println(blackjack(16, 15));
System.out.println(blackjack(10, 9));
System.out.println(blackjack(18, 17));
System.out.println(blackjack(7, 6));
System.out.println(blackjack(6, 5));
System.out.println(blackjack(22, 10));
System.out.println(blackjack(17, 16));
System.out.println(blackjack(19, 18));
System.out.println(blackjack(12, 11));
System.out.println(blackjack(20, 21));
System.out.println(blackjack(5, 4));
System.out.println(blackjack(15, 14));
System.out.println(blackjack(3, 2));
System.out.println(blackjack(13, 12));
System.out.println(blackjack(9, 8));
}

public static void main(String []args){
BLACKJACK obj = new BLACKJACK();
obj.blackjack_test(args);
}

}
