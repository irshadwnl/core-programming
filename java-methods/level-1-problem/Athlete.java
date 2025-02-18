
import java.util.*;
public class Athlete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side (in meters): ");
        int side1=sc.nextInt();
        System.out.print("Enter the second side (in meters): ");
        int side2=sc.nextInt();
        System.out.print("Enter the third side (in meters): ");
        int side3=sc.nextInt();
        int  distance=5000;
        int ans=calculateRound(side1, side2, side3, distance);
        System.out.println("Total round to complete 5km is :"+ans +" round");

    }
    static int calculateRound(int side1,int side2,int side3,int distance){
        int perimeterOfTriangle=side1+side2+side3;
        int rounds=distance/perimeterOfTriangle;
        return rounds;
    }
}
