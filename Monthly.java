
public class Monthly extends Appointment
{
	// Instance Variables
	int date;
	// Constructors
	
	public Monthly(String description, int year, int month, int day)
	{
		super(description, year, month, day);
		date = day;
	}
	
	// Methods
	
	public boolean occursOn(int year, int month, int day)
	{
            boolean result;
	    if (date == day)
		{
		    result = true;
		}
            else
            {
                result = false;
            }
            return result;
	}
}