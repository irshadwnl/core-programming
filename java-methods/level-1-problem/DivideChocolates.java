
import java.util.*;
public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numOfChocolates=sc.nextInt();
        System.out.print("Enter number of children: ");
        int numOfChildren=sc.nextInt();
        int ans[]=findNumOfChocolates(numOfChocolates, numOfChildren);
        System.out.println("No of Chocolates each child will get "+ans[0]);
        System.out.println("The remaining Chocolates will be "+ans[1]);
    }

    public static int[] findNumOfChocolates(int numOfChocolates,int numOfChildren){
        int val=numOfChocolates/numOfChildren;
        int rem=numOfChocolates%numOfChildren;
        return new int[]{val,rem};
    }
}
