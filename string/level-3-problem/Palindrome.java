
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.next();
        boolean ans =isPalindrome(s);
        boolean ans2=isPalindrome2(s,0,s.length()-1);
        if(ans){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is not a Palindrome");
        }
        if(ans2){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is not a Palindrome");
        }
        char arr[]=reverseString(s);
        boolean ans3=checkPalindrome(arr,s);
        if(ans3){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is not a Palindrome");
        }
    }

    private static boolean isPalindrome(String s) {
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

    private static boolean isPalindrome2(String s, int i, int j) {
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalindrome2(s, i+1, j-1);
    }

    private static char[] reverseString(String s) {
        char arr[]=new char[s.length()];
        int idx=0;
        for(int i=s.length()-1;i>=0;i--){
            arr[idx]=s.charAt(i);
            idx++;
        }
        return arr;
    }

    private static boolean checkPalindrome(char[] arr, String s) {
        if(arr.length !=s.length()){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=s.charAt(i)){
                return false;
            }
        }
        return true;
    }

   
}
