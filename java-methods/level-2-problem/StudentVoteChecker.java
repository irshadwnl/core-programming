/*Write a program to take user input for the age of all 10 students in a class and check whether the student 
can vote depending on his/her age is greater or equal to 18.(Solution By  Irshad) */
import java.util.Scanner;
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 10;
        int age[]=new int[n];
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean canVote=canStudentVote(age[i]);
            if(canVote){
                System.out.println(i+" Can Vote");
            }else{
                System.out.println(i+" Cannot Vote");
            }
        }
    }
    public static boolean canStudentVote(int age){
        if(age<=0){
            return false;
        }else if(age<18){
            return false;
        }
        return true;
    }
}
