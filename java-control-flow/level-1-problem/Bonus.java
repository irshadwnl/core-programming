
// Create a program to find the bonus of employees based on their years of service (Solution by Irshad).

import java.util.Scanner;

public class Bonus {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int yoe=sc.nextInt();
        if(yoe>5){
            int bonus=(salary*5)/100;
            System.out.println("Your Bonus is "+bonus);
        }else{
            System.out.println("No Bonus");
        }
        }
    
}
