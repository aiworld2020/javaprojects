import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
   This component draws a report.
*/
public class ReportComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      Color colorLogo = new Color(0, 153, 0);
      
      
      // Show image at top-right area
      BufferedImage img = null;
      
      try {

          img = ImageIO.read(new File("ReportComponent.png")); // specify file name of the image here
        } 
        catch (IOException e) { 
        }

        int x = 240, y = 0;
        if (img != null && g2.drawImage(img, x, y, null));

      
      
      //ATDP logo
      //Starting A
      int width = 8;
      int height = 70;
      int width2 = 26;
      Rectangle rectA = new Rectangle(15, 70, width, height);
      g2.setColor(colorLogo);
      g2.draw(rectA);
      g2.fill(rectA);
      rectA.translate(width2, 0);
      g2.draw(rectA);
      g2.fill(rectA);
      Rectangle rectB = new Rectangle(15 + width, 70, width2, width);
      g2.draw(rectB);
      g2.fill(rectB);
      rectB.translate(0, width2);
      g2.draw(rectB);
      g2.fill(rectB);
      //A done, starting T
      rectA.translate(3 * width, 0);
      g2.draw(rectA);
      g2.fill(rectA);
      rectB.translate(width2 + width, -width2);
      g2.draw(rectB);
      g2.fill(rectB);
      //T done, starting D
      Arc2D.Double arc = new Arc2D.Double(rectA.getX()-5, rectA.getY(), height, height ,270, 180, Arc2D.PIE);
      g2.draw(arc);
      g2.fill(arc);
      //D done, starting P
      rectA.translate(10 * width, 0);
      g2.draw(rectA);
      g2.fill(rectA);
      Ellipse2D.Double largerCircle = new Ellipse2D.Double(rectA.getX(), rectA.getY(), height / 2 + 5, height / 2 + 5);
      g2.draw(largerCircle);
      g2.fill(largerCircle);
      Ellipse2D.Double smallerCircle = new Ellipse2D.Double(rectA.getX() + 10, rectA.getY() + 10, height / 3, height / 3);
      g2.setColor(Color.WHITE);
      g2.draw(smallerCircle);
      g2.fill(smallerCircle);
      
      //Rest of text
      g2.setColor(Color.BLACK);
      g2.drawString("Course: SDR0135.2 - Programming in Java", 15, 250);
      g2.drawString("Grade report, 7/10/2020", 15, 300);
      g2.drawString("Student: Aryan Agrawal", 15, 320);
      double gradeNumber = 96.4;
      String gradeLetter = "";
      if (gradeNumber >= 94.0)
      {
          gradeLetter = "A";
      }
      else if (gradeNumber >= 90.0 && gradeNumber < 94.0)
      {
          gradeLetter = "A-";
      }
      else if (gradeNumber >= 87.0 && gradeNumber < 90.0)
      {
          gradeLetter = "B+";
      }
      else if (gradeNumber >= 84.0 && gradeNumber < 87.0)
      {
          gradeLetter = "B";
      }
      else if (gradeNumber >= 80.0 && gradeNumber < 84.0)
      {
          gradeLetter = "B-";
      }
      else if (gradeNumber >= 70.0 && gradeNumber < 80.0)
      {
          gradeLetter = "PASS";
      }
      else
      {
          gradeLetter = "NO PASS";
      }
      g2.drawString("Grade: " + gradeLetter, 15, 340);
      Rectangle parentSign = new Rectangle(15, 370, 300, 50);
      g2.draw(parentSign);
      Rectangle date = new Rectangle(315, 370, 150, 50);
      g2.draw(date);
      g2.drawString("Signature by parent/guardian:", 20, 400);
      g2.drawString("Date:", 320, 400);
      g2.drawString("Comments by teacher:", 15, 440);
      g2.drawString("Aryan has done very well in this class, in all aspects, thanks to his", 10, 480);
      g2.drawString("thoroughness, interest, and commitment. The story about a bug in a", 10, 500);
      g2.drawString("satellite launch demonstrated that he read and connected with the lessons", 10, 520);
      g2.drawString("learned in class. He has also been very active in Sharing discussions,", 10, 540); 
      g2.drawString("asking questions and providing answers, and probably making friends.", 10, 560);
    }
}
