package UEmployee;

public class Faculty extends UEmployee {
	
	public Staff S; // This is possibly the way to extend staff in this class. Then when you extend facualty in the Output, you can get both Staff and faculty

	private String departTitle;
	
	public Faculty (String fn, String ln, double s, String d)
	{
		super(fn, ln, s);
		departTitle = d;
	}
	public String getdepartTitle()
	{
		return departTitle;
	}
	public void setdepartTitle(String d)
	{
		departTitle = d;
	}
	
	public String toString()
	{
		return(super.getFirstName()
				+ super.getLastName()
				+ super.getSalary()
				+ departTitle);
	}
	
}
