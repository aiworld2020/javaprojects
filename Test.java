
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
      int[] values = {1,1,1,1};
      int result = 0;
      int mid = 0;
      int[] leftValues = new int[values.length / 2];
      int[] rightValues = new int[values.length / 2];
      String leftValuesStr = new String();
      String rightValuesStr = new String();
      
     
         if(values.length %2 == 0) {
             mid = values.length / 2;
         }
         else {
             mid = values.length / 2 + 1;
         }
          
         for (int i = 0; i < leftValues.length; i++)
         {
            leftValues[i] = values[i];
            leftValuesStr = leftValuesStr + values[i];
         }
         int j = 0;
         for (int i = mid; i < values.length; i++)
         {
             rightValues[j] = values[i];
             j++;
             rightValuesStr = rightValuesStr + values[i];
         }
         
          
         while(leftValuesStr.length() > 0) 
         {
             if(leftValuesStr.equals(rightValuesStr))
             {
                 result = leftValuesStr.length();
                 break;
             }
             else
             {
                 leftValuesStr = leftValuesStr.substring(0, leftValuesStr.length() -1);
                 rightValuesStr = rightValuesStr.substring(1, rightValuesStr.length());
             }
             //System.out.println("left values = " +  leftValuesStr);
             //System.out.println("right values = " +  rightValuesStr);
             
             
         
         }
      System.out.println("results = " + result);

    }
}
