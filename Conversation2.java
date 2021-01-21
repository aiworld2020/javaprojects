/**
 * Have a brief conversation with the user.
 * 
 * @author Aryan Agrawal 
 * @version Summer 2020
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("What is your name? "); // Ask user
    String name = kboard.nextLine();         // Accept answer from user
    
    System.out.println("Hello, " + name);
    System.out.print("\nWhat month were you born in, " + name + "?"); // Ask user
     
    String month = kboard.nextLine();   // Accept answer from user

    System.out.println("So you were born in " + month + ", right?");   
        
    System.out.print("\nWhich day in " + month + " were you born in?"); // Ask user
    int day = kboard.nextInt(); // Accept answer from user
    System.out.println("Just confirming that you were born on " + month + ", " + day + " right?");    
    
    System.out.print("\nWhat is the fartest distance you've ran in miles?"); // Ask user
    double dist = kboard.nextDouble(); // Accept answer from user
    System.out.println("Wow! " + dist + " miles is a lot!");
    
    String bye = "\nThat's all. Thank you!"; // This is how a String variable is assigned
    System.out.println(bye);
    
    kboard.close(); // Done using the keyboard
  }
}
