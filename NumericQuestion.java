
/**
 * Write a description of class NumericQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    int answer = 3;
    public boolean checkAnswer(int response)
    {
        boolean result;
        if (response <= answer + 0.01 || response >= answer - 0.01)
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
