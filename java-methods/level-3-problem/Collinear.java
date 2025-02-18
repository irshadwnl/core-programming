import java.util.Scanner;
public class Collinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1=sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1=sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2=sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2=sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3=sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3=sc.nextDouble();
        boolean collinear=isCollinearBySlope(x1,y1,x2,y2,x3,y3);
        boolean collinearByArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Using Slope Method: " + (collinear ? "The points are collinear." : "The points are not collinear."));
        System.out.println("Using Area Method: " + (collinearByArea ? "The points are collinear." : "The points are not collinear."));
    }

    public static boolean isCollinearBySlope(double x1,double y1,double x2,double y2,double x3,double y3){
        double ab=(y2-y1)/(x2-x1);
        double bc=(y3-y2)/(x3-x2);
        double ac=(y3-y1)/(x3-x1);
        if(ab==bc && bc==ac){
            return true;
        }
        return false;
    }
    public static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        return area == 0;
    }
}
