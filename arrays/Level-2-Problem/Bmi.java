
/*An organization took up an exercise to find the Body
 Mass Index (BMI) of all the persons in the team.
  For this create a program to find the BMI and 
  display the height, weight, BMI and status of 
  each individual (Solution by Irshad)
 */

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double weight[]=new double[n];
        double height[]=new double[n];
        double bmi[]=new double[n];
        String weightStatus[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter your weight in (kg): ");
            weight[i]=sc.nextDouble();
            System.out.print("Enter your height in (m): ");
            height[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i] * height[i]);
        }
        for(int i=0;i<n;i++){
            if(bmi[i]>=40.0){
                weightStatus[i]="Obese";
            }else if(bmi[i]>25.0 && bmi[i]<=39.9){
                weightStatus[i]="OverWeight";
            }else if(bmi[i]>18.25 && bmi[i]<=24.9){
                weightStatus[i]="Normal";
            }else{
                weightStatus[i]="UnderWeight";
            }
        }
        System.out.printf("\n%-10s %-10s %-10s %-10s","Weight","Height","BMI","WeightStatus");
        for(int i=0;i<n;i++){
            System.out.printf("\n%-10.2f %-10.2f %-10.2f %-10s", weight[i],height[i],bmi[i],weightStatus[i]);
        }
    }
}
