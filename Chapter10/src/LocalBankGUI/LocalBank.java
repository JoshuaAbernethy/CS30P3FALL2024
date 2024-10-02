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
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		AcctNum = new JTextField();
		AcctNum.setForeground(Color.BLACK);
		AcctNum.setText("Account Number:");
		AcctNum.setBounds(43, 44, 367, 20);
		panel.add(AcctNum);
		AcctNum.setColumns(10);
		
		EntAm = new JTextField();
		EntAm.setText("Enter Amount:");
		EntAm.setBounds(43, 75, 367, 20);
		panel.add(EntAm);
		EntAm.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name:");
		txtFirstName.setBounds(43, 106, 367, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name:");
		txtLastName.setColumns(10);
		txtLastName.setBounds(43, 137, 367, 20);
		panel.add(txtLastName);
		
		txtBalance = new JTextField();
		txtBalance.setText("Biggining Balance:");
		txtBalance.setColumns(10);
		txtBalance.setBounds(43, 168, 367, 20);
		panel.add(txtBalance);
		
		JLabel DispAcctInfo = new JLabel("NL");
		DispAcctInfo.setBounds(43, 203, 46, 14);
		panel.add(DispAcctInfo);
		
		//declares combo box. The rest of its properties are below.
		JComboBox bankActivities = new JComboBox();
		
		JButton ActionButton = new JButton("Complete Transaction");
		ActionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String amount, message; 
				
				//Continue this series of if else statements for everything in your combo box (have to make an array first by making bank file in other window.
				if(bankActivities.getSelectedItem().equals("Deposite") ) 
				{
					amount = amt.getText();
					message = easySave.transaction(1, AcctNum.getText(), Double.parseDouble(amount));
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawl")) 
				{
					amount = amt.getText();
					message = easySave.transaction(2, AcctNum.getText(), Double.parseDouble(amount));
				}
				else if(bankActivities.getSelectedItem().equals("CheckBalances")) 
				{
					amount = amt.getText();
					message = easySave.transaction(3, AcctNum.getText(), Double.parseDouble(amount));
				}
				else if (bankActivities.getSelectedItem().equals("AddAcount")) 
				{
					amount = begBalance.getText();
					//For the line below, you missed out on some class coding. Ask where to code the fName and lName variables
					message = easySave.transaction(fName.getText(), lName.getText(), Double.parseDouble(amount));
					DispAcctInfo.setText("New Account ID: " + message);
				}
				else if (bankActivities.getSelectedItem().equals("RemoveAcount")) 
				{
					//This method has been complete
				}
			}
		});
		ActionButton.setBounds(141, 227, 146, 23);
		panel.add(ActionButton);
		
		bankActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (bankActivities.getSelectedItem().equals("Deposite")) {
					
					AcctNum.setForeground(Color.red);
					EntAm.setForeground(Color.red);
				}
				else if (bankActivities.getSelectedItem().equals("withdrawal")) 
				{
					
				}
				
			}
		});
		bankActivities.setToolTipText("");
		bankActivities.setBounds(43, 11, 367, 22);
		panel.add(bankActivities);
		
		
		//public String toString() {
		//String accountString;
		//NumberFormat money = NumberFormat.getCurrencyInstance();
		
		//accountString == acctNum + " ";
		//accountString += cust.toString();
		//accountString += "Current baslance is" + money.format(balance)
		//return(accountString);
	}
}
