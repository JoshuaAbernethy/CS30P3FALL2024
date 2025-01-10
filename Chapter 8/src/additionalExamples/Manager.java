package additionalExamples;

public class Manager extends Employee 
{
	private double yearlySalary;
	
	//Constructor method
	public Manager(String fN, String lN, double s) 
	{
		super(fN, lN);
		yearlySalary = s;
	}//
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	//Return the manager pay for a specified period
	public double pay(double weeks)
	{
		double payEarned;
		
		payEarned = yearlySalary / 52 * weeks; 
		
		return payEarned;
	}
	
	//Return the employee name, title, and salary
	
	public String toString()
	{
		return(super.toString() + ", Manager" + "Salary:" + yearlySalary);
	}
}