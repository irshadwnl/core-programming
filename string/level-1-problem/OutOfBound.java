import java.util.Scanner;

public class OutOfBound {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    // generateException(s);
    handleException(s);
  }

  private static void handleException(String s) {
    try {
        System.out.println(s.charAt(s.length()));
    } catch (Exception e) {
        System.out.println("caught String index out of bound exception "+ e.getMessage());
    }
  }

  private static void generateException(String s) {
    System.out.println(s.charAt(s.length()));
  }
}
