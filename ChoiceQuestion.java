/**
* This class represents a multiple choice    * question
* @author A. Agrawal & A. Tsao
* @ version 1.0
*/
import java.util.ArrayList;
public class ChoiceQuestion extends Question
{
  // Fields
  private ArrayList<String> choices = new ArrayList<String>();
  
  /**
      Sets the choices.
      @param choice the text of this choice
      @param correct checks if answer is true or false
   */
  public void addChoice(String choice, boolean correct){
    choices.add(choice);
    if(correct){
      String choiceString = "" + choices.size();
      setAnswer(choiceString);
    }
  }
  
  /**
      Returns the text for the question with the choices.
      @return the text for the question with the choices
   */
  public void display(){
    super.display();
    for(int i = 0; i < choices.size(); i++){
      int choiceNumber = i + 1;
      System.out.println(choiceNumber + ": " + choices.get(i));
    }
  }
  
}