
// Create a program to convert distance in kilometers to miles.


// package AssignmentWeek1.Day1;
import java.util.*;
public class DistanceToKm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int km=sc.nextInt();
        double miles=km*1.6;
        System.out.println("The total miles is "+miles+" for the given "+km+" km");
    }
}
