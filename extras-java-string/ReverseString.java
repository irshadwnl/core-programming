
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        String ans=ReverseString(s);
        System.out.println("Reverse String is: "+ans);
    }

    private static String ReverseString(String s) {
        String str="";
        int idx=0;
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
            idx++;
        }
        return str;
    }

}
