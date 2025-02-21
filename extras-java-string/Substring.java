import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1=sc.nextLine();
        sc.close();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' ') continue;
            String s=calculateSubstring(s1,i);
            System.out.println(s+" ");
        }
    }
    public static String calculateSubstring(String s1,int i){
        return s1.substring(0,i+1);
    }
}
