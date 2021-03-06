
/**
 * Write a description of class CashRegisterTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashRegisterTester
{
      public static void main(String[] args)
   {
       final double DOLLAR_VALUE = 1.0;
       final double QUARTER_VALUE = 0.25;
       final double DIME_VALUE = 0.1;
       final double NICKEL_VALUE = 0.05;
       final double PENNY_VALUE = 0.01;
       
      // FIRST PURCHASE
      // Create CashRegisterATDP object, and 
      // record price for each purchased item
      
      System.out.println("\nFIRST PURCHASE");
      
      
      CashRegister3 register = new CashRegister3(); 
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      
      // Create Coin objects, and
      // Record price for each type of coin
      Coin dollar = new Coin(DOLLAR_VALUE, "Dollar");
      Coin quarter = new Coin
      (QUARTER_VALUE, "Quarter");
      Coin dime = new Coin
      (DIME_VALUE, "Dime");
      Coin nickel = new Coin
      (NICKEL_VALUE, "Nickel");
      Coin penny = new Coin
      (PENNY_VALUE, "Penny");
      register.receivePayment(2, dollar);
      register.receivePayment(1, quarter);
      register.receivePayment(2, dime);
      register.receivePayment(5, penny);
      
      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.println(register.giveChange());
      System.out.println("\tExpected change amount: 0.25");

      
      // SECOND PURCHASE
      // NOTE: Do NOT creat CashRegisterATDP object again
      // Record price for each purchased item
      
      System.out.println("\nSECOND PURCHASE");
            
      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      
      // NOTE: Do NOT creat Coin objects again
      // Record price for each type of coin
      register.receivePayment(23, dollar);
      register.receivePayment(2, quarter);
      register.receivePayment(1, dime);

      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.println(register.giveChange());
      System.out.println("\tExpected change amount: 2.10"); //... YOUR EXPECT CHANGE VALUE HERE
   }
  
}
