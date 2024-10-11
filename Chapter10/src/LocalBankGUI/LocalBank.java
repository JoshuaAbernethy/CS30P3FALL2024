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

	private JFrame frame;
	private JTextField AcctNum;
	private JTextField EntAm;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtBalance;
	
	Bank easySave = new Bank();

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		AcctNum = new JTextField();
		
		AcctNum.setText("Account Number:");
		String AcctNumText = AcctNum.getText();
		
		AcctNum.setForeground(Color.BLACK);
		AcctNum.setBounds(67, 62, 367, 20);
		AcctNum.setColumns(10);
		panel.add(AcctNum);
		
		AcctNum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) 
			{
				if (AcctNum.getText().equals(AcctNumText)) 
				{
					AcctNum.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) 
			{
				if (AcctNum.getText().equals("")) 
				{
					AcctNum.setText(AcctNumText);
				}
			}
		});
		AcctNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				boolean Valid = false;
				for (int i = 0; i == 9; i++) 
				{
					if (e.getKeyChar() == i) 
					{
						Valid = true;
					}
				}
				
				if (Valid) 
				{
					System.out.println("Valid input");
				}
				else 
				{
					e.consume();
				}
			}
		});
		
		EntAm = new JTextField();
		EntAm.setText("Enter Amount:");
		EntAm.setBounds(67, 93, 367, 20);
		panel.add(EntAm);
		EntAm.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name:");
		txtFirstName.setBounds(67, 124, 367, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name:");
		txtLastName.setColumns(10);
		txtLastName.setBounds(67, 155, 367, 20);
		panel.add(txtLastName);
		
		txtBalance = new JTextField();
		txtBalance.setText("Biggining Balance:");
		txtBalance.setColumns(10);
		txtBalance.setBounds(67, 186, 367, 20);
		panel.add(txtBalance);
		
		JLabel DispAcctInfo = new JLabel("");
		DispAcctInfo.setBounds(43, 203, 367, 14);
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
		
		Account NewLocalCodeFile = new Account("Test String");
		
		NewLocalCodeFile.deposit(0);
		
		JButton ActionButton = new JButton("Complete Transaction");
		
		ActionButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{
				//double BankTotal = 0;
				String monAmount, message = null; 
	
				//Continue this series of if else statements for everything in your combo box (have to make an array first by making bank file in other window.
				if(bankActivities.getSelectedItem().equals("Deposit") ) 
				{
					System.out.println("Test | Deposite");
					monAmount = EntAm.getText().substring("Enter Amount:".length(), EntAm.getText().length());
					
					message = easySave.transaction(1, AcctNum.getText(), Double.parseDouble(monAmount));
				}
				else if(bankActivities.getSelectedItem().equals("Withdraw")) 
				{
					System.out.println("Test | Withdrawl");
					monAmount = EntAm.getText().substring(0, "Enter Amount:".length());
					message = easySave.transaction(2, AcctNum.getText(), Double.parseDouble(monAmount));
				}
				else if(bankActivities.getSelectedItem().equals("CheckBalances")) 
				{
					System.out.println("Test | CheckBalances");
					monAmount = EntAm.getText().substring(0, "Enter Amount:".length());
					message = easySave.transaction(3, AcctNum.getText(), Double.parseDouble(monAmount));
				}
				else if (bankActivities.getSelectedItem().equals("AddAcount")) 
				{
					System.out.println("Test | AddAcount");
					monAmount = txtBalance.getText();
					//For the line below, you missed out on some class coding. Ask where to code the fName and lName variables
					message = easySave.transaction(1, txtFirstName.getText() + txtLastName.getText(), Double.parseDouble(monAmount));
					DispAcctInfo.setText("New Account ID: " + message);
				}
				else if (bankActivities.getSelectedItem().equals("RemoveAccount")) 
				{
					//This method has been complete
				}
				
				else if (ActionButton.equals("Complete Transaction")) 
				{
					DispAcctInfo.setText(message);
				}
			}
		});
		ActionButton.setBounds(181, 247, 146, 23);
		panel.add(ActionButton);
		
		bankActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AcctNum.setForeground(Color.BLACK);
				EntAm.setForeground(Color.BLACK);
				txtFirstName.setForeground(Color.BLACK);
				
				if (bankActivities.getSelectedItem().equals("Deposit")) {
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
					EntAm.setForeground(Color.red);
				}
				else if  (bankActivities.getSelectedItem().equals("RemoveAccount"))
				{
					AcctNum.setForeground(Color.red);
					EntAm.setForeground(Color.red);
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
}
