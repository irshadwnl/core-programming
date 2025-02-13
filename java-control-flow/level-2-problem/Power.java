
// Create a program to find the power of a number (Solution by Irshad).


import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        int res=1;
        for(int i=1;i<=power;i++){
            res=res*num;
        }
        System.out.println(num+" to the Power "+power+" is "+res);
    }
}
