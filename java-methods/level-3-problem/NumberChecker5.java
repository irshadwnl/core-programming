import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int factors[]=findFactors(n);
        // System.out.println(Arrays.toString(factors));
        int gf=findGreatestFactor(n,factors);
        int factorSum=findFactorSum(factors);
        int prodOfFactor=findFactorProduct(factors);
        int cube=findCubeOfProduct(factors);
        boolean perfectNumber=isPerfectNumber(n,factorSum);
        boolean abundantNumber=isAbundantNumber(n,factorSum);
        boolean deficientNumber=isDeficientNumber(n,factorSum);
        boolean strongNum=isStrongNumber(n);
        displayAll(n,factors,gf,factorSum,prodOfFactor,cube,perfectNumber,abundantNumber,deficientNumber,strongNum);
        // System.out.println(strongNum);
        // System.out.println(gf);
    }
    public static int[] findFactors(int n){
        int cnt=0;
        int og=n;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        int fact[]=new int[cnt];
        int idx=0;
        for(int i=1;i<=og;i++){
            if(n%i==0){
                fact[idx]=i;
                idx++;
            } 
        }
        return fact;
    }
    public static int findGreatestFactor(int n,int factors[]){
        for(int i=factors.length-2;i>=0;i--){
            if(n%factors[i]==0){
                return factors[i];
            }
        }
        return -1;
    } 
    public static int findFactorSum(int factors[]){
        int sum=0;
        for(int i:factors){
            sum+=i;
        }
        return sum;
    }

    public static int findFactorProduct(int factors[]){
        int prod=1;
        for(int i:factors){
            prod*=i;
        }
        return prod;
    }
    public static int findCubeOfProduct(int factors[]){
        int cube=1;
        for(int i:factors){
            cube*=Math.pow(i, 3);
        }
        return cube;
    }
    public static boolean isPerfectNumber(int n,int factorSum){
        return n==factorSum;
    }
    public static boolean isAbundantNumber(int n,int factorSum){
        return factorSum>n;
    }
    public static boolean isDeficientNumber(int n,int factorSum){
        return factorSum<n;
    }
    public static boolean isStrongNumber(int n){
        int sum=0;
        int og=n;
        while (n>0) {
            int rem=n%10;
            int fact=1;
            for(int i=rem;i>=1;i--){
                fact*=i;;
            }
            sum+=fact;
            n/=10;
        }
        return sum==og;
    }
    public static void displayAll(int n,int factors[],int gf,int factorSum,int prodOfFactor,int cube,boolean perfectNumber,boolean abundantNumber,boolean deficientNumber,boolean strongNum){
        System.out.println(Arrays.toString(factors));
        System.out.println("Greatest common factor of "+n+" is "+gf);
        System.out.println("prod of factor is "+prodOfFactor);
        System.out.println("cube of its product is "+cube);
        if(perfectNumber){
            System.out.println(n+"is Perfect Number");
        }else{
            System.out.println(n+" is not a Perfect Number");
        }

        if(abundantNumber){
            System.out.println(n+" is Abundant Number");
        }else{
            System.out.println(n+" is not a abundant number");
        }
        
        if(deficientNumber){
            System.out.println(n+" is Deficient Number");
        }else{
            System.out.println(n+" is not a Deficent number");
        }

        if(strongNum){
            System.out.println(n+" is Strong Number");
        }else{
            System.out.println(n+" is not a Strong Number");
        }
    }
}
