import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        sc.close();
        boolean ans=checkPalindrome(s);
        if(ans){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is not Palindrome");
        }
    }
    private static boolean checkPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
