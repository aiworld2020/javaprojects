import java.util.Scanner;

/**
   Computes a sum of odd integers between two bounds. 
   Input: a, the lower bound (may be odd or even).
   Input: b, the upper bound (may be odd or even).
   Output: sum of odd integers between a and b (inclusive).
*/
import java.lang.Math;
public class OddSum
{
   public static void main(String[] args)
   {
      // Read values for a and b
      int sum = 0;
      
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      for (int i = a; i <= b; i++)
      {
         System.out.println("1");
         
         if (Math.abs(i) % 2 == 1)
         {
            sum += i;
            System.out.println("2");

         }
      }


      System.out.println(sum);
      System.out.println(-11%2);
      System.out.println(-11/2);
   }
}