package Puck;

public class Puck extends Disk
{
	public double MIN_STD_WEIGHT = 5;
	public double MAX_STD_WEIGHT = 5.5;
	public double MIN_YTH_WEIGHT = 4;
	public double MAX_YTH_WEIGHT = 4.5;
	private double weight;
	private boolean standard, youth;
	
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
		if(weight >= MIN_STD_WEIGHT && weight <= MAX_STD_WEIGHT)
		{
			standard = true;
			youth = false;
		}
		else//
		{
			standard = false;
			youth = true;
		}
	}
	
	public double getWeight() 
	{
	 	return(weight);
	}
	
	public String getDivision()
	{
		String div;
		
		if(standard)
		{
			div = "Puck is standard";
		}
		else
		{
			div = "Puck is youth";
		}
		return div;
	}
	
	public  boolean equals(Object obj)
	{
		Puck testObj = (Puck)obj;
		
		if(testObj.getDivision() == getDivision())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public int compareTo(Object p)
	{
		Puck testPuck = (Puck)p;
		
		if(weight < testPuck.getWeight())
		{
			return -1;
		}
		else if(weight == testPuck.getWeight())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

}
