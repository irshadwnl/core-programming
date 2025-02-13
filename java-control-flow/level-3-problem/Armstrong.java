
/*Create a program to check if a number is armstrong or not.
 Use the hints to show the steps clearly in the code
(Solution by Irshad)
 */

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int sum=0;
        if(n<999){
            while (n!=0) {
                int rem=n%10;
                sum+=rem*rem*rem;
                n/=10;
            }
        }else{
            while (n!=0) {
                int rem=n%10;
                sum+=rem*rem*rem*rem;
                n/=10;
            }
        }
        System.out.println(og==sum?true:false);
    }
}
