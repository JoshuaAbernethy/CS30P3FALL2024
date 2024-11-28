package ReverseList;

import java.util.*;

public class SortList 
{
	static int NumberAmount = 10;
	
	public static void main(String[] args) 
	{
		for (int x = 0; x < 20; x++) 
		{
			System.out.println("");
		}
		
		Scanner User = new Scanner(System.in);
		int[] Numbers = {0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < NumberAmount; i++) 
		{
			System.out.print("Enter: ");
			Numbers[i] = User.nextInt();
			
			for (int x = 0; x < 20; x++) 
			{
				System.out.println("");
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < NumberAmount; i++) 
		{
			System.out.println(Numbers[i]);
		}

		System.out.println("");
		
		for (int i = 0; i < Numbers.length;) 
		{
			for (int x = Numbers.length - 1; x > i; x--) 
			{
				int lastNum = Numbers[x];
				
				if (lastNum > Numbers[i]) 
				{
					System.out.println("");
					System.out.println("Before [" + Numbers[i] + "] < [" + Numbers[x] + "]");
					
					Numbers[x] = Numbers[i];
					Numbers[i] = lastNum;
					
					System.out.println("After [" + Numbers[i] + "] > [" + Numbers[x] + "]");
					System.out.println("");
					continue;
				}
				
				System.out.println("Good [" + Numbers[i] + "] > [" + Numbers[x] + "]");
			}
			
			System.out.println("");
			System.out.println("---------");
			System.out.println("");
			
			i++;
		}
		
		for (int i = 0; i < Numbers.length; i++) 
		{
			System.out.println("[" + Numbers[i]  + "]");
		}
	}

}
