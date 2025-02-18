/*An organization took up the exercise to find the Body Mass Index 
(BMI) of all the persons in the team of 10 members. 
For this create a program to find the BMI and display the height,
 weight, BMI and status of each individual (Solution by Irshad)
 */

import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double personData[][]=new double[10][3];
        String weightStatus[]=new String[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter your weight: ");
            personData[i][0]=sc.nextDouble();
            while (personData[i][0]<0) {
                System.out.print("Enter Valid Weight:");
                personData[i][0]=sc.nextDouble();
            }
            System.out.print("Enter your Height in cm: ");
            personData[i][1]=sc.nextDouble();
            while (personData[i][1]<0) {
                System.out.print("Enter Valid Height:");
                personData[i][1]=sc.nextDouble();
            }
            calculateBmi(i,personData);
            calculateBmiStatus(i,personData,weightStatus);
        }
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Weight Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
    public static void calculateBmi(int idx,double personData[][]){
        double heightInMeter=personData[idx][1]*0.01;
        personData[idx][2]=personData[idx][0]/(heightInMeter*heightInMeter);
    }
    public static void calculateBmiStatus(int idx,double personData[][],String weightStatus[]){
        if (personData[idx][2] <= 18.4) {
            weightStatus[idx] = "Underweight";
        } else if (personData[idx][2] < 24.9) {
            weightStatus[idx] = "Normal";
        } else if (personData[idx][2] < 39.9) {
            weightStatus[idx] = "Overweight";
        } else {
            weightStatus[idx] = "Obese";
        }
    }
}
