import java.util.Scanner;

public class YardsInFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        System.out.println("Distance in Yards: " + distanceInYards);
        System.out.println("Distance in Miles: " + distanceInMiles);            }
}
