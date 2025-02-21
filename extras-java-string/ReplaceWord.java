import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        System.out.print("Enter word to be replaced:");
        String wordToBeReplaced=sc.next();
        System.out.print("Enter word which you want to replace: ");
        String wordToReplace=sc.next();
        sc.close();
        String ans=replaceWord(s,wordToBeReplaced,wordToReplace);
        System.out.println(ans);
    }

    private static String replaceWord(String s, String wordToBeReplaced, String wordToReplace) {
        String ans="";
        String words[]=s.split(" ");
        for(String word:words){
            if(word.equals(wordToBeReplaced)){
                ans+=wordToReplace+" ";
            }else{
                ans+=word+" ";
            }
        }
        return ans.trim();
    }
}
