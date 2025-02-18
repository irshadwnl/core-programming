/*Write a program Quadratic to find the roots of the equation
 ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
 (Solution By Irshad)
 */

import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double roots[]=calculateRoot(a,b,c);
        if(roots.length == 0){
            System.out.println("The equation have no roots.");
        }else if (roots.length == 1) {
            System.out.println("The equation have one root: " + roots[0]);
        } else {
            System.out.println("The equation have two roots: " + roots[0] + " and " + roots[1]);
        }
    }

    public static double[] calculateRoot(double a,double b,double c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};
        }
    }
}
