/*Extend or Create a UnitConvertor utility class similar
 to the one shown in the notes to do the following.
 Please define static methods for all the UnitConvertor
  class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) (Solution By Irshad) */

import java.util.Scanner;
public class UnitConverter3 {
    public static double convertFarToCel(double farhenheit){
        return ((farhenheit - 32)*5)/9;
    }
    public static double convertCelToFar(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKg(double pounds){
        return pounds*0.453592;
    }

    public static double convertKgToPound(double kg){
        return kg*2.20462;
    }

    public static double convertGallonsToLiters(double gallons){
        return gallons* 3.78541;
    }

    public static double convertLitersToGallons(double liters){
        return liters*0.264172;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value in Farheinheit: ");
        double farhenheit=sc.nextDouble();
        double farhenheitToCelsius=convertFarToCel(farhenheit);
        System.out.println(farhenheit+" fahrenheit is equal to "+farhenheitToCelsius+" Celsius");
        
        System.out.print("Enter the value in Celsius: ");
        double celsius=sc.nextDouble();
        double celToFar=convertCelToFar(celsius);
        System.out.println(celsius+" celsius is equal to "+celToFar+" Farhenheit");
        
        System.out.print("Enter the value in Pounds: ");
        double pounds=sc.nextDouble();
        double poundToKg=convertPoundsToKg(pounds);
        System.out.println(pounds+" pounds is equal to "+poundToKg+" Kilograms");

        System.out.print("Enter the value in Kilograms: ");
        double kg=sc.nextDouble();
        double kgToPound=convertKgToPound(kg);
        System.out.println(kg+" Kilogram is equal to "+kgToPound+" Pound");

        System.out.print("Enter the value in Gallons: ");
        double g=sc.nextDouble();
        double gToLtr=convertGallonsToLiters(g);
        System.out.println(g+" Gallons is equal to "+gToLtr+" liters");

        System.out.print("Enter the value in Liters: ");
        double l=sc.nextDouble();
        double ltrToGallons=convertLitersToGallons(l);
        System.out.println(l+" Liters is equal to "+ltrToGallons+" Gallons");

    }
}
