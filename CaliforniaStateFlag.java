import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.Font;

/*
   A component that draws the California State Flag
*/
public class CaliforniaStateFlag extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      // Prepare some colors from scratch (max=255): RGB, or RGB & alpha value
      Color colorBear = new Color(128, 66, 0); // Brown color for Bear
      Color colorBearDetail = new Color(77, 38, 0); // Dark Brownish Color For Bear Fur
      Color colorBlankOut = new Color(255, 255, 255, 150); // to blank out
      Color colorBackground = new Color(179, 0, 0); // Mahagony Color for Background
      Color colorModifiedStar = new Color(153, 0, 0); // Darker Red Color for Star
      Color colorGrass = new Color(0, 153, 0); // Green Color for grass
      
      // Construct a Border
      //Rectangle border = new Rectangle(0, 0, 361, 301);
      //g2.setColor(Color.BLACK);
      //g2.draw(border);
      
      //Construct Background of Flag
      Rectangle backgroundRect1 = new Rectangle(0, 0, 240, 180);
      Rectangle backgroundRect2 = new Rectangle(0, 240, 240, 60);
      g2.setColor(colorBlankOut);
      g2.draw(backgroundRect1);
      g2.fill(backgroundRect1);
      g2.setColor(colorBackground);
      g2.draw(backgroundRect2);
      g2.fill(backgroundRect2);
      
      //Add Some Text
      g2.setFont(new Font("Arial Narrow", Font.BOLD, 30));
      g2.setColor(Color.DARK_GRAY);
      g2.drawString("CALIFORNIA REPUBLIC", 30, 220);
      
      //Construct A Modified Star
      int[] xCoords = {12, 25, 38};
      int[] yCoords = {30, 5, 30};
      Polygon triangle1 = new Polygon(xCoords, yCoords, 3);
      g2.setColor(colorModifiedStar);
      g2.draw(triangle1);
      g2.fill(triangle1);
      int[] newYCoords = {13, 40, 13};
      Polygon triangle2 = new Polygon(xCoords, newYCoords, 3);
      g2.draw(triangle2);
      g2.fill(triangle2);
      
      //Construct A Field of Grass
      Ellipse2D.Double grass = new Ellipse2D.Double(30, 170, 300, 17);
      g2.setColor(colorGrass);
      g2.draw(grass);
      g2.fill(grass);
      Ellipse2D.Double grassBorder = new Ellipse2D.Double(30, 170, 301, 18);
      g2.setColor(colorBear); //Adding Border to grass
      g2.draw(grassBorder);
      
      //Construct a Bear
      int[] xCoordsBear = {80, 100, 140, 120};
      int[] yCoordsBear = {160, 175, 130, 130};
      Polygon hindLegs = new Polygon(xCoordsBear, yCoordsBear, 4);
      g2.setColor(colorBear);
      g2.draw(hindLegs);
      g2.fill(hindLegs);
      hindLegs.translate(120, 0);
      g2.draw(hindLegs);
      g2.fill(hindLegs);
      Rectangle frontLegs = new Rectangle(120, 130, 20, 45);
      g2.draw(frontLegs);
      g2.fill(frontLegs);
      frontLegs.grow(0, -5);
      frontLegs.translate(118, 5);
      g2.draw(frontLegs);
      g2.fill(frontLegs);
      Ellipse2D.Double bearBody = new Ellipse2D.Double(110, 82, 160, 75);
      g2.draw(bearBody);
      g2.fill(bearBody);
      Ellipse2D.Double bearBump = new Ellipse2D.Double(115, 86, 30, 30);
      g2.draw(bearBump);
      g2.fill(bearBump);
      Ellipse2D.Double bearHead = new Ellipse2D.Double(75, 85, 52, 45);
      g2.draw(bearHead);
      g2.fill(bearHead);
      int[] xCoordsNose = {70, 78, 78};
      int[] yCoordsNose = {110, 105, 115};
      Polygon bearNose = new Polygon(xCoordsNose, yCoordsNose, 3);
      g2.draw(bearNose);
      g2.setColor(Color.BLACK);
      g2.fill(bearNose);
      
      //Add some Detail using lines
      Line2D.Double detailGrass = new Line2D.Double(151, 180, 150, 183);
      g2.setColor(Color.BLACK);
      g2.setStroke(new BasicStroke(1));
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(152, 180, 153, 184);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(155, 181, 154, 183);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(156, 179, 157, 184);
      g2.draw(detailGrass);
      //Add second patch
      detailGrass = new Line2D.Double(182, 180, 183, 184);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(185, 181, 184, 183);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(186, 179, 187, 184);
      g2.draw(detailGrass);
      
      //Add third patch
      detailGrass = new Line2D.Double(252, 180, 254, 184);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(255, 181, 256, 183);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(256, 179, 257, 184);
      g2.draw(detailGrass);
      
      //Add first patch
      detailGrass = new Line2D.Double(92, 180, 94, 184);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(95, 181, 96, 183);
      g2.draw(detailGrass);
      detailGrass = new Line2D.Double(96, 179, 98, 184);
      g2.draw(detailGrass);
   }  
}
