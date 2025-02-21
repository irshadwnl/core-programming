import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1: ");
        String s1=sc.nextLine();
        System.out.print("Enter String2: ");
        String s2=sc.nextLine();
        sc.close();
        String ans=compareTwoString(s1,s2);
        System.out.println(ans);
    }

    private static String compareTwoString(String s1, String s2) {
        int n=Math.min(s1.length(), s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)<s2.charAt(i)){
                return s1 +" comes before "+s2 +" in lexicographical order";
            }else if(s1.charAt(i)>s2.charAt(i)){
                return s2 +" comes before "+s1 +" in lexicographical order";
            }
        }
        if(s1.length()<s2.length()){
            return s1 +" comes before "+s2 +" in lexicographical order";
        }else if(s1.length()>s2.length()){
            return s2 +" comes before "+s1 +" in lexicographical order";
        }
        return s1+" and "+s2+" Both are same";
    }
}
