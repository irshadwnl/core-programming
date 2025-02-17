/*Rework the program 2, especially the Hint f where if
 index equals maxDigit, we break from the loop. Here 
 we want to modify to Increase the size of the array
  i,e maxDigit by 10 if the index is equal to maxDigit.
   This is done to consider all digits to find the 
   largest and second-largest number (Solution by Irshad)
 */


import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int maxDigit=10;
        int digits[]=new int[maxDigit];
        int idx=0;
        while (num >0) {
            if(idx==maxDigit){
                maxDigit+=10;
                int temp[]=new int[maxDigit];
                for(int i=0;i<digits.length;i++){
                    temp[i]=digits[i];
                }
                digits=temp;
            }
            digits[idx]=(int)(num%10);
            idx++;
            num/=10;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<idx;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest  && digits[i] != largest){
                secondLargest=digits[i];
            }
        }
        System.out.println("Largest is: "+largest);
        System.out.println("Second Larges is: "+secondLargest);
    }
}
