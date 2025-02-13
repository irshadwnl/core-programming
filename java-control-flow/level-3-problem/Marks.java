
/*Write a program to input marks and 3 subjects physics, 
chemistry and maths. Compute the percentage and 
then calculate the grade as per the following guidelines (Solution by Irshad)
 */


import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int m=sc.nextInt();
        int percentage= ((p+c+m)*100)/300;
        if(percentage>80){
            System.out.println("Your Grade is A and Your Average marks is "+ percentage+" Level 4, above agency-normalized Standard");
        }else if(percentage>=70 && percentage <=79){
            System.out.println("Your Grade is B and Your Average marks is "+ percentage+" Level 3, at agency-normalized Standard");
        }else if(percentage>=60 && percentage <=69){
            System.out.println("Your Grade is C and Your Average marks is "+ percentage+" Level 2, below but approaching agency-normalized Standard");
        }else if(percentage>=50 && percentage <=59){
            System.out.println("Your Grade is D and Your Average marks is "+ percentage+" Level 1, well below agency-normalized Standard");
        }else if(percentage>=40 && percentage <=49){
            System.out.println("Your Grade is E and Your Average marks is "+ percentage+" Level 1, too below agency-normalized Standard");
        }else{
            System.out.println("Your Grade is R and Your Average marks is "+ percentage+" Remedial Standard");
        }
    }
}
