
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=findfact(n);
        System.out.println("Fctorial is: "+ans);

    }

    private static int findfact(int n) {
        if(n==1) return n;
        return n*findfact(n-1);
    }
}
