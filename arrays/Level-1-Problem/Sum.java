
/*Write a program to store multiple values in an array up 
to a maximum of 10 or until the user enters a 0 or a
 negative number. Show all the numbers as well as the 
 sum of all numbers. (Solution by Irshad)
 */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[10];
        int idx=0;
        double sum=0.0;
        while(true){
            double d=sc.nextDouble();
            if(d<=0){
                break;
            }
            if(idx==9){
                break;
            }
            arr[idx]=d;
            idx++;
        }
        for(double d:arr){
            System.out.print(d+" ");
        }
        
    }
}
