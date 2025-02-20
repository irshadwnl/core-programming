import java.util.Scanner;

public class ArrayOutOfBound {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String names[] = new String[3];
    for (int i = 0; i < 3; i++) {
      names[i] = sc.next();
    }
    //this is to generate exception
    // System.out.println(names[4]);
    handleException(names);
  }

  private static void handleException(String[] names) {
    // TODO Auto-generated method stub
    try {
        System.out.println(names[4]);
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Caught Array Index out of bound exception "+e.getMessage());
    }
  }
}
