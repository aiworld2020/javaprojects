
public class OneTime extends Appointment
{
	// Instance Variables
	int year;
	int month;
	int day;
	// Constructors
	/**
	 * Constructs a one time appointment with a description and a date
	 * @param description the description of the appointment
	 * @param year the year
	 * @param month the month
	 * @param day the day
	 */
	public OneTime(String description, int year, int month, int day)
	{
		super(description, year, month, day);
		this.year = year;
		this.day = day;
		this.month = month;
	}
	
	public boolean occursOn(int year, int month, int day)
	{
	    boolean result = false;
	    if (this.year == year && this.month == month && this.day == day)
	    {
	        result = true;
	    }
	    return result;
	}
}