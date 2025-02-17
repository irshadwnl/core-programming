
/*Create a program to find the youngest friends among 3 Amar,
 Akbar, and Anthony based on their ages and the tallest among 
 the friends based on their heights (Solution by Irshad)
 */

import java.util.*;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[3];
        int height[]=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter the age: ");
            age[i]=sc.nextInt();
            System.out.print("Enter the Height: ");
            height[i]=sc.nextInt();
        }
        String arr[]={"Amar","Akbar","Anthony"};
        String youngest=arr[0];
        String tallest=arr[0];
        int smidx=age[0];
        int largeidx=height[0];
        for(int i=1;i<3;i++){
            if(age[i]<smidx){
                smidx=age[i];
                youngest=arr[i];
            }
            if(height[i]>largeidx){
                largeidx=height[i];
                tallest=arr[i];
            }
        }
        System.out.println("The youngest friend is: " + youngest + " with age " + smidx);
        System.out.println("The tallest friend is: " + tallest + " with height " + largeidx);
        
    }
}
