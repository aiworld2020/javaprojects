import java.lang.Math;
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    public Cylinder(){
    }
    public double cylinderVolume(double r, double h)
    {
        return Math.PI * Math.pow(r, 2) * h;
    }
    public double cylinderSurface(double r, double h)
    {
        return 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2);
    }
}
