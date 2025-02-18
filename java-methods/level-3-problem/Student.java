import java.util.Random;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        // Generate random scores
        double[][] scores = generateRandomScores(numberOfStudents);
        
        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);
        
        // Display the scorecard
        displayScorecard(scores, results);
        
        sc.close();
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static double[][] generateRandomScores(int numberOfStudents) {
        Random rand = new Random();
        double[][] scores = new double[numberOfStudents][3]; // 2D array to hold scores for PCM

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics score (10 to 99)
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry score (10 to 99)
            scores[i][2] = 10 + rand.nextInt(90); // Maths score (10 to 99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array to hold total, average, percentage
        
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2]; // Total score
            double average = total / 3; // Average score
            double percentage = (total / 300) * 100; // Percentage score
            
            results[i][0] = round(total);       // Total score
            results[i][1] = round(average);     // Average score
            results[i][2] = round(percentage);   // Percentage score
        }
        return results;
    }

    // Method to round off values to 2 decimal places
    public static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    // Method to display the scorecard
    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
}
