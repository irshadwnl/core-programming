
import java.util.Arrays;
import java.util.Scanner;

public class SplitWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        int cnt=findLength(s);
        String word[]=countWords(s,cnt);
        System.out.println(Arrays.toString(word));
    }
    private static int findLength(String s) {
        int cnt=0;
        for(int i=0;i<Integer.MAX_VALUE;i++){
            try {
                char ch=s.charAt(i);
                cnt++;
            } catch (Exception e) {
                // TODO: handle exception
                // System.out.println(cnt);
                // System.out.println("Caught exception exitting!!"+e.getMessage());
                break;
            }
        }
        return cnt;
    }

    private static String[] countWords(String s,int cnt) {
        int wc=1;
        for(int i=0;i<cnt;i++){
            if(s.charAt(i)==' '){
                wc++;
            }
        }
        String word[]=new String[wc];
        String temp="";
        int idx=0;
        for(int i=0;i<cnt;i++){
            if(s.charAt(i)==' '){
                word[idx]=temp;
                idx++;
                temp="";
            }else{
                temp+=s.charAt(i);
            }
        }
        word[idx]=temp;
        return word;
    }
}
