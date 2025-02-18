import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        boolean prime=isPrime(n);
        boolean neon=isNeon(n);
        boolean spy=isSpy(n);
        boolean automorphic=isAutomorphic(n);
        boolean buzz=isBuzz(n);
        displayAll(n,prime,neon,spy,automorphic,buzz);
        
    }
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int n){
        int sum=0;
        int og=n;
        while (n>0) {
            sum+=Math.pow(n%10, 2);
            n/=10;
        }
        return sum==og;
    }
    public static boolean isSpy(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n){
        int sq=n*n;
        while (n>0) {
            if(n%10 != sq%10){
                return false;
            }
            n/=10;
            sq/=10;
        }
        return true;
    }
    public static boolean isBuzz(int n){
        if(n%7==0 || n%10==7){
            return true;
        }
        return false;
    }
    public static void displayAll(int n,boolean prime,boolean neon,boolean spy,boolean automorphic,boolean buzz){
        if (prime) {
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");
        }
        if (neon) {
            System.out.println(n+" is Neon Number");
        }else{
            System.out.println(n+" is not Neon Number");
        }
        if(spy){
            System.out.println(n+" is a Spy Number");
        }else{
            System.out.println(n+" is not a Spy Number");
        }
        if(automorphic){
            System.out.println(n+" is an Automorphic Number");
        }else{
            System.out.println(n+" is not an Automorphic Number");
        }
        if (buzz) {
            System.out.println(n+" is a Buzz Number");
        }else{
            System.out.println(n+" is not a Buzz Number");
        }
    }
}
