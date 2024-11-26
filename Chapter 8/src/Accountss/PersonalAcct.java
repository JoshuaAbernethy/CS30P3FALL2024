package Accountss;

import Vehicle.Car;

public class PersonalAcct extends Account{
	
	public PersonalAcct(double bal, String fName, String lName) {
		super(bal, fName, lName);
		// TODO Auto-generated constructor stub
	}

	//double minBalance = 100.0;
	//double fee = 2.00;
	
	double minBalance = mb;
	double fee = f;

	
	public void withdrawl(double amt)
	{
		if (minBalance < 100)
		{
			System.out.println("Your account balance is " + minBalance + ", you will be charged a $2 fee");
		}
	}
	
	
	public void dispPersonalAcctInfo()
	{
		
	}
	
	
	public static void main(String[] args) {
        PersonalAcct user = new PersonalAcct(1,2);
        user.dispPersonalAcctInfo();
    }


}
