package LocalBankGUI;
import java.text.NumberFormat;
import java.util.ArrayList;

import LocalBankGUI.LocalBank.TextFieldSetup;

public class Account 
{
	
	public static class NewAccount 
	{
		int AccountId = 0;
		double Balance = 0;
		String FirstName = "";
		String LastName = "";
		
		NewAccount(int AccountId2, double Balance2, String FirstName2, String LastName2) 
		{
			this.AccountId = AccountId2;
			this.Balance = Balance2;
			this.FirstName = FirstName2;
			this.LastName = LastName2;
		}
	}
	
	private static ArrayList<NewAccount> Accounts = new ArrayList<NewAccount>(); // Create an ArrayList object
	
	public static void setUpAccount(int AccountId, double Balance, String FirstName, String LastName) 
	{
		NewAccount AccountSetup = new NewAccount(AccountId, Balance, LastName, LastName);
		Accounts.add(AccountSetup);
	}
	
	public static NewAccount getAccount(int AccountId) 
	{
		for (int i = 0; i <= Accounts.size(); i++) 
		{
			if (AccountId == Accounts.get(i).AccountId) 
			{
				return Accounts.get(i);
			}
		}
		
		return null;
	}
	
	public static void removeAccount(int AccountId) 
	{
		for (int i = 0; i <= Accounts.size(); i++) 
		{
			if (AccountId == Accounts.get(i).AccountId) 
			{
				Accounts.remove(i);
			}
		}
	}
	
	public String toString() 
	{
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		//accountString = acctID + " ";	//changed for Chapter 11 Exer 1
		//accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}

}