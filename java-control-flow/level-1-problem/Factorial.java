
// Write a Program to find the factorial of an integer entered by the user (Solution by Irshad).


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        System.out.println("The factorial of "+n +" is "+fact);
    }
}
