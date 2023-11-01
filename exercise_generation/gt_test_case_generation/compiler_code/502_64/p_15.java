public class FIZZBUZZ{
public String[] fizzBuzz(int start, int end){
try {
String[] stringArray = new String[end - start];
    for (int x = 0; x < stringArray.length; x++)
    {
        if ((x + start) % 3 == 0 && (x + start) % 5 != 0)
        {
            stringArray[x] = "Fizz";
        }
        else if ((x + start) % 5 == 0 && (x + start) % 3 != 0)
        {
            stringArray[x] = "Buzz";
        }
        else if (x != 0 && (x + start) % 5 == 0 && (x + start) % 3 == 0)
        {
            stringArray[x] = "FizzBuzz";
        }
        else
        {
            stringArray[x] = "" + (x + start);
        }
    }
    return stringArray;
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
