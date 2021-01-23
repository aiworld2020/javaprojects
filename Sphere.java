import java.lang.Math;
/**
 * Write a description of class Sphere here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sphere
{
    public Sphere(){
    }
    public double sphereVolume(double r)
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
    }
    public double sphereSurface(double r)
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
