import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws 2 bears and 2 stars.
 *
 * @author Aryan Agrawal 
 * @version 1.0
 */
public class BearComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics 2D
      Graphics2D g2 = (Graphics2D) g;
        
        //Draw a Bear at top left corner
      int bearLen = 60; //Length of bear
      Bear bear1 = new Bear(0, 0, bearLen);
      bear1.draw(g2);
      
      
      // Coordinates of bottom-right corner
      int right = getWidth(); // the width of the view
      int bot = getHeight();  // the height of the view
      
      Random randGen = new Random();
     
      System.out.println(right);
      System.out.println(bot);
      bearLen = 120;               
      int x = getWidth() - bearLen - randGen.nextInt(30);    
      int y = getHeight() - bearLen/2 - randGen.nextInt(30); 
      Bear bear2 = new Bear(x, y, bearLen);
      bear2.draw(g2);
      
      Star star1 = new Star(randGen.nextInt(30), randGen.nextInt(120), 15, 15); // at random location
      Star star2 = new Star(190, 100, 12, 12);
      Star star3 = new Star(220, 200, 10, 10);
      Star star4 = new Star(70, 240, 8, 8);
      
      star1.draw(g2);
      star2.draw(g2);
      star3.draw(g2);
      star4.draw(g2);
      


    }
}
