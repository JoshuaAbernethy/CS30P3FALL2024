package LocalBankGUI;
import java.text.NumberFormat;
import java.util.ArrayList;

import LocalBankGUI.LocalBank.TextFieldSetup;

public class Account //
{
	public static class NewAccount 
	{
		int AccountId = 0;
		double Balance = 0;
		String FirstName = "";
		String LastName = "";
		
		NewAccount(int AccountId, double Balance, String FirstName, String LastName) 
		{
			this.AccountId = AccountId;
			this.Balance = Balance;
			this.FirstName = FirstName;
			this.LastName = LastName;
		}
	}
	
	private static ArrayList<NewAccount> Accounts = new ArrayList<NewAccount>(); // Create an ArrayList object
	
	public static void setUpAccount(int AccountId, double Balance, String FirstName, String LastName) 
	{
		NewAccount AccountSetup = new NewAccount(AccountId, Balance, LastName, LastName);
		Accounts.add(AccountSetup);
		
		LocalBank.UpdateDispAcctInfo();
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
		
		System.err.println("No account found");
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
}