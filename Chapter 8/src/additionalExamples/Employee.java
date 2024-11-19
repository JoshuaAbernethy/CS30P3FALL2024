package additionalExamples;

public abstract class Employee {

		private String firstName, lastName;
		
		public Employee(String fN, String lN ) 
		{
			firstName = fn;
			lastNmae = lN;
		}
		
		public String toString()
		{
			return( firstname + "" + lastName);
		}
		
		abstract double pay(double period);

	}


