package Masterys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) 
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
		BufferedWriter writeFile;
		
		try
		{
			out = new FileWriter(textFile);
			writeFile = new BufferedWriter(out);
			System.out.println("Please enter a word or phrase: ");
			String userPhrase = input.next();
			writeFile.write(userPhrase);
		} 
		catch (IOException e)
		{
			System.out.println("Problem writting to the file!");
		}
		
		while (true) 
		{
		System.out.println("Would you like to replace your old phrase (Y) or (N);");
		decideYorN = input.next().toUpperCase();
		
		if(decideYorN.equals("Y"))
		{
			//Search word/phrase to replace
			while (true)
			{
				System.out.println("Please enter what part of your word or phrase you would like to replace: ");
				String searchPhrase = input.next();
				
				if(searchPhrase == userPhrase/*enter the part of the code that the searchPhrase has to match with*/)
				{
					System.out.println("Please enter another word or phrase");
					replacePhrase = input.next();
					break;
				}
				else if(searchPhrase != userPhrase/*enter the part of the code that the searchPhrase has to match with*/)
				{
					System.out.println("Not a word or phrase in the file, please try again.");
				}
			}
			break;
			
			try 
			{
				Scanner textFileRead = new Scanner(textFile);
				
				while (textFileRead.hasNext()) 
				{
					String Word = textFileRead.next();
					int Spaces = 0;
					
					Word = Word.replace('-', ' ');
					
					for (Character Char2 : Word.toCharArray()) 
					{
						if (Char2 == ' ') 
						{
							Spaces++;
						}
					}
					
					System.out.println(Spaces);
					
					//Word = Word.replace('-', ' ');
					System.out.print("word: " + Word + " | ");
					
					//boolean OnAWord = false;
					
					String validChars = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM \n";
					
					//for (Character Char : Word.toCharArray()) 
				//{
						//boolean isValid = false;
						
						for (Character Valid : validChars.toCharArray()) 
						{
							if (Char == Valid) 
							{
								isValid = true;
								break;
							}
						}
						
						
						if (Char == ' ' || Char == '\n')
						{
							OnAWord = false;
						}

						if (isValid) 
						{
							//I Edited this one
							if (OnAWord == userPhrase) 
							{
								OnAWord = true;
								writeFile.write(replacePhrase);
								
							}
						}
					}
					
					System.out.println(WordCount);
			
			}catch (IOexception e)
			{
				System.out.println("Th3ere was an issue");
			}
			
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
