
/**
 * Write a description of class EmployeeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTester
{
   public static void main(String[] args)
   {
       Employee harry = new Employee("Hacker, Harry", 50000);
       harry.raiseSalary(10);
       System.out.println("Name = " + harry.getName());
       System.out.println("Expected = Hacker, Harry");
       System.out.println("Salary = " + harry.getSalary());
       System.out.println("Expected = 55000.0");
       String name = "Aryan";
       System.out.println(name.substring(name.length() - 1, name.length() ));
   }
}    