import java.awt.Rectangle;
public class RectangleAreaTester
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(0, 0, 10, 20);
        double width = rect.getWidth();
        double height = rect.getHeight();
        System.out.println("Original Width, Orginal Height = " + width + ", " + height);
        System.out.println("Expected = 10.0, 20.0");
        double area = width * height;
        System.out.println("Area = " + area);
        System.out.println("Expected = 200.0");
        
        width = width * 2;
        System.out.println("\n\n\nDouble Width, Orginal Height = " + width + ", " + height);
        System.out.println("Expected = 20.0, 20.0");
        area = width * height;
        System.out.println("Area = " + area);
        System.out.println("Expected = 400.0");
        
        width = width / 2;
        height = height * 2;
        System.out.println("\n\n\nOriginal Width, Double Height = " + width + ", " + height);
        System.out.println("Expected = 10.0, 40.0");
        area = width * height;
        System.out.println("Area = " + area);
        System.out.println("Expected = 400.0");
        
        width = width * 2;
        System.out.println("\n\n\nDouble Width, Double Height = " + width + ", " + height);
        System.out.println("Expected = 20.0, 40.0");
        area = width * height;
        System.out.println("Area = " + area);
        System.out.println("Expected = 800.0");
    }
}
