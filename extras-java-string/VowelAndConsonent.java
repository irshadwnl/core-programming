import java.util.Scanner;

public class VowelAndConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        int arr[]=countVowelConsonent(s);
        System.out.println("Vowels are: "+arr[0]+ " Consonent are: "+arr[1]);
    }

    private static int[] countVowelConsonent(String s) {
        int cntVowel=0;
        int cntConsonent=0;
        for(char ch:s.toCharArray()){
            if(ch !=' '){
                if("aeiouAEIOU".indexOf(ch) !=-1){
                    cntVowel++;
                }else{
                    cntConsonent++;
                }
            }else{
                continue;
            }
        }
        return new int[]{cntVowel,cntConsonent};
    }
}
