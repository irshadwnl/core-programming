
// Write a program to check if the first, second, or third number is the largest of the three (Solution by Irshad).


import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1 > num2 && num1 > num3 ){
            System.out.println("The largest number is "+num1);
        }else if(num2 > num3 && num2 > num1){
            System.out.println("The largest number is "+num2);
        }else{
            System.out.println("The largest number is "+num3);
        }
    }
}
