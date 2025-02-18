import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int cnt=countDigit(n);
        int digit[]=storeDigit(cnt,n);
        int reversed[]=reverseDigit(digit);
        boolean isPalindrome=compare(digit,reversed);
        boolean isDuck=checkDucKNumber(digit);
        displayAll(n,cnt,digit,reversed,isPalindrome,isDuck);
        // System.out.println(Arrays.toString(reversed));
    }
    public static int countDigit(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static int[] storeDigit(int cnt,int n){
        int arr[]=new int[cnt];
        int idx=cnt-1;
        while(n>0){
            arr[idx]=n%10;
            n/=10;
            idx--;
        }
        return arr;
    }
    public static int[] reverseDigit(int digit[]){
        int rev[]=new int[digit.length];
        int i=0;
        int j=digit.length-1;
        while (i<=j) {
            int temp=digit[j];
            rev[j]=digit[i];
            rev[i]=temp;
            i++;
            j--;
        }
        return rev;
    }
    public static boolean compare(int digit[],int reversed[]){
        for(int i=0;i<digit.length;i++){
            if(digit[i]!=reversed[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkDucKNumber(int digit[]){
        for(int i:digit){
            if(i==0){
                return false;
            }
        }
        return true;
    }
    public static void displayAll(int n, int cnt,int digit[],int reversed[],boolean isPalindrome,boolean isDuck){
        System.out.println("Digit count is: "+cnt);
        System.out.println(Arrays.toString(digit));
        System.out.println(Arrays.toString(reversed));
        if(isPalindrome){
            System.out.println(n+" is a Palindrome");
        }else{
            System.out.println(n+" is not a Palindrome");
        }
        if (isDuck) {
            System.out.println(n+" is a Duck Number");
        }else{
            System.out.println(n+" is Not A Duck Number");
        }
    }
}
