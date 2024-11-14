package Skillbuilders;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 {
	public static void main(String[] args) 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		String response = null;
		String filename = "";
		
		//obtain file name from the user
		System.out.println("Please enter a file name: ");
		filename = input.next();
		
		textFile = new File("../Chapter11/src/SkillBuilders/" + filename + ".Txt");
		
		//File textFile = new File(filename);
		
		if(textFile.exists())
		{
			System.out.println("File exists.");
			System.out.println("Would you like" + "to(K)keep or (D)elete the file :" + textFile.getAbsolutePath());
			response = input.next();
			response = response.toLowerCase();
			
			if(response.equals("d"))
			{		
				if(textFile.delete())
				{
					textFile.delete();
					System.out.println("File Deleted!");
				}
				
			}
			else if (response.equals("k")) 
			{
				System.out.println("Keeping the file");
			}
		}
		else 
		{
			System.out.println("File does not exist");
		}
	}
}
