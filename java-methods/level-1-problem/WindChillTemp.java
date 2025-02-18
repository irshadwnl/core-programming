
//Write a program calculate the wind chill temperature given the temperature and wind speed


import java.util.Scanner;

public class WindChillTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp=sc.nextDouble();
        System.out.print("Enter the Wind speed: ");
        double windSpeed=sc.nextDouble();
        double ans=calculateWindChill(temp,windSpeed);
        System.out.printf("Wind Chill Temperature is: %.2f",ans);
    }
    public static double calculateWindChill(double temp, double windSpeed){
        return 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16);

    }
}
