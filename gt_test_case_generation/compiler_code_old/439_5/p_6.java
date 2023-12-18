public class ANSWERCELL{
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
try {
if (isMom)
    {
        return true;
    }
    if (isAsleep)
    {
        return false;
    }
    return (!isMorning);
} catch (Exception e) {
System.out.print(e + " ");
return false;
}
}

public void answerCell_test(String []s){
System.out.println(answerCell(true, false, true));
System.out.println(answerCell(false, true, false));
System.out.println(answerCell(false, false, true));
System.out.println(answerCell(true, false, false));
System.out.println(answerCell(true, true, false));
System.out.println(answerCell(false, false, false));
System.out.println(answerCell(true, true, true));
System.out.println(answerCell(false, true, true));
}

public static void main(String []args){
ANSWERCELL obj = new ANSWERCELL();
obj.answerCell_test(args);
}

}
