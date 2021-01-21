import java.awt.Rectangle;

/**
   Constructs a Rectangle object and then computes and prints its area.
*/
public class E01AreaTester
{  
   public static void main(String[] args)
   {  
      Rectangle box = new Rectangle(0, 0, 20, 30);
      System.out.println(box);  
      box.translate(20, 0);
      System.out.println(box);
      box.translate(0, 30);
      System.out.println(box);
      box.translate(-20,0);
      System.out.println(box);
   }
}
