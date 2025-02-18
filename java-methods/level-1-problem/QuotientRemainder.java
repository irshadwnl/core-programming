import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int divisor=sc.nextInt();
        int ans[]=findRemainderAndQuotient(num, divisor);
        System.out.println("Remainder is: "+ans[0]);
        System.out.println("Quotient is: "+ans[1]);

    }

    public static int[] findRemainderAndQuotient(int num, int divisor){
        int rem=num%divisor;
        int quotient=num/divisor;
        return new int[]{rem,quotient};
    }
}
