import java.util.Scanner;

public class TextIntoWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.nextLine();
        sc.close();
        int cnt=findLength(s);
        String word[][]=splitWords(s, cnt);
        System.out.println("Word Length");
        for(int i=0;i<word.length;i++){
            System.out.println(word[i][0]+" "+word[i][1]);
        }
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

    private static String[][] splitWords(String s,int cnt) {
        int wc=1;
        for(int i=0;i<cnt;i++){
            if(s.charAt(i)==' '){
                wc++;
            }
        }
        String word[][]=new String[wc][2];
        String temp="";
        int idx=0;
        for(int i=0;i<cnt;i++){
            if(s.charAt(i)==' '){
                word[idx][0]=temp;
                word[idx][1]=String.valueOf(temp.length());
                idx++;
                temp="";
            }else{
                temp+=s.charAt(i);
            }
        }
        word[idx][0]=temp;
        word[idx][1]=String.valueOf(temp.length());
        return word;
    }
}
