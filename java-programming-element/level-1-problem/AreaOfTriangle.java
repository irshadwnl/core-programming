
/*Write a program that takes the base and height 
to find area of a triangle in square inches and 
square centimeters 
 */

// package AssignmentWeek1.Day1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        double areaOfTriangle=(base*height)*0.5;

        System.out.println("Your height in cm is "+areaOfTriangle+" while in feet is "+areaOfTriangle*0.032+" and inches is "+areaOfTriangle*0.393);
    }
}
