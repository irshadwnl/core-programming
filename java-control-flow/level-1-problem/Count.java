
// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch (Solution by Irshad).


import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cnt=sc.nextInt();
        while(cnt >0){
            System.out.println(cnt);
            cnt--;
        }
    }
}
