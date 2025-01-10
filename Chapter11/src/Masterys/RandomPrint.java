package Masterys;

public class RandomPrint {

	public static void  printMessage(String... Message) 
	{
		String FullMessage = "";
		
		for (String Mes : Message) 
		{
			FullMessage += Mes;
		}
		
		System.out.println(FullMessage);//
	}
}
