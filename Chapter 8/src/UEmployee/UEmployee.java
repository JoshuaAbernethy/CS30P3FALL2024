package UEmployee;

public abstract class UEmployee 
{
	private String firstName, lastName;
	protected double salary;
	
	public UEmployee(String fn, String ln, double s)
	{
		firstName = fn;
		lastName = ln;
		salary = s;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	public void setLastName(String ln)
	{
		lastName = ln;
	}//
	public void setSalary(double s)
	{
		salary = s;
	}
	
	public String toString()
	{
		return("First Name: "+ firstName 
				+" Last Name: " + lastName
				+ " Salary: " + salary );
	}
	
	
	

}