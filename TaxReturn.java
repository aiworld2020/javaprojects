
/**
 * A program which returns the tax of the user input based on satus and age
 *
 * @author A. Agrawal
 * @version 1.0
 */
import java.util.Scanner;
public class TaxReturn
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter your status: ");
        String status = kboard.nextLine();
        System.out.print("Enter your taxable income: ");
        double tax = kboard.nextInt();
        if (status.equals("Single"))
        {
            if (tax <= 8000)
            {
                tax = (tax * 0.1);
            }
            else if (tax <= 32000)
            {
                tax = (tax * 0.15) + 800;
            }
            else 
            {
                tax = (tax * 0.25) + 4400;
            }
        }
        else if (status.equals("Married"))
        {
            if (tax <= 16000)
            {
                tax = (tax * 0.1);
            }
            else if (tax <= 64000)
            {
                tax = (tax * 0.15) + 1600;
            }
            else 
            {
                tax = (tax * 0.25) + 8800;
            }
        }
        System.out.println("Your tax is: " + tax);
    }
}
