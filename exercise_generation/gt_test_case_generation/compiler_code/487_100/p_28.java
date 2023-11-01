public class ROUNDSUM{
public int roundSum(int a, int b, int c){
try {
return (round10(a) + round10(b) + round10(c));
}

public int round10(int num)
{
    int digit = num % 10;

	if(digit >= 5)

		return num + (10 - digit);

	return num - digit;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void roundSum_test(String []s){
System.out.println(roundSum(610, 620, 630));
System.out.println(roundSum(490, 500, 510));
System.out.println(roundSum(130, 140, 150));
System.out.println(roundSum(100, 110, 120));
System.out.println(roundSum(790, 800, 810));
System.out.println(roundSum(280, 290, 300));
System.out.println(roundSum(430, 440, 450));
System.out.println(roundSum(250, 260, 270));
System.out.println(roundSum(370, 380, 390));
System.out.println(roundSum(520, 530, 540));
System.out.println(roundSum(730, 740, 750));
System.out.println(roundSum(700, 710, 720));
System.out.println(roundSum(460, 470, 480));
System.out.println(roundSum(70, 80, 90));
System.out.println(roundSum(640, 650, 660));
System.out.println(roundSum(400, 410, 420));
System.out.println(roundSum(670, 680, 690));
System.out.println(roundSum(160, 170, 180));
System.out.println(roundSum(40, 50, 60));
System.out.println(roundSum(10, 20, 30));
System.out.println(roundSum(190, 200, 210));
System.out.println(roundSum(4, 3, 2));
System.out.println(roundSum(220, 230, 240));
System.out.println(roundSum(340, 350, 360));
System.out.println(roundSum(580, 590, 600));
System.out.println(roundSum(310, 320, 330));
System.out.println(roundSum(550, 560, 570));
System.out.println(roundSum(760, 770, 780));
}

public static void main(String []args){
ROUNDSUM obj = new ROUNDSUM();
obj.roundSum_test(args);
}

}
