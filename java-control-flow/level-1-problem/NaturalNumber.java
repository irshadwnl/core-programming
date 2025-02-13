
/*
 Write a program to check for the natural number
  and write the sum of n natural numbers (Solution by Irshad)
 */

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            int sum=((num*(num+1))/2);
            System.out.println("The sum of "+num+ " natural number is "+sum);
        }else{
            System.out.println("Not a Natural Number");
        }
    }
}
