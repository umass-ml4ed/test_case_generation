public class EVENLYSPACED{
public boolean evenlySpaced(int a, int b, int c){
try {
int temp = 0;
	if(b > a)
		temp = a;
		a = b;
		b = temp;
	if(c > b)
		temp = b;
		b =c;
		c = temp;	
	if(b > a)
		temp = a;
		a = b;
		b = temp;
	return(a - b == b - c);
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void evenlySpaced_test(String []s){
System.out.println(evenlySpaced(2, 4, 3));
System.out.println(evenlySpaced(1, 2, 3));
System.out.println(evenlySpaced(3, 6, 9));
System.out.println(evenlySpaced(12, 24, 36));
System.out.println(evenlySpaced(13, 26, 39));
System.out.println(evenlySpaced(7, 9, 8));
System.out.println(evenlySpaced(6, 8, 7));
System.out.println(evenlySpaced(3, 5, 4));
System.out.println(evenlySpaced(11, 22, 33));
System.out.println(evenlySpaced(8, 16, 24));
System.out.println(evenlySpaced(9, 18, 27));
System.out.println(evenlySpaced(6, 12, 18));
System.out.println(evenlySpaced(2, 4, 6));
System.out.println(evenlySpaced(4, 6, 5));
System.out.println(evenlySpaced(10, 20, 30));
System.out.println(evenlySpaced(5, 10, 15));
System.out.println(evenlySpaced(7, 14, 21));
System.out.println(evenlySpaced(4, 8, 12));
System.out.println(evenlySpaced(8, 10, 9));
System.out.println(evenlySpaced(1, 3, 2));
System.out.println(evenlySpaced(5, 7, 6));
}

public static void main(String []args){
EVENLYSPACED obj = new EVENLYSPACED();
obj.evenlySpaced_test(args);
}

}
