package LocalBankGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import LocalBankGUI.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LocalBank {
	
	/*
	 * 1. When Complete Trans is pressed
	 * Output the transaction
	 * 
	 * Check for what type it is
	 * pass it in a function
	 * 
	 * Create functions for changing account amount.
	 */

	private JFrame frame;
	private static JTextField AcctNum;
	private JTextField EntAm;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtBalance;
	private static JLabel DispAcctInfo = new JLabel("Balance: ?");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		AcctNum = new JTextField();
		AcctNum.setText("Account Number: ");
		setUpTextField(AcctNum);
		
		AcctNum.setForeground(Color.BLACK);
		AcctNum.setBounds(67, 62, 367, 20);
		AcctNum.setColumns(10);
		panel.add(AcctNum);
	
		EntAm = new JTextField();
		EntAm.setText("Enter Amount: ");
		setUpTextField(EntAm);
		EntAm.setBounds(67, 93, 367, 20);
		panel.add(EntAm);
		EntAm.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name: ");
		setUpTextField(txtFirstName);
		txtFirstName.setBounds(67, 124, 367, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);

		txtLastName = new JTextField();
		txtLastName.setText("Last Name: ");
		setUpTextField(txtLastName);
		txtLastName.setColumns(10);
		txtLastName.setBounds(67, 155, 367, 20);
		panel.add(txtLastName);

		txtBalance = new JTextField();
		txtBalance.setText("Biggining Balance: ");
		setUpTextField(txtBalance);
		txtBalance.setColumns(10);
		txtBalance.setBounds(67, 186, 367, 20);
		panel.add(txtBalance);
		
		DispAcctInfo.setBounds(67, 222, 367, 14);
		panel.add(DispAcctInfo);
		
		//declares combo box. The rest of its properties are below.
		@SuppressWarnings("rawtypes")
		JComboBox bankActivities = new JComboBox();
		bankActivities.setAutoscrolls(true);
		bankActivities.addItem("Select");
		bankActivities.addItem("Deposit");
        bankActivities.addItem("Withdraw");
        bankActivities.addItem("CheckBalances");
        bankActivities.addItem("AddAcount");
        bankActivities.addItem("RemoveAccount");

		JButton ActionButton = new JButton("Complete Transaction");
		
		ActionButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{
				//double BankTotal = 0;
				String removedAcctNum = AcctNum.getText().substring(getTextFieldText(AcctNum).length(), AcctNum.getText().length());
				String removedEntAm = EntAm.getText().substring(getTextFieldText(EntAm).length(), EntAm.getText().length());
				String removedtxtFirstName = txtFirstName.getText().substring(getTextFieldText(txtFirstName).length(), txtFirstName.getText().length());
				String removedtxtLastName = txtLastName.getText().substring(getTextFieldText(txtLastName).length(), txtLastName.getText().length());
	
				//Continue this series of if else statements for everything in your combo box (have to make an array first by making bank file in other window.
				
				if (bankActivities.getSelectedItem().equals("AddAcount")) 
				{
					//System.out.println("Test | AddAcount");
					//For the line below, you missed out on some class coding. Ask where to code the fName and lName variables

					Account.setUpAccount(Integer.parseInt(removedAcctNum), Double.parseDouble(removedEntAm), removedtxtFirstName, removedtxtLastName);
					
					System.out.println("New Account Name: " + Account.getAccount(Integer.parseInt(removedAcctNum)).FirstName + " " + Account.getAccount(Integer.parseInt(removedAcctNum)).LastName);
					return;
				}
				else if (bankActivities.getSelectedItem().equals("RemoveAccount")) 
				{
					//This method has been complete
					Account.NewAccount HasAccount = Account.getAccount(Integer.parseInt(removedAcctNum));
					
					if (HasAccount == null) 
					{
						System.err.println("No account with the id: [" + removedAcctNum + "]");
						return;
					}
					
					Account.removeAccount(Integer.parseInt(removedAcctNum));
					return;
				}
				
				Bank.ChangeBalance(Integer.parseInt(removedAcctNum), bankActivities, Double.parseDouble(removedEntAm));
			}
		});
		ActionButton.setBounds(181, 247, 146, 23);
		panel.add(ActionButton);
		
		bankActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				AcctNum.setForeground(Color.BLACK);
				EntAm.setForeground(Color.BLACK);
