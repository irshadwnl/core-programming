/*Create a program to find the maximum number of handshakes 
among N number of students.
 */
import java.util.*;
public class HandShake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfStudents=sc.nextInt();
        int handshake=noOfHandShakes(noOfStudents);
        System.out.println("The no of possible handshakes: "+handshake);

    }
    static int noOfHandShakes(int noOfStudents){
        int ans=(noOfStudents*(noOfStudents-1))/2;
        return ans;
    }
}
