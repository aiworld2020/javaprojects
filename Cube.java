import java.lang.Math;
/**
 * Write a description of class Cube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cube
{
    public Cube(){
    }
    public double cubeVolume(double h)
    {
        return Math.pow(h, 3);
    }
    public double cubeSurface(double h)
    {
        return 6 * Math.pow(h, 2);
    }
    
}
