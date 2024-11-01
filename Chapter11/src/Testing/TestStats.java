package Testing;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the name of the file to create
        System.out.print("Enter the name of the file to create (e.g., test1.dat): ");
        String fileName = scanner.nextLine();

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> names = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();

        // Collect names and scores from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);

            System.out.print("Enter the score for " + name + ": ");
            int score = scanner.nextInt();
            scores.add(score);
            scanner.nextLine(); // Consume the newline character
        }

        // Write data to the specified file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < names.size(); i++) {
                bw.write(names.get(i));
                bw.newLine();
                bw.write(String.valueOf(scores.get(i)));
                bw.newLine();
            }
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
            return;
        }

        // Read the data from the file and display statistics
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String name;
            List<Integer> readScores = new ArrayList<>();
            while ((name = br.readLine()) != null) {
                String scoreLine = br.readLine();
                if (scoreLine != null) {
                    int score = Integer.parseInt(scoreLine);
                    readScores.add(score);
                }
            }

            // Calculate and display statistics
            if (!readScores.isEmpty()) {
                int lowest = readScores.get(0);
                int highest = readScores.get(0);
                int sum = 0;

                for (int score : readScores) {
                    if (score < lowest) {
                        lowest = score;
                    }
                    if (score > highest) {
                        highest = score;
                    }
                    sum += score;
                }

                double average = (double) sum / readScores.size();

                System.out.println("\nStatistics from " + fileName + ":");
                System.out.println("Lowest Score: " + lowest);
                System.out.println("Highest Score: " + highest);
                System.out.println("Average Score: " + average);
            } else {
                System.out.println("No scores available.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing score: " + e.getMessage());
        }
    }
}

