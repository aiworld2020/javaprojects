
/**
 * Write a description of class CashRegister3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashRegister3
{
   private double purchase;
   private double payment;
   private Coin[] coinArr = new Coin[5];
   public static final double DOLLAR_VALUE = 100.0;
   public static final double QUARTER_VALUE = 25.0;
   public static final double DIME_VALUE = 10.0;
   public static final double NICKEL_VALUE = 5.0;
   public static final double PENNY_VALUE = 1.0;
       
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister3()
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
   public void receivePayment(int count, Coin coinType) {
       payment += count * coinType.getValue();
    }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public int[] giveChange()
   {
      double change = payment - purchase;
      payment = 0;
      purchase = 0;
      change = change * 100.0;
      coinArr[0] = new Coin(change / DOLLAR_VALUE, "Dollar");
      coinArr[1] = new Coin(change - (coinArr[0].getValue() * 100), "Quarter");
      coinArr[2] = new Coin(change - (coinArr[0].getValue()*100) - (coinArr[1].getValue() * 25), "Dime");
      coinArr[3] = new Coin(change - (coinArr[0].getValue()*100) - (coinArr[1].getValue() * 25) - (coinArr[2].getValue() * 10), "Nickel"); // NICKEL_VALUE
      coinArr[4] = new Coin(change - (coinArr[0].getValue()*100) - (coinArr[1].getValue() * 25) - (coinArr[2].getValue() * 10) - (coinArr[3].getValue() * 5), "Penny"); // PENNY_VALUE;
      int[] coinValue = new int[5];
      for (int i = 0; i < coinValue.length; i++)
      {
          coinValue[i] = (int)coinArr[i].getValue();
      }
      return coinValue;
   }
}
