package Skillbuilders;

public class MyFile2 {

	public static void main(String[] args) {
		
		File textFile;
		Sanner input = new Scanner(System.in);
		String response;

		textFile = new File("

		//obtain file name from the user
				System.out.println("Please enter a file name:");
				filename = input.nextLine();
				
				//Determine if a file exists
				textFile = new File(filename);
				
				if(textFile.exists())
				{
					System.out.println("File exists.");
				}
				else
				{
					try
					{
					
				}
				catch (IOException e) 
					
					
					
					
					
			if(response.equalsIgnoreCase("D"))
			{
				System.out.println("Would you like" + "to(K)keep or (Delete teh file");
				response = input.next();
				}
			if(response.equalsIgnoreCase("D"))
			{
				
			//Delete
				if(textFile.delete())
				{
					System.out.println("File Deleted!");
				}
				
				}
			else 
			}
	}

}
