public class BLACKJACK{
public int blackjack(int a, int b){
try {
int ans = 0;
	if (a > b){
        if (a <= 21)
            ans = a;
        else if (a > 21 && b <= 21)
            ans = b;
        else
            ans = 0;
    }
	else if (b > a){
        if (b <= 21)
            ans = a;
        else if (b > 21 && a <= 21)
            ans = b;
        else
            ans = 0;
    }
    return ans;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void blackjack_test(String []s){
System.out.println(blackjack(3, 4));
System.out.println(blackjack(22, 22));
System.out.println(blackjack(2, 3));
System.out.println(blackjack(21, 20));
System.out.println(blackjack(5, 5));
System.out.println(blackjack(22, 20));
System.out.println(blackjack(15, 10));
System.out.println(blackjack(22, 15));
System.out.println(blackjack(20, 22));
System.out.println(blackjack(21, 22));
System.out.println(blackjack(10, 15));
System.out.println(blackjack(22, 10));
System.out.println(blackjack(10, 22));
System.out.println(blackjack(21, 10));
System.out.println(blackjack(1, 2));
System.out.println(blackjack(22, 1));
System.out.println(blackjack(1, 21));
System.out.println(blackjack(22, 21));
System.out.println(blackjack(20, 21));
System.out.println(blackjack(15, 22));
System.out.println(blackjack(10, 21));
System.out.println(blackjack(21, 21));
}

public static void main(String []args){
BLACKJACK obj = new BLACKJACK();
obj.blackjack_test(args);
}

}
