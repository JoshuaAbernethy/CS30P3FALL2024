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
		
		if (CurrentAccount == null) 
		{
			System.err.println("[Change Balance]: No account found.");
			return;
		}
		
		if (Selection.getSelectedItem().equals("Deposit")) 
		{
			addToBalance(CurrentAccount, Amount);
		}
		else if (Selection.getSelectedItem().equals("Withdraw")) 
		{
			subToBalance(CurrentAccount, Amount);
		}
		else if (Selection.getSelectedItem().equals("CheckBalances")) 
		{
			
		}
	}
	
	private static void addToBalance(Account.NewAccount CurrentAccount, double Amount) 
	{
		CurrentAccount.Balance += Amount;
		//System.err.println("Balance: " + money.format(CurrentAccount.Balance));
		LocalBank.UpdateDispAcctInfo();
	}
	
	private static void subToBalance(Account.NewAccount CurrentAccount, double Amount) 
	{
		CurrentAccount.Balance -= Amount;
		//System.err.println("Balance: " + money.format(CurrentAccount.Balance));
		LocalBank.UpdateDispAcctInfo();
	}
	
	public static double getBalance(int AccountNumber) 
	{
		return Account.getAccount(AccountNumber).Balance;
	}
}