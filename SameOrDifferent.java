/**
 * Write a description of class UnitConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SameOrDifferent
{
    public static void main(String[] args)
    {
      Scanner kboard = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num1 = kboard.nextInt();
      System.out.print("Enter another number: ");
      int num2 = kboard.nextInt();
      System.out.print("Enter your last number: ");
      int num3 = kboard.nextInt();
      if (num1 == num2 && num1 == num3 && num2 == num3)
      {
          System.out.println("All the same");
      }
      else if (num1 != num2 && num1 != num3 && num2 != num3)
      {
          System.out.println("All different");
      }
      else 
      {
          System.out.println("Neither");
      }
    }
}
