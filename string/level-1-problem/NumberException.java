
import java.util.Scanner;

public class NumberException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.next();
        // System.out.println(Integer.parseInt(s));
        generateException(s);
    }

    private static void generateException(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("caught Number Format Exception"+e.getMessage());
        }
    }

}
