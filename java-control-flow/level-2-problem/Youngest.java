
/*Create a program to find the youngest friends among 3
 Amar, Akbar, and Anthony based on their ages and
  the tallest among the friends based on their heights
  (Solution by Irshad)
 */

import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amarAge=sc.nextInt();
        int akbarAge=sc.nextInt();
        int anthonyAge=sc.nextInt();
        double amarHeight=sc.nextDouble();
        double akbarHeight=sc.nextDouble();
        double anthonyHeight=sc.nextDouble();
        if(amarAge < akbarAge && amarAge <anthonyAge){
            System.out.println("Youngest Friend is Amar");
        }else if(akbarAge <amarAge && akbarAge <anthonyAge){
            System.out.println("Youngest Friend is Akbar");
        }else{
            System.out.println("Youngest Friend is Anthony");
        }

        if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
            System.out.println("Tallest friend is Amar");
        }else if(akbarHeight > amarHeight && akbarHeight >anthonyHeight){
            System.out.println("Tallest friend is Akbar");
        }else{
            System.out.println("Tallest friend is Anthony");
        }
    }
}
