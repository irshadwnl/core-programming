import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int cnt=countDigit(n);
        int digit[]=storeDigit(cnt,n);
        int sum=findSum(digit);
        int sumOfSq=findSumOfSquare(digit);
        boolean harshadNumber=isHarshadNumber(n,digit);
        int freq[][]=countfrequency(digit);
        displayAll(n,cnt,digit,sum,sumOfSq,harshadNumber,freq);
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
    public static int findSum(int digit[]){
        int sum=0;
        for(int i:digit){
            sum+=i;
        }
        return sum;
    }
    public static int findSumOfSquare(int digit[]){
        int sum=0;
        for(int i:digit){
            sum+=Math.pow(i, 2);
        }
        return sum;
    } 
    public static int[][] countfrequency(int digit[]){
        int freq[][]=new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }
        for(int i:digit){
            freq[i][1]++;
        }
        return freq;
    }
    public static boolean isHarshadNumber(int n,int digit[]){
        int sum=0;
        for(int i:digit){
            sum+=i;
        }
        return n%sum==0;
    }

    public static void displayAll(int n,int cnt,int digit[],int sum , int sumOfSq,boolean harshadNumber,int freq[][]){
        System.out.println("Digit count is: "+cnt);
        System.out.println(Arrays.toString(digit));
        System.out.println("Digit sum is: "+sum);
        System.out.println("Sum of sqaure of its digit are: "+sumOfSq);
        if(harshadNumber){
            System.out.println(n+" is a Harshad Number");
        }else{
            System.out.println(n+" is not a Harshad Number");
        }
        for(int f[]:freq){
            if(f[1]>0){
                System.out.println("Digit "+f[0]+" frequency is "+f[1]);
            }
        }

    }
}
