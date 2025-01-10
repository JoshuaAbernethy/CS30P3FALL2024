package Accountss;

public class PersonalAcct extends Account{
	
	public PersonalAcct(double bal, String fName, String lName) {
		super(bal, fName, lName);x
		// TODO Auto-generated constructor stub
	}

	//
	double minBalance = 99;
	double fee = 2;
	double currentUserBal = minBalance;

	
	public void withdrawl(double amt)
	{
		if (minBalance < 100)
		{
			System.out.println("Your account balance is " + minBalance + ", you will be charged a $2 fee");
			currentUserBal = currentUserBal - fee;
			System.out.println("You total balance is currentUserBal");		
		}
	}
	
	
	public void dispPersonalAcctInfo()
	{
		Accountss.Account PersAccount = new Accountss.Account(99, "John", "Phillips");
		
		PersAccount.deposit(currentUserBal);
	}
	
	
	//public static void main(String[] args) {
     //   PersonalAcct user = new PersonalAcct(1,2);
     //   user.dispPersonalAcctInfo();
   // }


}
