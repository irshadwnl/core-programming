
import java.util.Scanner;

public class findVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        String ans[][]=findVowelsConstant(s);
        System.out.printf("%-10s %-10s%n", "Character", "Type");
        for (String[] row : ans) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    private static String[][] findVowelsConstant(String s) {
        String ans[][]=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String type=checkType(ch);
            ans[i][0]=String.valueOf(ch);
            ans[i][1]=type;
        }
        return ans;
    }

    private static String checkType(char ch) {
        char character=Character.toLowerCase(ch);
        if (character >= 'a' && character <= 'z') {
            if ("aeiou".indexOf(character) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
}
