
/*
 Write a LeapYear program that takes a year as input
  and outputs the Year is a Leap Year or not a Leap Year (Solution by Irshad). 
 */


import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (year % 4 == 0) {
      if (year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " is Leap Year");
      }else{
        System.out.println("Not a Leap year");
    }
    }else{
        System.out.println("Not a Leap year");
    }
  }
}
