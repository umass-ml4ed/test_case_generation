public class ANSWERCELL{
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
{
    if (isMorning == true && isMom == true)
    {
        return true;
    }
    
    else if (isMorning == false && isMom == false || isAsleep == true)
    {
        return false;
    }
    else 
    {
        return true;
    }
    
}

public void answerCell_test(String []s){
System.out.println(answerCell(true, true, true));
System.out.println(answerCell(true, true, false));
System.out.println(answerCell(true, false, true));
System.out.println(answerCell(true, false, false));
System.out.println(answerCell(false, true, true));
System.out.println(answerCell(false, true, false));
System.out.println(answerCell(false, false, true));
System.out.println(answerCell(false, false, false));
}

public static void main(String []args){
ANSWERCELL obj = new ANSWERCELL();
obj.answerCell_test(args);
}

}
