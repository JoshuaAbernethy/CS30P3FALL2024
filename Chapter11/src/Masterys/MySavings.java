package Masterys;

import java.text.NumberFormat;
import java.util.Scanner;

public class MySavings {
	private double total;
	
	public MySavings() {
		total = 0;
	}
	
	public double TotalMoney() {
		return total;
	}
	
	public double AddCoins(double coin) {
		total += coin;
		return total;
	}
	
	public double TakeOut(double takeOut) {
		total -= takeOut;
		return total;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MySavings user = new MySavings();
		
		double quarter, dime, nickel, penny, total, data;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner (System.in);
		data = -1;
		quarter = 0.25;
		dime = 0.10;
		nickel = 0.05;
		penny = 0.01;
		while (data != 0) {
			System.out.println("1. Show total in bank. ");
			
			System.out.println("2. Add penny. ");
			
			System.out.println("3. Add nickel. ");
			
			System.out.println("4. Add dime. ");
			
			System.out.println("5. Add quarter. ");
			
			System.out.println("6. Take money out of bank. ");
			
			System.out.println("Enter 0 to quit. ");
			
			System.out.print("Enter your choice ");
			data = input.nextInt();
		
			if (data == 1) {
	            // Show the total money in the Piggy bank
	            System.out.println("Your total is: " + money.format(user.TotalMoney()));
	        } 
			
			else if (data == 2) {
	            // Add a penny and show the updated total
	            System.out.println("Your total is: " + money.format(user.AddCoins(penny)));
	        } 
			
			else if (data == 3) {
	            // Add a nickel and show the updated total
	            System.out.println("Your total is: " + money.format(user.AddCoins(nickel)));
	        } 
			
			else if (data == 4) {
	            // Add a dime and show the updated total
	            System.out.println("Your total is: " + money.format(user.AddCoins(dime)));
	        } 
			
			else if (data == 5) {
	            // Add a quarter and show the updated total
	            System.out.println("Your total is: " + money.format(user.AddCoins(quarter)));
	        } 
			
			else if (data == 6) {
	            // Take money out of the bank
	            System.out.print("How much would you want to take out: ");
	            double takeOut = input.nextDouble();
	            takeOut = user.TakeOut(takeOut);
	        } 
			
			else if (data == 0) {
	            // Exit the program
	            System.out.print("Thank you for using this program. Make sure to come back.");
	            break;
	            
	        }
		
		
		
		}

	}



	}


