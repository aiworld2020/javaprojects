import javax.swing.JFrame;

public class BearViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 450);
      frame.setTitle("Two bears");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      BearComponent component = new BearComponent();
      frame.add(component);

      frame.setVisible(true);
  
   }
}