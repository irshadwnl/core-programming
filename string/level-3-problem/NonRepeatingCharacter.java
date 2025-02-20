
import java.util.Scanner;

public  class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.next();
        char ans=findNonReapeating(s);
        System.out.println("First non repeating character is: "+ans);
    }

    private static char findNonReapeating(String s) {
        int freq[]=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '\0';
    }
}