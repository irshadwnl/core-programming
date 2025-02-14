import java.util.*;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        int res1=a+b*c;
        int res2=a*b+c;
        int res3=c+(a/b);
        int res4=(a%b)+c;
        System.out.println("Result is:"+res1);
        System.out.println("Result is:"+res2);
        System.out.println("Result is:"+res3);
        System.out.println("Result is:"+res4);

    }
}
