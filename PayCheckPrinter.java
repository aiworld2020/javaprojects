import java.util.Random;

/**
 * Write a description of class PayCheckPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayCheckPrinter
{
    public static void main(String[] args) {
        PayCheck empl1 = new PayCheck("Golden Bear", 11.0);
        
        for (int i = 1; i <= 4; i++) {
            empl1.addHours(i*12);
            empl1.addHours(2);
            empl1.raisePay(1.0);
            System.out.println(empl1);
            System.out.println("    This week's pay is $" + empl1.calcWeekPay());
        }
    }
}
