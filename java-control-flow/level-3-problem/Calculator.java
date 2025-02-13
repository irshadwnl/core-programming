
// Write a program to create a calculator using switch...case (Solution by Irshad).


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double first=sc.nextDouble();
        double second=sc.nextDouble();
        String op=sc.next();

        switch (op) {
            case "+":
                System.out.printf("Sum is %.2f ",(first+second));
                break;
            case "-":
                System.out.printf("Substraction is %.2f ",(first-second));
                break;
            case "*":
                System.out.printf("Multiplication is %.2f ",(first*second));
                break;
            case "/":
                System.out.printf("Divison is %.2f ",(first/second));
                break;
            default:
            System.out.println("Invalid Operator");
                break;
        }
    }
}
