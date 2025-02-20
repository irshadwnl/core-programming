
import java.util.Scanner;


/*Find unique characters in a string using the charAt() 
method and display the result (Solution by Irshad)
 */

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int cnt=findLength(s);
        char arr[]=findUniqueCharacter(s);
        for(char ch:arr){
            if(ch !=' '){
                System.out.print(ch+" ");
            }
        }
    }
    private static int findLength(String s) {
        int cnt=0;
        for(int i=0;i<Integer.MAX_VALUE;i++){
            try {
                char ch=s.charAt(i);
                cnt++;
            } catch (Exception e) {
                // TODO: handle exception
                // System.out.println("Caught exception exitting!!"+e.getMessage());
                break;
            }
        }
        return cnt;
    }

    private static char[] findUniqueCharacter(String s) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean check=false;
            for(int j=i;j<s.length();j++){
                if(i!=j && ch==s.charAt(j)){
                    check=true;
                    break;
                }
            }
            if(check==false){
                arr[i]=ch;
            }
        }
        return arr;

    }
}
