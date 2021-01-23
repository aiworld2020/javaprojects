import java.lang.Math;
/**
 * Write a description of class PracticeExercises here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cone
{
    public Cone()
    {
    }
    public static double coneVolume(double r, double h)
    {
        return Math.PI * Math.pow(r, 2) * h / 3;
    }
    public static double coneSurface(double r, double h)
    {
        return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
    }
}
