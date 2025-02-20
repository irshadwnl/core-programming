import java.util.Random;
import java.util.Scanner;

public class RockPaper {

    private static final String[] choices = {"Rock", "Paper", "Scissors"};
    private static int playerWins = 0;
    private static int computerWins = 0;
    private static int draws = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int numberOfGames = scanner.nextInt();
        String[][] results = new String[numberOfGames][3]; 

        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String playerChoice = scanner.next();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);
            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
        }

        displayResults(results);
        scanner.close();
    }

    
    private static String getComputerChoice() {
        Random random = new Random();
        return choices[random.nextInt(3)];
    }

    private static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
                   (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    private static void displayResults(String[][] results) {
        double totalGames = results.length;
        double playerWinPercentage = (playerWins / totalGames) * 100;
        double computerWinPercentage = (computerWins / totalGames) * 100;
        double drawPercentage = (draws / totalGames) * 100;

        System.out.println("\nFinal Results:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.printf("Player Win Percentage: %.2f%%\n", playerWinPercentage);
        System.out.printf("Computer Win Percentage: %.2f%%\n", computerWinPercentage);
        System.out.printf("Draw Percentage: %.2f%%\n", drawPercentage);
    }
}
