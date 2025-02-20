
import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.next();
        int cnt=findLength(s);
        System.out.println("Length of string "+s+" is "+cnt);
    }

    private static int findLength(String s) {
        int cnt=0;
        for(int i=0;i<Integer.MAX_VALUE;i++){
            try {
                char ch=s.charAt(i);
                cnt++;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Caught exception exitting!!"+e.getMessage());
                break;
            }
        }
        return cnt;
    }

}
