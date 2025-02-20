import java.util.Random;

public class StudentMarks {

    public static void main(String[] args) {
        int numberOfStudents = 5; 
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);
        displayScoreCard(scores, results, grades);
    }

    private static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; 

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(100); 
            scores[i][1] = random.nextInt(100); 
            scores[i][2] = random.nextInt(100); 
        }
        return scores;
    }

    private static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; 

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100; 

            results[i][0] = Math.round(total * 100.0) / 100.0; 
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return results;
    }

    private static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1]; 

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }

    private static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Physics", "Chemistry", "Maths", "Total", "Average", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f %-10s\n",
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], grades[i][0]);
        }
    }
}
