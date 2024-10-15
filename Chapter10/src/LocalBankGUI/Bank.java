package LocalBankGUI;

import java.util.ArrayList;
import java.util.List; // This.
import javax.swing.JComboBox;
import java.lang.reflect.Array;
import LocalBankGUI.Account;

public class Bank 
{
	public static void ChangeBalance(int AccountNumber, JComboBox Selection, double Amount) 
	{
		Account.NewAccount CurrentAccount = Account.getAccount(AccountNumber);
		
		if (Selection.getSelectedItem().equals("Deposit")) 
		{
			addToBalance(CurrentAccount, Amount);
		}
	}
	
	private static void addToBalance(Account.NewAccount CurrentAccount, double Amount) 
	{
		CurrentAccount.Balance += Amount;
	}
	
	private static void subToBalance(Account.NewAccount CurrentAccount, double Amount) 
	{
		CurrentAccount.Balance -= Amount;
	}
	
	public static double getBalance(int AccountNumber) 
	{
		return Account.getAccount(AccountNumber).Balance;
	}
}