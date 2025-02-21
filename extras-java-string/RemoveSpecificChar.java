import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        System.out.println("Characters to remove");
        char ch=sc.next().charAt(0);
        sc.close();
        String ans=removeSpecificCharacter(s,ch);
        System.out.println("Words after removing specific charcter: "+ans);
    }

    private static String removeSpecificCharacter(String s, char ch) {
        String ans="";
        for(char dh:s.toCharArray()){
            if(dh!=ch){
                ans+=dh;
            }
        }
        return ans;
    }
}
