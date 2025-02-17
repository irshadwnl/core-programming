
/*Create a program to take input marks of students in
 3 subjects physics, chemistry, and maths. Compute 
 the percentage and then calculate the grade  as per
  the following guidelines (Solution by Irshad)
 */

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        int c[]=new int[n];
        int m[]=new int[n];
        double percentage[]=new double[n];
        int marks[]=new int[n];
        char grades[]=new char[n];

        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
            c[i]=sc.nextInt();
            m[i]=sc.nextInt();
            percentage[i]=(p[i]+c[i]+m[i])/3.0;
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
            System.out.printf("\n%-10d %-10d %-10d %-10.2f %-10c",p[i], c[i], m[i], percentage[i], grades[i]);
        }
    }
}
