package Accountss;
import java.text.NumberFormat;
public class AccountChapter7 {
	private double balance;
	private Customer cust;
	
	public AccountChapter7(double bal, String fName, String lName, String city, String st, String zip, String str) {
		balance = bal;
		cust = new Customer(fName, lName, str, city,st,zip);
	}
	public double getBalance() {
		return (balance);
	}//
	public void deposit(double amt) {
		balance += amt;
	}
	public void withdrawal(double amt) {
		if (amt <= balance) {
			balance -= amt;
		}
		else {
			System.out.println("Not enough money is in account. ");
		}
	}
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		accountString = cust.toString();
		accountString += "Current Balance is: " +money.format(balance);
		return accountString;
	}
	public void changeAddress(String city, String state, String zip, String street) {
		cust.changeCity(city);
		cust.changeState(state);
		cust.changeZip(zip);
		cust.changeStreet(street);
	}
	
}
