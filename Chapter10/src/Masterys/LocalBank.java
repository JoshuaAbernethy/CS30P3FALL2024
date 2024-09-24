package Masterys;

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
		
		JLabel DIspAcctInfo = new JLabel("NL");
		DIspAcctInfo.setBounds(43, 203, 46, 14);
		panel.add(DIspAcctInfo);
		
		JButton ActionButton = new JButton("Complete Transaction");
		ActionButton.setBounds(141, 227, 146, 23);
		panel.add(ActionButton);
		
		JComboBox bankActivities = new JComboBox();
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
