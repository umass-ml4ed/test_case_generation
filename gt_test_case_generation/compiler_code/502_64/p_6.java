public class FIZZBUZZ{
public String[] fizzBuzz(int start, int end){
try {
String[] string = new String[end -1];
    int a = start;
    for (int i = 0; i < end - 1; i++)
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
System.out.println(fizzBuzz(2, 8));
System.out.println(fizzBuzz(1, 8));
System.out.println(fizzBuzz(4, 9));
System.out.println(fizzBuzz(1, 9));
System.out.println(fizzBuzz(1, 6));
System.out.println(fizzBuzz(1, 7));
System.out.println(fizzBuzz(3, 9));
System.out.println(fizzBuzz(4, 8));
System.out.println(fizzBuzz(1, 11));
System.out.println(fizzBuzz(3, 8));
System.out.println(fizzBuzz(2, 6));
System.out.println(fizzBuzz(2, 9));
System.out.println(fizzBuzz(6, 10));
System.out.println(fizzBuzz(2, 7));
System.out.println(fizzBuzz(3, 7));
System.out.println(fizzBuzz(5, 9));
System.out.println(fizzBuzz(1, 10));
}

public static void main(String []args){
FIZZBUZZ obj = new FIZZBUZZ();
obj.fizzBuzz_test(args);
}

}
