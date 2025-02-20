
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1: ");
        String s1=sc.next(); 
        System.out.print("Enter String2: ");
        String s2=sc.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        boolean ans=checkAnagram(s1,s2);
        if(ans){
            System.out.println(s1+" and "+s2+" are anagrams");
        }else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    private static boolean checkAnagram(String s1, String s2) {
        int freq[]=new int[26];
        if(s1.length() != s2.length()) return false;
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
        for(int i:freq){
            if(i!=0){
                return false;
            }
        }
        return  true;
    }
}
