import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Ellipse2D.Double
{
    int thickness;
    public Circle (double cx, double cy, double radius)
    {
        x = cx;
        y = cy;
        width = radius * 2;
        height = radius * 2;
    }
    public double getRadius()
    {
        return width;
    }
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, height);
        g2.draw(circle);
    }
    public void traslate(double dx, double dy)
    {
        x += dx;
        y += dy;
    }
}
