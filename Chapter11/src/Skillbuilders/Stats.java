package Skillbuilders;

import java.io.*;
import java.util.Scanner;

public class Stats {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		//File file = new File("scores.dat");
		int numOfStu = 0;
		String name;
		int score = 0;
		
		System.out.println("please enter the name of the file: ");
		String fileNmae = input.nextLine();
		
		for (int i =0; i <numOfStu; i++)
		{
			System.out.println("Enter the name of the student" + (i + 1) + ":");
			name = input.nextLine();
			
			System.out.println("Enter the score for" + name+ ":");
			score = input.nextInt();
		}
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
