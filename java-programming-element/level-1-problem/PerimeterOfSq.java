
// Write a program to find the side of the square whose parameter you read from user 

// package AssignmentWeek1.Day1;

import java.util.Scanner;

public class PerimeterOfSq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int perimeterOfSq=4*side;
        System.out.println("The length of the side is "+ side +" whose perimeter is "+perimeterOfSq);
    }
}
