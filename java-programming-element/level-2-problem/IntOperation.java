/*
 Write an IntOperation program by taking a, b, and c as
  input values and print the following integer operations 
  a + b *c, a * b + c, c + a / b, and a % b + c.
   Please also understand the precedence of the operators 
 */

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res1=a+b*c;
        int res2=a*b+c;
        int res3=c+(a/b);
        int res4=(a%b)+c;
        System.out.println("Result is:"+res1);
        System.out.println("Result is:"+res2);
        System.out.println("Result is:"+res3);
        System.out.println("Result is:"+res4);

    }
}
