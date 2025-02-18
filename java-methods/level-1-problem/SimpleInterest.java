/*Write a program to input the Principal, Rate, and
 Time values and calculate Simple Interest.
 */
import java.util.*;

public class SimpleInterest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal: ");
    double principal = sc.nextDouble();
    System.out.print("Enter Rate: ");
    double rate = sc.nextDouble();
    System.out.print("Enter Time: ");
    double time = sc.nextDouble();
    // SimmpleInterest sii=new SimpleInterest();
    double simpleInterest = calculateSi(principal, rate, time);
    System.out.println(
      "The simple interest is " +
      simpleInterest +
      " for principal " +
      principal +
      " rate of interest " +
      rate +
      " and Time " +
      time
    );
  }

  public static double calculateSi(double principal, double rate, double time) {
    double si = (principal * rate * time) / 100;
    return si;
  }
}
