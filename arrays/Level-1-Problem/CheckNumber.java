import java.util.*;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        for(int i:nums){
            if(i>0){
                if(i%2==0){
                    System.out.println(i+" is Even Number");
                }else{
                    System.out.println(i+" is Odd Number");
                }
            }else if(i<0){
                System.out.println(i+" is Negative");
            }else{
                System.out.println(i+" is Zero");
            }
        }
        if(nums[0]>nums[4]){
            System.out.println("First is Greater than Last");
        }else if(nums[0] <nums[4]){
            System.out.println("First is Smaller tha Last");
        }else{
            System.out.println("First and Last are Equal");
        }
    }
}
