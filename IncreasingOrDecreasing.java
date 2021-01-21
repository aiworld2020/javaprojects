/**
 * Write a description of class UnitConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class IncreasingOrDecreasing
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
      if (num1 < num2 && num2 < num3)
      {
          System.out.println("increasing");
      }
      else if (num1 > num2 && num2 > num3)
      {
          System.out.println("decreasing");
      }
      else 
      {
          System.out.println("Neither");
      }
      int i = 1;
      System.out.println(i++);
      System.out.println(i);
    }
}
