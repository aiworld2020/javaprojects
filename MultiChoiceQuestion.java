
/**
 * Write a description of class MultiChoiceQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiChoiceQuestion extends ChoiceQuestion
{
    String answer1 = "2";
    String answer2 = "3";
    String answer3 = null;
    String answer4 = null;
    boolean result;
    public boolean checkAnswer(String response)
    {
        if (response.equals(answer1) || response.equals(answer2) || response.equals(answer3) || response.equals(answer4)) 
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}
