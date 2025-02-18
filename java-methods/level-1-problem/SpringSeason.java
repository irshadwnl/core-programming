import java.util.*;

public class SpringSeason {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int day = sc.nextInt();
    checkSpringSeason(month, day);
  }

  public static void checkSpringSeason(int month, int day) {
    if (day <= 31 && day >= 1 && month >=1 && month<=12 ) {
      if (month >= 3 && month <= 5) {
        System.out.println("Its a Spring Season");
      } else if (month == 6 && day >= 1 && day <= 20) {
        System.out.println("Its Spring Season");
      } else {
        System.out.println("Not a Spring season");
      }
    } else {
      System.out.println("Invalid Input");
    }
  }
}
