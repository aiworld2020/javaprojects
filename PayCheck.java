/**
 * A class that calculates the weekly pay of an employee
 * Can modify the hours worked and hourly wage
 * @author A. Agrawal
 * @version 1.0
 */
public class PayCheck
{
    String employeeName;
    double hourlyWage;
    double hoursWorked;
    double pay;
    
    /**
     * Get name and hourly wage of employee
     * @param name The name of the employee
     * @param wage The hourly wage of the employee
     */
    public PayCheck(String name, double wage)
    {
        employeeName = name;
        hourlyWage = wage;
    }
    
    /**
     * Adds number of hours worked for employee
     * @param addedHours The added number of hours
     */
    public void addHours(double addedHours)
    {
        hoursWorked += addedHours;
    }
    
    public void raisePay(double dollarAmount)
    {
        hourlyWage += dollarAmount;
    }
    
    public double calcWeekPay()
    {
      if (hoursWorked <= 40.0)
      {
          pay = hourlyWage * hoursWorked;
      }
      else
      {
          hoursWorked -= 40;
          pay = (40 * hourlyWage) + (hoursWorked * 1.5 * hourlyWage);
      }
      hoursWorked = 0;
      return pay;
    }
    
    public String toString()
    {
      return employeeName + " worked for " + hoursWorked + " hours at " + hourlyWage + " per hour";   
    }
}
