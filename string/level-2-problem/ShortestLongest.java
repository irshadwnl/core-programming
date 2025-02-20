import java.util.Scanner;

public class ShortestLongest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.nextLine();
        sc.close();
        int cnt=findLength(s);
        String word[][]=splitWords(s, cnt);
        int ans[]=findShortestLongest(word);
        System.out.println("Shortest length is:"+ans[0]);
        System.out.println("Longest length is:"+ans[1]);
    }
    private static int findLength(String s) {
        int cnt=0;
        for(int i=0;i<Integer.MAX_VALUE;i++){
            try {
                char ch=s.charAt(i);
                cnt++;
            } catch (Exception e) {
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

    private static int[] findShortestLongest(String[][] word) {
        int shortest=Integer.MAX_VALUE;
        int longest=Integer.MIN_VALUE;
        for(int i=0;i<word.length;i++){
            String len=word[i][1];
            if(Integer.parseInt(len)<shortest){
                shortest=Integer.parseInt(len);
            }
            if(Integer.parseInt(len)>longest){
                longest=Integer.parseInt(len);
            }
        }
        return new int[]{shortest,longest};
    }
}
