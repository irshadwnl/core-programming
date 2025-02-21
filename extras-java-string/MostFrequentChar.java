import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        sc.close();
        char ans=mostFrequentCharacter(s);
        System.out.println("Most Frequent Character: "+ans);
    }

    private static char mostFrequentCharacter(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int maxidx=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(arr[i]>maxidx){
                maxidx=i;
            }
        }
        return (char)(maxidx+97);
    }
}
