
// Create a program to count the number of digits in an integer (Solution by Irshad).


import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        System.out.println("Digit Count is "+cnt);
    }
}
