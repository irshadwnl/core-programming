
/*Create a program to print odd and even numbers 
between 1 to the number entered by the user. (Solution by Irshad) */


import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println("The number "+i+" is "+"Even");
            }else{
                System.out.println("The number "+i+" is "+"Odd");
            }
        }
    }
}
