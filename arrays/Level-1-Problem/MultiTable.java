import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);   
      System.out.print("Enter the value from 6 to 9: ");
      int n=sc.nextInt();
      if(n>5 && n<10){
      int mul[]=new int[10];
      for(int i=1;i<=10;i++){
        mul[i-1]=n*i;
      }
      for(int i=0;i<mul.length;i++){
        System.out.println(n+" * " +(i+1)+" = "+mul[i]);
      }
    }else{
      System.out.println("Invalid input");
    }
    }
}