
// Create a program to check if a number taken from the user is a Harshad Number (Solution by Irshad).


import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(og%sum==0?"Harshad Number":"Not a Harshad Number");
    }
}
