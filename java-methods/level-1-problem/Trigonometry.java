import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter angle: ");
        double angle=sc.nextDouble();
        double ans[]=calulateTrigonometry(angle);
        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + ans[0]);
        System.out.println("Cosine: " + ans[1]);
        System.out.println("Tangent: " + ans[2]);
    }
    public static double[] calulateTrigonometry(double angle){
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sin, cosine, tangent};
    }
}
