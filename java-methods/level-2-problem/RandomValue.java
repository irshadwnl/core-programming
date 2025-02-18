import java.util.Arrays;

public class RandomValue {

  public static void main(String[] args) {
    int nums[] = get4DigitRandomNumber();
    double[] ans=findAverageMinMax(nums);
    
    System.out.println(Arrays.toString(nums));
    System.out.println("Average is: "+ans[0]);
    System.out.println("Minimum is: "+ans[1]);
    System.out.println("Maximum is: "+ans[2]);
  }

  public static int[] get4DigitRandomNumber() {
    int nums[]=new int[5];
    for (int i = 0; i < 5; i++) {
        nums[i] = (int) (Math.random() * 9000) + 1000;
      }
    return nums;
  }
  public static double[] findAverageMinMax(int[] nums){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i:nums){
            max=Math.max(max, i);
            min=Math.min(min, i);
            sum+=i;
        }
        double avg=sum/5;
        return new double[]{avg,min,max};
  }
}
