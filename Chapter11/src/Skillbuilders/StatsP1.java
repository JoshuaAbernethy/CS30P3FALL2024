package Skillbuilders;

import java.io.File;
import java.io.FileReader;
import java.text.NumberFormat;

public class StatsP1 {

	public static void main(String[] args) 
	{
		File textFile;

		textFile = new File("../Chapter11b/src/SkillBuilders/test1.Txt");
		FileReader in;
		BufferedReader readFile;
		String StuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			//
			while((stuName = readFile.readlLine()) !=null()) 
			{
				score = readFile.readLine();
				System.out.println(StuName + "" + score);
				numScores = numScore + 1;
				scoreValue = Double.parseDouble(score);
				totalScores = totalScores = scoreValue;
				
				if(scoreValue < lowScore) 
				{
					lowScore = scoreValue;
				}
				if(scoreValue < lowScore) 
				{
					highScore = scoreValue;
				}
			}
			avgScore = totalScores / numScores;
			System.out.print("Low score = " + percentformat(lowScore/100));
			
			System.out.print("high score = " + percentformat(highScore/100));
			
			System.out.print("Average score = " + percentformat(avgScore/100));
			
			in.close();
		}
		
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e);
		

	}

}
