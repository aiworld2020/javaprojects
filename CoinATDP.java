
/**
 * Write a description of class CoinATDP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoinATDP 
{
    // fields
    private double value; // value, in dollars, of the coin; 1.0, .25, etc.
    private String name; // name of the coin; e.g., dollar, quarter, etc.
    
    // constructor
    public CoinATDP (double aValue, String aName) {
        value = aValue;
        name = aName;
    }
    
    // methods
    public double getValue() {
         return value;
    }
    
    public String getName() {
         return name;
    }
}
