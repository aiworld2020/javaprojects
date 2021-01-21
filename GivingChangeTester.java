
/**
 * Write a description of class GivingChangeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GivingChangeTester
{
    public static void main(String args[])
    {
        GivingChange test = new GivingChange();
        System.out.println(test.giveChange(1000, 899));
        System.out.println("...expected 1 dollar and 1 penny");
    }
}
