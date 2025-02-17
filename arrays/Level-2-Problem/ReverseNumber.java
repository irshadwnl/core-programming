
/*Create a program to take a number as input
 and reverse the number. To do this, store 
 the digits of the number in an array and
  display the array in reverse order
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int cnt=0;
        while (n>0) {
            cnt++;
            n/=10;
        }
        int digits[]=new int[cnt];
        int idx=0;
        while(og>0){
            digits[idx]=og%10;
            idx++;
            og/=10;
        }
        for(int i:digits){
            System.out.print(i+" ");
        }
    }
}