//				txtFirstName.setForeground(Color.BLACK);
				
				if (bankActivities.getSelectedItem().equals("Deposit")) 
				{
						AcctNum.setForeground(Color.red);
						EntAm.setForeground(Color.red);
				}
				else if (bankActivities.getSelectedItem().equals("Withdraw")) 
				{
						AcctNum.setForeground(Color.red);
						EntAm.setForeground(Color.red);

				}
				else if  (bankActivities.getSelectedItem().equals("CheckBalances"))
				{
						AcctNum.setForeground(Color.red);	
						txtFirstName.setForeground(Color.red);
				}
				else if  (bankActivities.getSelectedItem().equals("AddAcount"))
				{
						AcctNum.setForeground(Color.red);
						txtLastName.setForeground(Color.red);
						txtFirstName.setForeground(Color.red);
				}
				else if  (bankActivities.getSelectedItem().equals("RemoveAccount"))
				{
						AcctNum.setForeground(Color.red);
						EntAm.setForeground(Color.red);
						txtFirstName.setForeground(Color.red);
				}
				
				if (!bankActivities.getSelectedItem().equals("Select")) 
				{
					bankActivities.removeItem("Select");
				}
			}
			
			
		});
		bankActivities.setToolTipText("");
		bankActivities.setBounds(67, 29, 367, 22);
		panel.add(bankActivities);
		
		//double BankTotal = 0;
		
		//if(ActionButton.equals("Complete Transaction") & bankActivities.getSelectedItem().equals("Deposite")) 
		//{
		//	String addMoney = EntAm.getText();
			
		//	 BankTotal = (Double.parseDouble(addMoney));
		//	 DispAcctInfo.setText(Double.toString(BankTotal));
	//	}
	//	else if (ActionButton.equals("Complete Transaction") & bankActivities.getSelectedItem().equals("withdrawl")) 
	//	{
	//		String takeMoney = EntAm.getText();
			
	//		BankTotal = (Double.parseDouble(takeMoney));
	//		DispAcctInfo.setText(Double.toString(BankTotal));
	//	}
		
		
		//public String toString() {
		//String accountString;
		//NumberFormat money = NumberFormat.getCurrencyInstance();
		
		//accountString == acctNum + " ";
		//accountString += cust.toString();
		//accountString += "Current baslance is" + money.format(balance)
		//return(accountString);
	}
	
	public static void UpdateDispAcctInfo() 
	{
		String removedAcctNum = AcctNum.getText().substring(getTextFieldText(AcctNum).length(), AcctNum.getText().length());
		double Balance = Account.getAccount(Integer.parseInt(removedAcctNum)).Balance;
		String StrBalance = "" + Balance;
		DispAcctInfo.setText("Balance: " + StrBalance.format(StrBalance));
	}
	
	static class TextFieldSetup 
	{
		JTextField SelectedField;
		String OrginalText;
		
		TextFieldSetup(JTextField SelectedField) 
		{
			this.SelectedField = SelectedField;
			
			OrginalText = this.SelectedField.getText();
		}
	}
	
	private static ArrayList<TextFieldSetup> AllTextFields = new ArrayList<TextFieldSetup>(); // Create an ArrayList object
	
	public static void setUpTextField(JTextField TextField) 
	{
		TextFieldSetup NewTextField = new TextFieldSetup(TextField);
		AllTextFields.add(NewTextField);
	}
	
	public static String getTextFieldText(JTextField TextField) 
	{
		for (int i = 0; i <= AllTextFields.size(); i++) 
		{
			if (AllTextFields.get(i).SelectedField == TextField) 
			{
				return AllTextFields.get(i).OrginalText;
			}
		}
		
		return null;
	}
}
