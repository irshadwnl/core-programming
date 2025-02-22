import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int randomNumber =(int)(Math.random()*100)+1;
        while(true){
        System.out.print("Enter Your Guess: ");
        int n=sc.nextInt();
            if(n>randomNumber){
                System.out.println("Too High Enter Low Number!!");
            }else if(n<randomNumber){
                System.out.println("Too Low Enter High Number!!");
            }else{
                System.out.print("Hurray You Won !!!");
                break;
            }
        }
    }
}
