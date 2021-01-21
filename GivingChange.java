/**
 * A program that gives change to customer
 * @author A. Agrawal
 * @version 1.0
 */
public class GivingChange
{
    private int due;
    private int paid;
    public static final int DOLLAR_VALUE = 100;
    public static final int QUARTER_VALUE = 25;
    public static final int DIME_VALUE = 10;
    public static final int NICKEL_VALUE = 5;
    public static final int PENNY_VALUE = 1;
    public String giveChange(int amtRecieved, int amtDue)
    {
        paid = amtRecieved;
        due = amtDue;
        int change = paid - due;
        int dollars = change / DOLLAR_VALUE;
        int quarters = (change - (dollars*100)) / QUARTER_VALUE;
        int dimes = (change - (dollars*100) - (quarters * 25)) / DIME_VALUE;
        int nickels = (change - (dollars*100) - (quarters * 25) - (dimes * 10)) / NICKEL_VALUE;
        int pennies = (change - (dollars*100) - (quarters * 25) - (dimes * 0) - (nickels * 5)) / PENNY_VALUE;
        return "Your change is " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.";
    }
}
