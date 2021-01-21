
public class GradeBook{
    private String name;
    private int ptsEarned;
    private int ptsPossible;
    public GradeBook(String studentName)
    {
        name = studentName;
    }
    public String getName()
    {
        return name;
    }
    public void addScore(int score, int maxScore)
    {
        ptsEarned = ptsEarned + score;ptsPossible = ptsPossible + maxScore;
    }
    public double getCourseNumGrade()
    {
        return ptsEarned / ptsPossible * 100;
    }
    public String getCourseLetterGrade()
    {
        String letterGrade;
        if (ptsEarned / ptsPossible * 100 >= 90 && ptsEarned / ptsPossible * 100 <= 100 )
        {
            letterGrade = "A";
        }
        else if (ptsEarned / ptsPossible * 100 >= 80 && ptsEarned / ptsPossible * 100 < 90 )
        {
            letterGrade = "B";
        }
        else if (ptsEarned / ptsPossible * 100 >= 70 && ptsEarned / ptsPossible * 100 < 80 )
        {
            letterGrade = "PASS";
        }
        else
        {
            letterGrade = "NO PASS";
        }
        return letterGrade;
    }
}