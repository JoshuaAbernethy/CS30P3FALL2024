package ReverseList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Queue3Skills.Queue3;

public class ReverseListMyWay extends Queue3 {

	public static void stuff()
	{
		List<Double> userNums = new ArrayList<>();
		Scanner user = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Please enter a numner: ");
			double userNum = user.nextDouble();
			System.out.println("");
			
			userNums.add(userNum);
		}
		
		for (int i = 0; i < userNums.size() / 2; i++) 
		{
			int lastArrow = (userNums.size() - 1) - i;
			int lastNum = userNums.get(lastArrow);
			int firstNum = userNums.get(i);
			
			Queue3
			
			userNums.set(i, lastNum);
			userNums.set(lastArrow, firstNum);
		}
		
		System.out.println(userNums);
	}
	
	public static void main(String[] args) 
	{
		stuff();
		
	}

}
