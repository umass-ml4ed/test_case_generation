public class FIZZBUZZ{
public String[] fizzBuzz(int start, int end){
try {
String[] string = new String[end - start];
    int a = start;
    for (int i = 0; i < end - start; i++)
    {
        if (a > 5 && a % 3 == 0 && a % 5 == 0)
        {
            string[i] = "FizzBuzz";
            a++;
        }
        else if (a >= 5 && a % 5 == 0)
        {
            string[i] = "Buzz";
            a++;
        }
        else if (a >= 3 && a % 3 == 0)
        {
            string[i] = "Fizz";
            a++;
        }
        else
        {
            string[i] = String.valueOf(a);
            a++;
        }
    }
    return string;
} catch (Exception e) {
System.out.print(e + " ");
return new String[] {"ERROR"};
}
}

public void fizzBuzz_test(String []s){
System.out.println(fizzBuzz(12, 17));
System.out.println(fizzBuzz(4, 9));
System.out.println(fizzBuzz(14, 19));
System.out.println(fizzBuzz(6, 11));
System.out.println(fizzBuzz(1, 6));
System.out.println(fizzBuzz(16, 21));
System.out.println(fizzBuzz(7, 12));
System.out.println(fizzBuzz(0, 5));
System.out.println(fizzBuzz(8, 13));
System.out.println(fizzBuzz(15, 20));
System.out.println(fizzBuzz(11, 16));
System.out.println(fizzBuzz(9, 14));
System.out.println(fizzBuzz(10, 15));
System.out.println(fizzBuzz(13, 18));
System.out.println(fizzBuzz(3, 8));
System.out.println(fizzBuzz(5, 10));
System.out.println(fizzBuzz(2, 7));
}

public static void main(String []args){
FIZZBUZZ obj = new FIZZBUZZ();
obj.fizzBuzz_test(args);
}

}
