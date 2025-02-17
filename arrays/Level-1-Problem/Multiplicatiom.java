
// Create a program to print a multiplication table of a number.

import java.util.Arrays;
import java.util.Scanner;

public class Multiplicatiom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        for(int i=1;i<=10;i++){
            arr[i-1]=n*i;
        }
        // System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            System.out.println(n +" * " +(i+1)+ " = "+arr[i]);
        }

    }
}
