import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        sc.close();
        String ans=toggleString(s);
        System.out.println(ans);
    }

    private static String toggleString(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                ans+=Character.toLowerCase(ch);
            }else{
                ans+=Character.toUpperCase(ch);
            }
        }
        return ans;
    }
}
