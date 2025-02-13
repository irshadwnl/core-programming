/*Write a program FizzBuzz, take a number as user input, 
and if it is a positive integer loop from 0 to the number and 
print the number, but for multiples of 3 print "Fizz" instead of
the number, for multiples of 5 print "Buzz", 
and for multiples of both print "FizzBuzz". (Solution by Irshad)*/


import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            for(int i=0;i<=n;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(i);
                }
            }
        }
    }
}
