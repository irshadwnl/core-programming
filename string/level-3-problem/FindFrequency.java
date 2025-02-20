
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans[][]=FindFrequency(s); 
        System.out.println("Character Frequencies:");
        for (int[] pair : ans) {
            System.out.println((char) pair[0] + " : " + pair[1]);
        }
    }

    private static int [][]FindFrequency(String s) {
        int arr[]=new int[256];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        int cnt=0;
        for(int i:arr){
            if(i>0){
                cnt++;
            }
        }
        int ans[][]=new int[cnt][2];
        int idx=0;
        for(int i=0;i<256;i++){
            if(arr[i]>0){
                ans[idx][0]=i;
                ans[idx][1]=arr[i];
                idx++;
            }
        }
        return ans;
    }
}
