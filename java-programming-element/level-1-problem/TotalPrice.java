
// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.


import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unitprice =sc.nextInt();
        int unitquantity=sc.nextInt();
        int total=unitprice*unitquantity;
        System.out.println("The total price is INR "+total+" if the quantity is "+unitquantity+" unit and unit price is INR "+unitprice);
    }
}
