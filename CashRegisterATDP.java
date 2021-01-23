
/**
 * Write a description of class CashRegisterATDP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashRegisterATDP
{
    private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegisterATDP()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
   }
   

   /**
      Record (part of) the payment, per coin type, and accumlate into total payment
      @param count number of coins received
      @param coinType the coin received
   */
   public void receivePayment(int count, CoinATDP coinType) {
       payment += count * coinType.getValue();
    }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      payment = 0;
      purchase = 0;
      return change;
   }
}
