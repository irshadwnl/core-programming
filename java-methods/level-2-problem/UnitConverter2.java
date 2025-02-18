/*Extend or Create a UnitConvertor utility class similar to the one 
shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) (Solution by Irshad)
 */

import java.util.Scanner;
public class UnitConverter2 {
    static final double YARDS_2_FEET = 3;
    static final double FEET_2_YARD = 0.333333;
    static final double METER_2_INCHES = 39.3701; 
    static final double INCHES_2_METERS = 0.0254;
    static final double INCHES_2_CM = 2.54;

    public static double convertYardsToFeet(double d){
        return d*YARDS_2_FEET;
    }
    public static double convertFeetToYard(double d){
        return d*FEET_2_YARD;
    }
    public static double convertMeterToInches(double d){
        return d*METER_2_INCHES;
    }
    public static double convertInchesToMeters(double d){
        return d*INCHES_2_METERS;
    }

    public static double convertInchesToCm(double d){
        return d*INCHES_2_CM;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value: ");
        double d=sc.nextDouble();
        double yardToFeet=convertYardsToFeet(d);
        System.out.println(d+" Yard is equal to "+yardToFeet+" feet");
        double feetToYard=convertFeetToYard(d);
        System.out.println(d+" Feet is equal to "+feetToYard+" yard");
        double meterToInches=convertMeterToInches(d);
        System.out.println(d+" Meter is equal to "+meterToInches+" inches");
        double inchesToMeters=convertInchesToMeters(d);
        System.out.println(d+" inches is equal to "+" meters"); 
        double inchesToCm=convertInchesToCm(d);
        System.out.println(d+" inches is equal to "+" cm");        
    }
}
