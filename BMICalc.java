
/**
 * A program which computes the BMI of the user
 *
 * @author A. Agrawal
 * @version 1.0
 */
import java.util.Scanner;
import java.lang.Math;
public class BMICalc
{
    public static void main(String[] args)
    {
        //Create Scanner
        Scanner kboard = new Scanner(System.in);
        //Get inputs from user
        System.out.print("Enter your name: ");
        String name = kboard.nextLine();
        System.out.print("\nEnter your age: ");
        int age = kboard.nextInt();
        System.out.print("\nEnter your weight in pounds: ");
        double weightInPounds = kboard.nextDouble();
        System.out.print("\nEnter your height in inches: ");
        double heightInInches = kboard.nextDouble();
        //Covert the weight and height to kilograms/meters
        double weightInKilos = weightInPounds / 2.205;
        double heightInMeters = heightInInches / 39.37;
        //Get BMI of user and print(use Math for exponent
        double BMI = weightInKilos / (Math.pow(heightInMeters, 2));
        System.out.printf("\nBMI of " + name + ", age " + age + ", is %.1f", BMI);
    }
}
