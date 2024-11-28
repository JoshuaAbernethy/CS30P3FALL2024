package Masterys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws IOException 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		String filename = "";
		String decideYorN = null;
		String replacePhrase = null;
		//obtain file name from the user
		System.out.println("Please enter a file name: ");
		filename = input.next();
		
		textFile = new File("../Chapter11/src/SkillBuilders/" + filename + ".txt");
		
		FileWriter out;
		FileReader in;
		BufferedWriter writeFile;
		
		try
		{
			out = new FileWriter(textFile);
			in = new FileReader(textFile);
			writeFile = new BufferedWriter(out);
			System.out.println("Please enter a word or phrase: ");
			String userPhrase = input.next();
			writeFile.write(userPhrase);
		} 
		catch (IOException e)
		{
			System.out.println("Problem writting to the file!");
			return;
		}
		
		while (true) 
		{
			System.out.println("Would you like to replace your old phrase (Y) or (N);");
			decideYorN = input.next().toUpperCase();
			
			if(decideYorN.equals("Y"))
			{
				System.out.println("Please enter what part of your word or phrase you would like to replace: ");
				String searchPhrase = input.next();
				
				boolean foundWord = false;
				
				//Search word/phrase to replace
				try (BufferedReader line = new BufferedReader(in)) 
				{
					String currentLine;
					
					while ((currentLine = line.readLine()) != null) 
					{
						if (currentLine.equals(searchPhrase)) 
						{
							foundWord = true;
							break;
						}
					}
				}
				
				if (!foundWord) 
				{
					System.out.println("Not a word or phrase in the file, please try again.");
					continue;
				}
				
				System.out.println("Please enter another word or phrase to replace [" + searchPhrase + "]");
				replacePhrase = input.next();
				
				String text = "";
				
				try (BufferedReader line = new BufferedReader(in)) 
				{
					String currentLine;
					
					while ((currentLine = line.readLine()) != null) 
					{
						currentLine = currentLine.replaceAll(searchPhrase, replacePhrase);
						text = text + currentLine;
					}
				}
				
				try (BufferedWriter writer = new BufferedWriter(out)) 
				{
					writer.write(text);
				}
				
				break;
			}
			else if (decideYorN.equals("N"))
			{
				break;
			}
			
			else
			{
				System.out.println("Invalid Input, please try again.");
			}
		}
		
		System.out.println("Here is the phrase within the file: " + textFile);
		
	}
}

/*
  try {
            // Step 2: Read the file contents into a list of lines
            BufferedReader reader = new BufferedReader(new FileReader(textFile));
            StringBuilder fileContents = new StringBuilder();
            String line;

            // Step 3: Read file line by line, replace occurrences
            while ((line = reader.readLine()) != null) {
                // Replace all occurrences of the search phrase with the replacement phrase
                line = line.replaceAll(searchPhrase, replacePhrase);
                fileContents.append(line).append(System.lineSeparator());
            }
            reader.close();

            // Step 4: Write the updated contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(textFile));
            writer.write(fileContents.toString());
            writer.close();
            
            
               System.out.println(fileContents.toString());  // Output the modified content
            
 */
