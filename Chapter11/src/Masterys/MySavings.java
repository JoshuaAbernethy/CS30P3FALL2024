/*

Program: FindandReplace         Last Date of this Revision: October 4, 2024

Purpose: The MySavings application asks the user to enter a series of actions (numbers 1 through 6 result in different actions). For adding money the corresponding value to the number the user
inputs results in it being added to a file. When the action number 1 is selected (show total in bank), the value within the file is retreived and output to the user. 

Author: Joshua Abernethy
School: CHHS
Course: Computer Programming 30
 

*/

package Masterys;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;

public class MySavings {
	private double total;
	private static Path textFile = Path.of("../Chapter11/src/Masterys/BalanceMySavings.txt");
	
	public MySavings() {
		total = 0;
	}
	
	public double TotalMoney() {
		try {
			total = Double.parseDouble(Files.readAllLines(textFile).get(0));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return total;
	}
	
	public double AddCoins(double coin) throws IOException {
		total += coin;
		
		Files.writeString(textFile, "" + total);
		
		return total;
	}
	
	public double TakeOut(double coin) throws IOException {
		total -= coin;
		
		Files.writeString(textFile, "" + total);
		
		return total;
	}
	

	public static void main(String[] args) throws IOException {
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

/*
1. Show total in bank. 
2. Add penny. 
3. Add nickel. 
4. Add dime. 
5. Add quarter. 
6. Take money out of bank. 
Enter 0 to quit. 
Enter your choice 1
Your total is: $0.00
1. Show total in bank. 
2. Add penny. 
3. Add nickel. 
4. Add dime. 
5. Add quarter. 
6. Take money out of bank. 
Enter 0 to quit. 
Enter your choice 2
Your total is: $0.01
1. Show total in bank. 
2. Add penny. 
3. Add nickel. 
4. Add dime. 
5. Add quarter. 
6. Take money out of bank. 
Enter 0 to quit. 
Enter your choice 5
Your total is: $0.26
1. Show total in bank. 
2. Add penny. 
3. Add nickel. 
4. Add dime. 
5. Add quarter. 
6. Take money out of bank. 
Enter 0 to quit. 
Enter your choice 6
How much would you want to take out: 0.23
1. Show total in bank. 
2. Add penny. 
3. Add nickel. 
4. Add dime. 
5. Add quarter. 
6. Take money out of bank. 
Enter 0 to quit. 
Enter your choice 1
Your total is: $0.03
1. Show total in bank. 
2. Add penny. 
3. Add nickel. 
4. Add dime. 
5. Add quarter. 
6. Take money out of bank. 
Enter 0 to quit. 
Enter your choice  

 */


