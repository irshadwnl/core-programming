
import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[3];
        int height[]=new int[3];
        String arr[]={"Amar","Akbar","Anthony"};
        for(int i=0;i<3;i++){
            System.out.print("Enter "+arr[i]+" age: ");
            age[i]=sc.nextInt();
            System.out.print("Enter "+arr[i]+" height: ");
            height[i]=sc.nextInt();
        }
        int youngest=checkYoungest(age);
        int tallest=checkTallest(height);
        System.out.println("Youngest among them is "+arr[youngest]+" whose age is "+age[youngest]);
        System.out.println("Tallest among them is "+arr[tallest]+" whose height is "+height[tallest]);
    }
    public static int checkYoungest(int age[]){
        int young=age[0];
        for(int i=1;i<3;i++){
            if(age[i]<young){
                young=i;
            }
        }
        return young;
    }
    public static int checkTallest(int height[]){
        int tall=height[0];
        for(int i=1;i<3;i++){
            if(height[i]>tall){
                tall=i;
            }
        }
        return tall;
    }
}
