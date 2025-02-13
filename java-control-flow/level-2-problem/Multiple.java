
/*  Create a program to find all the
 multiple of a number taken as user input below 100 (Solution by Irshad)*/



import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=100;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
