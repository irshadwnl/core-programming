import java.util.Scanner;

public class ConverToLowerCase {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String lower = convertToLowerCase(s);
    System.out.println("Lowercase value: " + lower);
    String upper = lower.toUpperCase();
    boolean comp = compare(s, upper);
    if (comp) {
      System.out.println("Both are equal");
    }
  }

  private static boolean compare(String s, String upper) {
    // TODO Auto-generated method stub
    return s.equals(upper);
  }

  private static String convertToLowerCase(String s) {
    String ans = "";
    // TODO Auto-generated method stub
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      ans += (char) (ch + 32);
    }
    return ans;
  }
}
