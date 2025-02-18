/*Create a program to find the factors of a number taken as user input,
 store the factors in an array, and display the factors. Also find the
 sum, sum of square of factors and product of the factors and display 
 the results (Solution by Irshad)
 */


import java.util.Arrays;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int ans[]=findFactor(n);
        int sum=findSum(ans);
        int sq=findSumOfSq(ans);
        int prod=findProducts(ans);

        System.out.println("The Factors are: "+Arrays.toString(ans));
        System.out.println("The sum of its factors are: "+sum);
        System.out.println("The sum of factor of its square are: "+sq);
        System.out.println("Product of its Factors are: "+prod);
    }
    public static int[] findFactor(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        int temp[]=new int[cnt];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                temp[idx]=i;
                idx++;
            }
        }
        return temp;
    }
    public static int findSum(int ans[]){
        int sum=0;
        for(int i:ans){
            sum+=i;
        }
        return sum;
    }
    public static int findSumOfSq(int ans[]){
        int sum=0;
        for(int i:ans){
            sum+=Math.pow(i, 2);
        }
        return sum;
    }
    public static int findProducts(int ans[]){
        int pro=1;
        for(int i:ans){
            pro*=i;
        }
        return pro;
    }
}
