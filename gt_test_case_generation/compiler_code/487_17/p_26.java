public class REDTICKET{
public int redTicket(int a, int b, int c){
try {
if(a == b && b == c)

	{

		if(a == 2)

			return 10;

		return 5;

	}

	if(a != b && a !=c)

		return 1;

	return 0;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void redTicket_test(String []s){
System.out.println(redTicket(1, 1, 0));
System.out.println(redTicket(2, 0, 0));
System.out.println(redTicket(0, 0, 2));
System.out.println(redTicket(0, 2, 2));
System.out.println(redTicket(1, 2, 2));
System.out.println(redTicket(1, 0, 2));
System.out.println(redTicket(1, 0, 0));
System.out.println(redTicket(2, 0, 1));
System.out.println(redTicket(1, 2, 0));
System.out.println(redTicket(0, 0, 0));
System.out.println(redTicket(1, 0, 1));
System.out.println(redTicket(0, 1, 0));
System.out.println(redTicket(2, 0, 2));
System.out.println(redTicket(1, 1, 2));
System.out.println(redTicket(2, 1, 0));
System.out.println(redTicket(2, 1, 1));
System.out.println(redTicket(2, 2, 1));
System.out.println(redTicket(0, 2, 0));
System.out.println(redTicket(2, 2, 0));
System.out.println(redTicket(0, 1, 1));
System.out.println(redTicket(0, 2, 1));
System.out.println(redTicket(0, 1, 2));
System.out.println(redTicket(1, 1, 1));
System.out.println(redTicket(0, 0, 1));
}

public static void main(String []args){
REDTICKET obj = new REDTICKET();
obj.redTicket_test(args);
}

}
