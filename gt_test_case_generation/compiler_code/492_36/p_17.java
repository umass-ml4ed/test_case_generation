public class COUNTCODE{
public int countCode(String str){
try {
int times = 0;
	int i = 0;
	int len = str.length()-3;
	while(i <  len)
	{
		if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e')
		{
			times++;
			i += 4;
		}
		else
        {
            i++;
        }
	}
	return times;
} catch (Exception e) {
System.out.print(e + " ");
return -999;
}
}

public void countCode_test(String []s){
System.out.println(countCode("codecodecode"));
System.out.println(countCode("cooecode"));
System.out.println(countCode("covcode"));
System.out.println(countCode("cozecode"));
System.out.println(countCode("coiecode"));
System.out.println(countCode("coaecode"));
System.out.println(countCode("cohecode"));
System.out.println(countCode("coxecode"));
System.out.println(countCode("comcode"));
System.out.println(countCode("co@code"));
System.out.println(countCode("couecode"));
System.out.println(countCode("cobecode"));
System.out.println(countCode("colecode"));
System.out.println(countCode("cojcode"));
System.out.println(countCode("cokecode"));
System.out.println(countCode("coyecode"));
System.out.println(countCode("conecode"));
}

public static void main(String []args){
COUNTCODE obj = new COUNTCODE();
obj.countCode_test(args);
}

}
