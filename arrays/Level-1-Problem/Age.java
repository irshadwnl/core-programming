import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[10];
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i:age){
            if(i>=18){
                System.out.println("the student with the age "+i+" can vote");
            }else if(i>0 && i<18){
                System.out.println("the student with the age "+i+" can not vote");
            }else{
                System.out.println("Invalid Age");
            }
        }
    }
}
