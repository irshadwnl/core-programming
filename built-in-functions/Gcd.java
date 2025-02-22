
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n=findGcd(n1,n2);
        System.out.println("GCD is: "+n);
    }

    private static int findGcd(int n1, int n2) {
        while(n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        return n1;
    }

}
