import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        sc.close();
        String ans=findLongestWord(s);
        System.out.println(ans);
    }

    private static String findLongestWord(String s) {
        String arr[]=s.split(" ");
        String longesWord="";
        for(String word:arr){
            if(word.length()>longesWord.length()){
                longesWord=word;
            }
        }
        return longesWord;
    }
}
