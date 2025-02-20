import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine(); 
        String[] result = findCharacterFrequency(input); 
        for (String entry : result) {
            if (entry != null) { 
                System.out.println(entry);
            }
        }
    }

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); 
        int[] freq = new int[text.length()]; 
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; 
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++; 
                    chars[j] = '0';
                }
            }
        }
        String[] result = new String[text.length()];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { 
                result[index++] = chars[i] + " - " + freq[i];
            }
        }

        return result;
    }
}
