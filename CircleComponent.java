import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.lang.Math;
/**
 * Write a description of class CircleCompnent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      double radius = Math.random() * 30;
      double x =  Math.random() * 50;
      double y =  Math.random() * 50;
      Circle c1 = new Circle(x, y, radius);
      c1.draw(g2);
      radius = Math.random() * 35;
      x =  Math.random() * 100;
      y =  Math.random() * 100;
      Circle c2 = new Circle(x, y, radius);
      c2.draw(g2);
      radius = Math.random() * 50;
      x =  Math.random() * 150;
      y =  Math.random() * 150;
      Circle c3 = new Circle(x, y, radius);
      c3.draw(g2);
      radius = Math.random() * 5;
      x =  Math.random() * 200;
      y =  Math.random() * 200;
      Circle c4 = new Circle(x, y, radius);
      c4.draw(g2);
      radius = Math.random() * 60;
      x =  Math.random() * 300;
      y =  Math.random() * 250;
      Circle c5 = new Circle(x, y, radius);
      c5.draw(g2);
   }
}
