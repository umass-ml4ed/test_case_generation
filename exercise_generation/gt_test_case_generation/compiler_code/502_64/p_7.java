public class FIZZBUZZ{
public String[] fizzBuzz(int start, int end){
try {
String[] a = new String[end - start];
    for (int i = start; i < end; i++) {
    	if (i % 3 == 0 && i % 5 == 0) {
        	a[i - 1] = "FizzBuzz";    
        }
        else if (i % 3 == 0) {
            a[i - 1] = "Fizz";
        }
        else if (i % 5 == 0) {
        	a[i - 1] = "Buzz";    
        }
        else {
        	a[i - 1] = String.valueOf(i);    
        }
    }
    return a;
} catch (Exception e) {
System.out.print(e + " ");
return new String[] {"ERROR"};
}
}

public void fizzBuzz_test(String []s){
System.out.println(fizzBuzz(fizzBuzz(1, 7)));
System.out.println(fizzBuzz(fizzBuzz(1, 11)));
System.out.println(fizzBuzz(fizzBuzz(1, 12)));
System.out.println(fizzBuzz(fizzBuzz(3, 8)));
System.out.println(fizzBuzz(fizzBuzz(1, 9)));
System.out.println(fizzBuzz(fizzBuzz(2, 12)));
System.out.println(fizzBuzz(fizzBuzz(3, 11)));
System.out.println(fizzBuzz(fizzBuzz(2, 11)));
System.out.println(fizzBuzz(fizzBuzz(1, 6)));
System.out.println(fizzBuzz(fizzBuzz(1, 10)));
System.out.println(fizzBuzz(fizzBuzz(1, 8)));
System.out.println(fizzBuzz(fizzBuzz(2, 9)));
System.out.println(fizzBuzz(fizzBuzz(2, 10)));
System.out.println(fizzBuzz(fizzBuzz(3, 9)));
System.out.println(fizzBuzz(fizzBuzz(2, 8)));
System.out.println(fizzBuzz(fizzBuzz(3, 10)));
System.out.println(fizzBuzz(fizzBuzz(2, 7)));
}

public static void main(String []args){
FIZZBUZZ obj = new FIZZBUZZ();
obj.fizzBuzz_test(args);
}

}
