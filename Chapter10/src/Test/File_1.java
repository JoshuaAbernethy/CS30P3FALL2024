package Test;

import Test.File_1_Data;

public class File_1 
{
	public static void main(String[] args) 
	{
		System.out.println(File_1_Data.GotCake);
		File_1_Data.GotCake = true;
		System.out.println(File_1_Data.GotCake);
		
		File_1_Data.PrintingTenTimes();
	}
}
