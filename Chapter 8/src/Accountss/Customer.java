package Accountss;
public class Customer {
	private String firstName, lastName;


	public Customer(String fName, String lName) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
	}
	
	public String toString() {
		String custString;
		custString = firstName + " " + lastName + "\n";
	 	return(custString);
	}

}
