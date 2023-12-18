public class BLACKJACK{
public int blackjack(int a, int b){
try {
if ((a > b) && (a <= 21))
        return a;
    else if ((b > a) && (b <= 21))
        return b;
    else
        return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void blackjack_test(String []s){
System.out.println(blackjack(10, 11));
System.out.println(blackjack(18, 18));
System.out.println(blackjack(21, 20));
System.out.println(blackjack(2, 1));
System.out.println(blackjack(22, 20));
System.out.println(blackjack(17, 17));
System.out.println(blackjack(16, 15));
System.out.println(blackjack(1, 22));
System.out.println(blackjack(22, 15));
System.out.println(blackjack(21, 22));
System.out.println(blackjack(11, 10));
System.out.println(blackjack(21, 21));
System.out.println(blackjack(10, 22));
System.out.println(blackjack(1, 2));
System.out.println(blackjack(22, 1));
System.out.println(blackjack(19, 19));
System.out.println(blackjack(16, 16));
System.out.println(blackjack(22, 21));
System.out.println(blackjack(20, 21));
System.out.println(blackjack(15, 22));
System.out.println(blackjack(15, 16));
System.out.println(blackjack(20, 20));
}

public static void main(String []args){
BLACKJACK obj = new BLACKJACK();
obj.blackjack_test(args);
}

}
