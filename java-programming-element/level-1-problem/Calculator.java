
/*  Write a program to create a basic calculator that can
 perform addition, subtraction, multiplication, and division.
  The program should ask for two numbers (floating point) and 
  perform all the operation */


// package AssignmentWeek1.Day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val1=sc.nextInt();
        int val2=sc.nextInt();

        int add=val1+val2;
        int sub=val1-val2;
        int mul=val1*val2;
        int div=val1/val2;

        System.out.println("The addition, substraction, multiplication, division value of 2 numbers "+val1 +" and "+val2+" is "+add+", "+sub +", "+ mul+", "+div);

    }
}
