package UEmployee;

public class Staff extends UEmployee
{
	private String title;
	
	public Staff(String fn, String ln, double s, String t)
	{
		super(fn, ln, s);
		title = t;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String toString()
	{
		return(super.getFirstName()
				+ super.getLastName()
				+ super.getSalary()
				+ title);
	}
	
}//