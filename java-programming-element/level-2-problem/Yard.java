
// Write a program the find the distance in yards and miles for the distance provided by user in feets


import java.util.Scanner;

public class Yard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double distanceInFeet=sc.nextDouble();
        double heightincm=distanceInFeet*30.48;
        double heightinInches=distanceInFeet*12;
        System.out.println("Your height in cm is "+heightincm+" while in feet is "+distanceInFeet+" and inches is "+heightinInches);
    }
}
