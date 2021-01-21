import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.lang.Math; 
/**
 * This class is to draw a Bear at any size and point on the screen.
 * Can also be done with a star
 * @author Aryan Agrwal
 * @version 1.0
 */
public class Bear extends JComponent
{
     private int xLeft;
     private int yTop;
     private int legLength;
     private int legWidth; 
     private int bearLength;
     private int headLength; 
     /**
      Constructs a bear with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param approxLen the approximate length of the bear; the bear's height if half of the length
    */
   public Bear(int x, int y, int approxLen)
   {
      xLeft = x;
      yTop = y;
      legLength = approxLen / 5;
      legWidth = approxLen / 6; 
      bearLength = approxLen;
      headLength = approxLen / 4;
   }
   
   /**
      Draws the bear.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      //Bear Legs
      Rectangle frontLeg1 = new Rectangle(xLeft + bearLength / 2, yTop + bearLength / 3, legWidth, legLength);
      g2.draw(frontLeg1);
      Rectangle frontLeg2 = new Rectangle(bearLength + xLeft, yTop + bearLength / 3, legWidth, legLength);
      g2.draw(frontLeg2);
      
      //Bear Body
      Ellipse2D.Double bearBody = new Ellipse2D.Double(xLeft + headLength, yTop, bearLength, bearLength/3);
      g2.draw(bearBody);
      
      
      //Bear Head
      Ellipse2D.Double bearHead = new Ellipse2D.Double(xLeft, yTop, headLength, headLength);
      g2.draw(bearHead);
   }  
}