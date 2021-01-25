import java.util.Scanner;

/**
   This program shows a simple quiz with two question types.
*/
public class Main
{
   public static void main(String[] args)
   {
      //Object obj = "Who was the inventor of Java?";
      //Question q1 = (Question) obj;
      //q1.setText("Who was the inventor of Java?");
      //q1.setAnswer("James Gosling");      
      
      ChoiceQuestion q2 = new ChoiceQuestion();
      q2.setText("In which country was the inventor of Java born?");
      q2.addChoice("Australia", false);
      q2.addChoice("Canada", true); 
      q2.addChoice("Denmark", false); 
      q2.addChoice("United States", false); 

      //presentQuestion(q1);
      presentQuestion(q2);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      System.out.println();
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      if (q.checkAnswer(response)) {
          System.out.println("Good job!");
        }
      else {
          System.out.println("Incorrect");
        }
   }

   /**
      Presents a question to the user and checks the response.
      @param q the Choice question
   */
   public static void presentQuestion(ChoiceQuestion q)
   {
      System.out.println();
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      if (q.checkAnswer(response)) {
          System.out.println("Good job!");
        }
      else {
          System.out.println("Incorrect");
        }
   }
}

