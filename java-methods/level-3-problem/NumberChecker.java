
/*Extend or Create a NumberChecker utility class and perform
 following task. Call from main() method 
 the different methods and display results.
 Make sure all are static methods (Solution by Irshad)*/


import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int cnt=countDigit(n);
        int digit[]=storeDigit(cnt,n);
        boolean isDuck=checkDucKNumber(digit);
        boolean isArmstrong=checkArmstrongNumber(n,digit);
        int largest[]=checkLargest(digit);
        int smallest[]=checkSmallest(digit);
        displayAll(n,cnt,digit,isDuck,isArmstrong,largest,smallest);
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
    public static boolean checkDucKNumber(int digit[]){
        for(int i:digit){
            if(i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean checkArmstrongNumber(int n,int digit[]){
        int sum=0;
        for(int i:digit){
            sum+=Math.pow(i, 3);
        }
        return sum==n;
    }

    public static int[] checkLargest(int digit[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i:digit){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }else if(i>secondLargest && secondLargest !=largest){
                secondLargest=i;
            }
        }
        return new int[]{largest,secondLargest};
    }
    public static int[] checkSmallest(int digit[]){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i:digit){
            if(i<smallest){
                secondSmallest=smallest;
                smallest=i;
            }else if(i<secondSmallest && secondSmallest !=smallest){
                secondSmallest=i;
            }
        }
        return new int[]{smallest,secondSmallest};
    }
    public static void displayAll(int n,int cnt,int digit[],boolean isDuck,boolean isArmstrong,int largest[],int smallest[]){
        System.out.println("The digit count is: "+cnt);
        System.out.println(Arrays.toString(digit));
        if(isDuck){
            System.out.println(n+" is a Duck Number");
        }else{
            System.out.println(n+" is not a Duck Number");
        }

        if(isArmstrong){
            System.out.println(n+" is an ArmStrong Number");
        }else{
            System.out.println(n+" is not an Armstrong Number");
        }

        System.out.println("Largest digit is "+largest[0]+" and second largest digit is "+largest[1]);
        System.out.println("smallest digit is "+smallest[0]+" and second smallest digit is "+smallest[1]);
    }
}
