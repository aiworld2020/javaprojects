/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount 
{
    //FIELDS
    private double balance;
    
    //CONSTRUCTORS
    public BankAccount()
    {
        balance = 0.0;
    }
    
    public BankAccount(double initAmt)
    {
        balance = initAmt;
    }    
    //METHODS
    public void deposit(double amt)
    {
        balance = balance + amt;
    }

    public void withdraw(double amt)
    {
        balance = balance - amt;
    }
    
    public void addInterest(double rate)
    {
        balance = balance * (rate/100) + balance;
    }
    
    public double getBalance()
    {
        return balance;
    }    
}