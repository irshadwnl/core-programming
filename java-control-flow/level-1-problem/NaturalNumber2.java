
/*Write a program to find the sum of n natural numbers using while loop 
compare the result with the formulae n*(n+1)/2 and 
show the result from both computations was correct.(Solution by Irshad)  */


import java.util.Scanner;

public class NaturalNumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=(n*(n+1))/2;
        int sum2=0;
        while(n!=0){
            sum2+=n;
            n--;
        }
        System.out.println(sum==sum2?"Yes":"No");
    }
}
