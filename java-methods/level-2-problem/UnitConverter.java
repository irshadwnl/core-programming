
/*Extend or Create a UnitConvertor utility class similar 
to the one shown in the notes to do the following. 
Please define static methods for all the 
UnitConvertor class methods. (Solution by Irshad) */

import java.util.Scanner;

public class UnitConverter {
    static final double KM_2_MILES = 0.621371;
    static final double MILES_2_KM = 1.60934;
    static final double METER_2_FEET = 3.28084;
    static final double FEET_2_METERS = 0.3048;
    public static double convertKmToMiles(double d){
        return d*KM_2_MILES;
    }
    public static double convertMilesToKm(double d){
        return d*MILES_2_KM;
    }
    public static double convertMeterToFeet(double d){
        return d*METER_2_FEET;
    }
    public static double convertFeetToMeters(double d){
        return d*FEET_2_METERS;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Distance: ");
        double d=sc.nextDouble();
        double kmToMiles=convertKmToMiles(d);
        System.out.println(d+" Kilometer is equal to "+kmToMiles +" miles");
        double milesToKm=convertMilesToKm(d);
        System.out.println(d+" Miles is equal to "+milesToKm+" kilometer");
        double meterToFeet=convertMeterToFeet(d);
        System.out.println(d+" Meter is equal to "+meterToFeet+" feet");
        double feetToMeters=convertFeetToMeters(d);
        System.out.println(d+" feet is equal to "+feetToMeters+" Meters");

        
    }
}
