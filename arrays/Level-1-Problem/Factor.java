
/*Create a program to find the factors of a number
 taken as user input, store the factors in an array,
  and display the factors (Solution by Irshad).
 */

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factors[]=new int[10];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[idx]=i;
                idx++;
            }
        }

        for(int i:factors){
            if(i!=0){
                System.out.print(i+" ");
            }else{
                break;
            }
        }

    }
}
