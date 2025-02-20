
import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String trimmed=trim(s);
        System.out.println(trimmed);
    }

    private static String trim(String s) {
        String t="";
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int j=s.length()-1;
        while(j>=i && s.charAt(j)==' '){
            j--;
        }
        for(int k=i;k<=j;k++){
            t+=s.charAt(k);
        }
        return t;
    }
}
