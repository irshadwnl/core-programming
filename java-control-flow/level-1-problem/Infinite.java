
// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement (Solution by Irshad).


import java.util.Scanner;

public class Infinite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        double sum=0;
        while(true){
            if(d<=0){
                break;
            }
            sum+=d;
            d=sc.nextDouble();
        }
        System.out.println("Sum is "+sum);
    }
}
