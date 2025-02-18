import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Natural Numeber: ");
        int n=sc.nextInt();
        int ans=calculateSum(n);
        System.out.println("Sum of "+n+" natural number is: "+ans);
    }
    public static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=1;
        }
        return sum;
    }
}
