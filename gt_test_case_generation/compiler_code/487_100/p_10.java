public class ROUNDSUM{
public int roundSum(int a, int b, int c){
try {
int sum = round10(a);
    sum = round10(b) + sum;
    sum = round10(c) + sum;
    return sum;
}

public int round10(int num)
{
    if (num % 10 >= 5)
    {
        return num + num % 10;
    }
    else if (num % 10 < 5)
    {
        return num - num % 10;
    }
    else
    {
        return num;
    }
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void roundSum_test(String []s){
System.out.println(roundSum(11, 21, 31));
System.out.println(roundSum(1, 2, 3));
System.out.println(roundSum(255, 265, 275));
System.out.println(roundSum(21, 31, 41));
System.out.println(roundSum(31, 41, 2));
System.out.println(roundSum(75, 85, 95));
System.out.println(roundSum(225, 235, 245));
System.out.println(roundSum(345, 355, 365));
System.out.println(roundSum(4, 11, 21));
System.out.println(roundSum(315, 325, 335));
System.out.println(roundSum(525, 535, 545));
System.out.println(roundSum(105, 115, 125));
System.out.println(roundSum(405, 415, 425));
System.out.println(roundSum(495, 505, 515));
System.out.println(roundSum(465, 475, 485));
System.out.println(roundSum(45, 55, 65));
System.out.println(roundSum(4, 1, 2));
System.out.println(roundSum(15, 25, 35));
System.out.println(roundSum(375, 385, 395));
System.out.println(roundSum(41, 2, 3));
System.out.println(roundSum(3, 4, 1));
System.out.println(roundSum(435, 445, 455));
System.out.println(roundSum(165, 175, 185));
System.out.println(roundSum(195, 205, 215));
System.out.println(roundSum(135, 145, 155));
System.out.println(roundSum(285, 295, 305));
System.out.println(roundSum(2, 3, 4));
}

public static void main(String []args){
ROUNDSUM obj = new ROUNDSUM();
obj.roundSum_test(args);
}

}
