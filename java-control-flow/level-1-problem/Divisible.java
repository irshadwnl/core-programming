
// Write a program to check if a number is divisible by 5 (Solution by Irshad).



import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
