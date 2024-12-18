/*

Program: WordCount         Last Date of this Revision: October 4, 2024

Purpose: The WordCount application reads everything within a file and display's the number of words within the file. It then determines the length of all the words.

Author: Joshua Abernethy
School: CHHS
Course: Computer Programming 30
 

*/
package Masterys;
import java.io.*;
import java.util.Scanner;
public class wordCount {

	public static void main(String[] args) 
	{
		
		File textFile;
		
		textFile = new File("../Chapter11/src/Masterys/source.txt");
		
		
		//FileWriter textFileWrite = new FileWriter(textFile);
		//BufferedWriter buffWrite = new BufferedWriter(textFileWrite);
				
		try 
		{
			
			int WordCount = 0;
			int lengthWords = 0;
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
				
				String validChars = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM \n";
				
				for (Character Char : Word.toCharArray()) 
				{
					boolean isValid = false;
					
					for (Character Valid : validChars.toCharArray()) 
					{
						if (Char == Valid) 
						{
							lengthWords++;
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
			
			System.out.println("Lenth of words is a total of " + lengthWords + " characters!");
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
		

}

/*
 0
word: 1 | 0
0
word: 2 | 0
0
word: 3 | 0
0
word: 4 | 0
0
word: 5 | 0
0
word: There | 1
0
word: are | 2
0
word: 5 | 2
0
word: (five) | 3
0
word: days | 4
0
word: In | 5
0
word: the | 6
0
word: week! | 7
0
word: %*$*$&%&* | 7
Word Count: 7
Length of words is a total of 25 characters!
 
 
 
 
 */
