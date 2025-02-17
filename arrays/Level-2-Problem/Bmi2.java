
/*Rewrite the above program using multi-dimensional array
 to store height, weight, and BMI in 2D array for all
  the persons (Solution by Irshad)
 */

import java.util.Scanner;

public class Bmi2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double personData[][]=new double[n][3];
        String weightStatus[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter your weight: ");
            personData[i][0]=sc.nextDouble();
            while (personData[i][0]<0) {
                System.out.print("Enter Valid Weight:");
                personData[i][0]=sc.nextDouble();
            }
            System.out.print("Enter your Height: ");
            personData[i][1]=sc.nextDouble();
            while (personData[i][1]<0) {
                System.out.print("Enter Valid Height:");
                personData[i][1]=sc.nextDouble();
            }
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Weight Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
