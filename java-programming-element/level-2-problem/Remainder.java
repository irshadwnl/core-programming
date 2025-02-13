
/*Write a program to take 2 numbers 
and print their quotient and reminder */


import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("The quotient is "+quotient+" and remainder is "+remainder);
    }
}
