
// Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println(checkNum(n));
    }
    public static int checkNum(int n){
        if(n>0){
            return 1;
        }else if(n<0){
            return -1;
        }
        return 0;
    }
}
