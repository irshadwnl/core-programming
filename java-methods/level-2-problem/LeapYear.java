import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter year: ");
    int year = sc.nextInt();
    isLeapYear(year);
  }

  public static void isLeapYear(int year) {
    if (year >= 1582) {
      if (year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0) {
          System.out.println(year + " is Leap Year");
        } else {
          System.out.println("Not a Leap year");
        }
      } else {
        System.out.println("Not a Leap year");
      }
    } else {
      System.out.println("Invalid Input");
    }
  }
}
