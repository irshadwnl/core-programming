
/*Create a program to save odd and even numbers into 
odd and even arrays between 1 to the number entered
 by the user. Finally, print the odd and even numbers array
 (Solution by Irshad)
 */


import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd[]=new int[(n/2)];
        int even[]=new int[n/2];
        int evenidx=0;
        int oddidx=0;
        if(n>0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    even[evenidx]=i;
                    evenidx++;
                }else{
                    odd[oddidx]=i;
                    oddidx++;
                }
            }
        }else{
            System.out.println("Error");
        }

        evenidx=0;
        oddidx=0;
        System.out.println("Even elements are");
        while (evenidx<even.length) {
            System.out.print(even[evenidx]+ " ");
            evenidx++;
        }
        System.out.println();
        System.out.println("Odd elements are");
        while (oddidx<odd.length) {
            System.out.print(odd[oddidx]+ " ");
            oddidx++;
        }

        
    }
}
