/*Create a program to store the digits of the number 
in an array and find the largest and second largest 
element of the array. (Solution  by Irshad)*/

import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digits[]=new int[10];
        int idx=0;
        int largest=0;
        int secondLargest=0;
        while(num!=0 && idx<10){
            digits[idx]=num%10;
            idx++;
            num/=10;
        }
        for(int i=0;i<10;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest){
                secondLargest=digits[i];
            }
        }
        System.out.println("Largest is: "+largest);
        System.out.println("Second Larges is: "+secondLargest);
    }
}
