
/*Working with Multi-Dimensional Arrays. 
Write a Java program to create a 2D Array
 and Copy the 2D Array into a single dimension array
 (Solution BY Irshad).
 */

import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr2d[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        int arr[]=new int[rows*cols];
        int idx=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[idx]=arr2d[i][j];
                idx++;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
