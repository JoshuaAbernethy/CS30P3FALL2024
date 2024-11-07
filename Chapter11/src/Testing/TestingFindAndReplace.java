package Testing;

import java.io.*;
import java.util.Scanner;

public class TestingFindAndReplace {

    public static void main(String[] args) {
        File textFile;
        Scanner input = new Scanner(System.in);
        String filename = "";
        String searchPhrase = null;
        String replacePhrase = null;
        
        // Obtain file name from the user
        System.out.println("Please enter a file name (without extension): ");
        filename = input.nextLine();
        
        // Set file path (assumes the file is in the given relative path)
        textFile = new File("../Chapter11/src/SkillBuilders/" + filename + ".txt");

        // Check if the file exists
        if (!textFile.exists()) {
            System.out.println("File does not exist. Please check the file name.");
            return;
        }
        
        try {
            // Read the content of the file into a StringBuilder
            StringBuilder fileContent = new StringBuilder();
            Scanner fileScanner = new Scanner(textFile);
            while (fileScanner.hasNextLine()) {
                fileContent.append(fileScanner.nextLine()).append("\n");
            }
            fileScanner.close();

            // Ask the user for the phrase they want to search for
            System.out.println("Please enter the word or phrase to search for: ");
            searchPhrase = input.nextLine();

            // Ask for the replacement phrase
            System.out.println("Please enter the replacement word or phrase: ");
            replacePhrase = input.nextLine();

            // Replace all occurrences of the searchPhrase with replacePhrase
            String updatedContent = fileContent.toString().replace(searchPhrase, replacePhrase);

            // Ask for confirmation before overwriting the file
            System.out.println("Would you like to save the changes? (Y/N): ");
            String decideYorN = input.nextLine().toUpperCase();

            if (decideYorN.equals("Y")) {
                // Write the updated content back to the file
                BufferedWriter writer = new BufferedWriter(new FileWriter(textFile));
                writer.write(updatedContent);
                writer.close();
                System.out.println("The file has been updated successfully.");
            } else {
                System.out.println("No changes were made to the file.");
            }

        } catch (IOException e) {
            System.out.println("There was an issue processing the file: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}