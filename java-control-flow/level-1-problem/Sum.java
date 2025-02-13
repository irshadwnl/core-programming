// Write a program to find the sum of numbers until the user enters 0 (Solution by Irshad).



import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        double sum=0;
        while(d!=0){
            sum+=d;
            d=sc.nextDouble();
        }
        System.out.println("Sum is "+sum);
    }
}
