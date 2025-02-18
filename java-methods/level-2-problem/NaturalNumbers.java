
/*Write a program to find the sum of n natural numbers
using recursive method and compare the result with the 
formulae n*(n+1)/2 and show the result from both
 computations is correct. (Solution by Irshad)*/

import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N Natural Number: ");
            int n=sc.nextInt();
            if(n<1){
                System.out.println("Please Enter vlaid Input Exit");
                return;
            }
        int sum=recursiveNaturalNumber(n);
        int sum2=formulaSum(n);
        System.out.println("Recursive sum is: "+sum);
        System.out.println("Formula sum is: "+sum2);
        if (sum == sum2) {
            System.out.println("Both are same");
        } else {
            System.out.println("Do not match.");
        }
}
    public static int recursiveNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        return n+recursiveNaturalNumber(n-1);
    }
    public static int formulaSum(int n){
        return (n*(n+1))/2;
    }
}
