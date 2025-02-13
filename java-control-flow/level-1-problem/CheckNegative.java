
// Write a program to check whether a number is positive, negative, or zero (Solution by Irshad).

import java.util.Scanner;

public class CheckNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num+" is"+"Postive");
        }else if(num<0){
            System.out.println(num+" is"+"Negative");
        }else{
            System.out.println(num+" is"+"Zero");
        }
    }
}
