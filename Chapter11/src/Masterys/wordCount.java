package Masterys;
import java.io.*;
import java.util.Scanner;
public class wordCount {

	public static void main(String[] args) 
	{
		
		File textFile;
		
		textFile = new File("../Chapter11/src/Masterys/source.txt");
		try 
		{
			//FileWriter textFileWrite = new FileWriter(textFile);
			//BufferedWriter buffWrite = new BufferedWriter(textFileWrite);
			
			int WordCount = 0;
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
				
				boolean OnAWord = false;
				
				String validChars = "qwertyuiopasdfghjklzxcvbnm \n";
				
				for (Character Char : Word.toCharArray()) 
				{
					boolean isValid = false;
					
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
						if (!OnAWord) 
						{
							WordCount++;
							OnAWord = true;
						}
					}
				}
				
				System.out.println(WordCount);
			}
			
			System.out.println("Word Count: " + WordCount);
			
			//textFileRead.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.err.println("No file given");
		}
		catch (IOException e) 
		{
			System.err.println("Got error");
		}
		
	}
		
	public static void wordcntandavglngth(String filePath) 
	{
		int numwords = 0;
		int totalLength = 0;
	}
}
