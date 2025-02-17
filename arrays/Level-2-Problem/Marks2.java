/*Rewrite the above program to store the marks of the students
 in physics, chemistry, and maths in a 2D array and then compute
  the percentage and grade (Solution by Irshad)
 */

import java.util.Scanner;

public class Marks2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double marks[][]=new double[n][3];
        double percentage[]=new double[n];
        char grades[]=new char[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter Physics Marks: ");
            marks[i][0]=sc.nextDouble();
            System.out.print("Enter Chemistry Marks: ");
            marks[i][1]=sc.nextDouble();
            System.out.print("Enter Math Marks: ");
            marks[i][2]=sc.nextDouble();
        }

        for(int  i=0;i<n;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            if(percentage[i]>80){
                grades[i]='A';
            }else if(percentage[i]>=70 && percentage[i] <=79){
                grades[i]='B';
            }else if(percentage[i]>=60 && percentage[i] <=69){
                grades[i]='C';
            }else if(percentage[i]>=50 && percentage[i] <=59){
                grades[i]='D';
            }else if(percentage[i]>=40 && percentage[i] <=49){
                grades[i]='E';
            }else{
                grades[i]='R';
            }
        }
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s","Physics","Chemistry","Maths","Percentage","Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%-10.2f %-10.2f %-10.2f %-10.2f %-10c",marks[i][0],marks[i][1],marks[i][2],percentage[i], grades[i]);
        }
    }
}
