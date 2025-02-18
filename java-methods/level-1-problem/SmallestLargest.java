import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
        int ans[] = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest is: "+ans[0]);
        System.out.println("Largest is: "+ans[1]);
    }
    public static int[] findSmallestAndLargest(int n1, int n2, int n3){
        int smallest=n1;
        int largest=n1;
        if(n1> n2 && n1>n3){
            largest=n1;
        }else if(n2>n1 && n2>n3){
            largest=n2;
        }else{
            largest=n3;
        }

        if(n1< n2 && n1<n3){
            smallest=n1;
        }else if(n2<n1 && n2<n3){
            smallest=n2;
        }else{
            smallest=n3;
        }
        return new int[]{smallest,largest};
    }
}
