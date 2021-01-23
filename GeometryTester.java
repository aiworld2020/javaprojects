import java.util.Scanner;
/**
 * Write a description of class PracticeExercisesTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GeometryTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter h: ");
        int h = in.nextInt();
        System.out.println("Enter r: ");
        int r = in.nextInt();
        Cube c = new Cube();
        Sphere s = new Sphere();
        Cylinder cy = new Cylinder();
        Cone co = new Cone();
        System.out.println(c.cubeVolume(h));
        System.out.println(c.cubeSurface(h));
        System.out.println(s.sphereVolume(r));
        System.out.println(s.sphereSurface(r));
        System.out.println(cy.cylinderVolume(r, h));
        System.out.println(cy.cylinderSurface(r, h));
        System.out.println(co.coneVolume(r, h));
        System.out.println(co.coneSurface(r, h));
    }
}
