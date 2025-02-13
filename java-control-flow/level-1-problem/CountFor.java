
/*Rewrite program 8 to do the countdown using the for-loop (Solution by Irshad) */


import java.util.Scanner;

public class CountFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cnt=sc.nextInt();
        for(int i=cnt;i>0;i--){
            System.out.println(i);
        }
    }
}
