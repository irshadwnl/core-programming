import java.util.Scanner;

public class ConvertToUppercase {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String upper = convertToUpperCase(s);
    System.out.println("UpperCase value: " + upper);
    String lower=upper.toLowerCase();
    boolean comp = compare(s, lower);
    if(comp){
        System.out.println("Both are equal");
    }
  }

  private static boolean compare(String s, String upper) {
    // TODO Auto-generated method stub
    return s.equals(upper);
  }

  private static String convertToUpperCase(String s) {
    String ans = "";
    // TODO Auto-generated method stub
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      ans += (char) (ch - 32);
    }
    return ans;
  }
}
