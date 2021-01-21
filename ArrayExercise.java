import java.lang.Math;
import java.util.Arrays;
/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayExercise
{
  public static void main(String[] args)
  {    
    int[] ary = new int[12];
    //Assign values to array
    for(int i = 0; i < ary.length; i++)
    {
      ary[i]= (int)(Math.random() * 110) - 20;
      
    }
    //Print array using enhanced for loop
    for (int j : ary)
    {
        System.out.println(j);
    }
    //Swap
    int t = ary[0];
    ary[0] = ary[ary.length - 1];
    ary[ary.length - 1] = t;
    //Print Array backwards
    for (int k = ary.length - 1; k >= 0; k--)
    {
        System.out.println(ary[k]);
    }
    int minVal = ary[0];
    int maxVal = ary[0];
    int curVal = 0;
    double sum = 0.0;
    double average = 0.0;
    for (int i = 0; i < ary.length; i++)
    {
        curVal = ary[i];
        if (curVal < minVal)
        {
            minVal = curVal;
        }
        else if (curVal > maxVal)
        {
            maxVal = curVal;
        }
        sum += curVal;
    }
    average = sum / ary.length;
    System.out.println("Min value = " + minVal);
    System.out.println("Max value = " + maxVal);
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + average);
    System.out.println("Sorted Array: ");
    Arrays.sort(ary);
    for (int i: ary)
    {
        System.out.print(i + ", ");
    }
    System.out.println("\nBinary Search result = " + Arrays.binarySearch(ary, 12));
    System.out.println("Text representation = " + Arrays.toString(ary));
  }
}
