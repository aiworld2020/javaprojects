
/**
 * A tracker of Employee names and their salary. Can also raise their salary by percentage.
 * @author A. Agrawal
 * @version 1.0
 */
public class Employee
{
    private String name;
    private double salary;
    
    /**
     * Constructs an Employee with their name and salary
     * @param employeeName name of employee
     * @param currentSalary salary of employee
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    
    /**
     * Returns the name of employee
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the salary of the employee
     */
    public double getSalary()
    {
        return salary;
    }
    
     /**
     * Raises the salary of an Employee
     * @param byPercent the percentage of how much the salary is raised by
     */
    public void raiseSalary(double byPercent)
    {
        salary = salary + (salary * byPercent / 100);
    }
}