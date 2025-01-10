package ReverseList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversList {

	public static void main(String[] args)
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
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("");
		}//
		
		System.out.println(userNums);
		
		for (int i = 0; i < userNums.size() / 2; i++) 
		{
			int lastArrow = (userNums.size() - 1) - i;
			double lastNum = userNums.get(lastArrow);
			double firstNum = userNums.get(i);
			
			userNums.set(i, lastNum);
			userNums.set(lastArrow, firstNum);
		}
		
		System.out.println(userNums);
		
	}
}
