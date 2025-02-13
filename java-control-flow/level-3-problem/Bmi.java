
// Create a program to find the BMI of a person (Solution by Irshad)


import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble(); //in kg
        double height=sc.nextDouble(); // in cm
        double heightinMeter=height*0.01;
        double bmi=weight/(heightinMeter*heightinMeter);
        System.out.println(bmi);

        if(bmi <=18.4){
            System.out.println("Underweight");
        }else if(bmi >=18.25 && bmi <=24.9){
            System.out.println("Normal");
        }else if(bmi >=25.0 && bmi <=39.9){
            System.out.println("Normal");
        }else{
            System.out.println("Obese");
        }
    }
}
