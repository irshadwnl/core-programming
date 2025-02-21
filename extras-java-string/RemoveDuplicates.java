import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        sc.close();
        String ans=RemoveDuplicates(s);
        System.out.println(ans);
    }

    private static String RemoveDuplicates(String s) {
        int freq[]=new int[26];
        String ans="";
        for(char ch:s.toCharArray()){
            if(freq[ch-'a']==0){
                freq[ch-'a']++;
                ans+=ch;
            }
        }
       return ans;
    }
}
