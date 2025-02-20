import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        // System.out.println(text.substring(6, 0));
        generateException(text);
    }
    private static void generateException(String s) {
        try {
            System.out.println(s.substring(6, 0));
        } catch (Exception e) {
            System.out.println("caught Illegal Argument exception "+ e.getMessage());
        }
      }
}
