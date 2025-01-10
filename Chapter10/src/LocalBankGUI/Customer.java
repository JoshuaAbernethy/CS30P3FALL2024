package LocalBankGUI;

public class Customer 
{
	public static String firstName, lastName;
		
	
	public Customer(String fName, String lName) 
	{
		firstName = fName;//
		lastName = lName;
	}

	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */

	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	
	public String toString() 
	{
		String custString;

		custString = " " + firstName + " " + lastName + " ";	//changed for Chap 11 Exer 1
	 	return(custString);
	}

	
	
}