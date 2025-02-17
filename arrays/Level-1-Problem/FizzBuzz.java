
/*Write a program FizzBuzz, take a number as user input and
 if it is a positive integer loop from 0 to the number and
  save the number, but for multiples of 3 save "Fizz" instead 
  of the number, for multiples of 5 save "Buzz", and for 
  multiples of both save "FizzBuzz". Finally, 
  print the array results for each index position in
   the format Position 1 = 1, …, Position 3 = Fizz,... 
   (Solution by Irshad).
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        int idx=0;
        if(n>0){
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    arr[idx]="FizzBuzz";
                    idx++;
                }else if(i%5==0){
                    arr[idx]="Buzz";
                    idx++;
                }else if(i%3==0){
                    arr[idx]="Fizz";
                    idx++;
                }else{
                    arr[idx]=String.valueOf(i);
                    idx++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Position "+(i+1)+" : "+arr[i]);
        }
    }
}
