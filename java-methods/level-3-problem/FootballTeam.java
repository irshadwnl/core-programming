import java.util.Arrays;

public class FootballTeam {
    public static void main(String[] args) {
        double height[]=new double[11];
        for(int i=0;i<11;i++){
            height[i]=get3DigitRandomNumber();
        }
        double sum=calculateSum(height);
        double meanHeight=calculateMeanHeight(sum,height);
        double shortest=calculateShortestHeight(height);
        double tallest=calculateTallestHeight(height);

        System.out.println(Arrays.toString(height));

        displayAll(sum,meanHeight,shortest,tallest);
    }
    public static int get3DigitRandomNumber(){
        return (int)(Math.random()*101+150);
    }
    public static double calculateSum(double height[]){
        double sum=0;
        for(double d:height){
            sum+=d;
        }
        return sum;
    }
    public static double calculateMeanHeight(double sum,double height[]){
        return sum/height.length;
    }
    public static double calculateShortestHeight(double height[]){
        double shortest=Integer.MAX_VALUE;
        for(double d:height){
            shortest=Math.min(shortest,d);
        }
        return shortest;
    }

    public static double calculateTallestHeight(double height[]){
        double tall=Integer.MIN_VALUE;
        for(double d:height){
            tall=Math.max(tall,d);
        }
        return tall;
    }

    public static void displayAll(double sum,double meanHeight,double shortest,double tallest){
        System.out.println("Sum of its element are: "+sum);
        System.out.println("Mean Heightis: "+meanHeight);
        System.out.println("Shortes is: "+shortest);
        System.out.println("Tallest is: "+tallest);
    }
}
