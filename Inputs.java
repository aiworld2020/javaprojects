public class Inputs
{
   /**
      Gets the choice that the user provided, or null if the 
      user didn't provide a valid choice.
      @param input the user input
      @param maxChoice the maximum valid choice, e.g. "D" if there
      are four choices.
      @return the user input if it was a valid choice (i.e. length 1
      and between "A" and maxChoice), null otherwise
   */
   
   public static void main(String args[])
   {
       String result = "";
       String input = "1";
       String maxChoice = "D";
       
   if (input != null)
   {
       System.out.println((int) input.charAt(0));
         System.out.println((int) 'A');
         System.out.println((int) 'Z');
      if (input.length() != 1) 
      {
         result = null;
      }
      else if ((int) input.charAt(0) < (int)'A' | (int) input.charAt(0) > (int)'Z')
      {
         
         result = null;
      }
      else if ((int)input.charAt(0) > (int)maxChoice.charAt(0))
      {
         result = null;
      }
      
      else if (input.length() == 1)
      {
         result = input;
      }
      
   }  
   else
   {
      result = null;
   }
   System.out.println("result = " + result);
   }
}