
/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount momsAcct = new BankAccount(1000.0);
        momsAcct.addInterest(10.0);
        System.out.println("After Interest = " + momsAcct.getBalance());
        System.out.println("Expected = 1100.0");
          }    
}