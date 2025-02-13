
// Write a program that takes your height in centimeters and converts it into feet and inches


// package AssignmentWeek1.Day1;

import java.util.Scanner;

public class CmToFoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        System.out.println("Your height in cm is "+height+" while in feet is "+(height/(12*2.54))+" and inches is "+(height/2.54));
    }
}
