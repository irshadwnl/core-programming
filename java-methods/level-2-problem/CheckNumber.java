/*Write a program to take user input for 5 numbers and
 check whether a number is positive or negative. 
 Further for positive numbers check if the number
  is even or odd. Finally compare the first and 
  last elements of the array and display if they 
  are equal, greater, or less (Solution by Irshad) */

import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i:nums){
            String ans=checkNumber(i);
            if(ans.equals("Positive")){
                String check=checkValue(i);
                System.out.println(i+" is Positive and "+check);
            }else{
                System.out.println(i+" is Negative");
            }
        }

        int first=nums[0];
        int last=nums[nums.length-1];
        int ans=compare(first, last);

        if(ans>0){
            System.out.println("First is greater than last");
        }else if(ans<0){
            System.out.println("First is smaller tha last");
        }else{
            System.out.println("Both are equal");
        }
    }
    public static String checkNumber(int i){
        return i>=0?"Positive":"Negative";
    }
    public static String checkValue(int n){
        return n%2==0?"Even":"Odd";
    }

    public static int compare(int n1,int n2){
        if(n1>n2){
            return 1;
        }else if(n1<n2){
            return -1;
        }
        return 0;
    }
}
