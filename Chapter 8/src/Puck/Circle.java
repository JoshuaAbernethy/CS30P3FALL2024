package Puck;

public class Circle 
{
	private double radius;
	private static double PI= 3.14;
	
	public Circle() 
	{
		radius = 1;			//default radius
	}
	
	public Circle(double r) 
	{
		radius = r;
	}//
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius) 
	{
	 	radius = newRadius;
	}
	
	
	public static void displayAreaFormula() 
	{
	 	System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	
	public double area() 
	{
	 	double circleArea;
	 	
	 	circleArea = PI * radius * radius;
	 	return(circleArea);
	}
	
	public boolean equals(Object obj) 
	{
		Circle testObj = (Circle)obj;
		
	 	if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public String toString() 
	{
		String circleString;

		circleString = "Circle has radius " + radius;
	 	return(circleString);
	}


}