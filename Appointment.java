



public abstract class Appointment
{
	// Instance Variables
	private String description;
	
	
	// Constructors
	/**
	 * Constructs an Appointment without a description or a date
	 */
	public Appointment(String description, int year, int month, int day)
	{
		this.description = description;
		
	}
	
	// Methods
	/**
	 * Sets the description of this appointment
	 * @param appointmentDescription the description of the appointment
	 */
	public void setDescription(String appointmentDescription)
	{
		this.description = appointmentDescription;
	}

	
	
	public abstract boolean occursOn(int year, int month, int day);
	
	
	/**
	 * Returns the String representation of this class
	 */
	public String toString()
	{
		return getClass().getName() + "[description=" + description + "]";
	}
}
