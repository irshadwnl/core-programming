
// Create a program to find the maximum number of handshakes among N number of students.


// package AssignmentWeek1.Day1;

import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfStudents=sc.nextInt();
        int noOfHandshakes=(noOfStudents*(noOfStudents-1))/2;
        System.out.println("The no of possible handshakes: "+noOfHandshakes);
    }
}
