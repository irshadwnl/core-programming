
// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount


// package AssignmentWeek1.Day1;

import java.util.Scanner;

public class UniversityDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee=sc.nextInt();
        int discounPercent=sc.nextInt();
        int discount=(fee*discounPercent)/100;
        fee=fee-discount;
        System.out.println("the discount amount is INR "+discount+" and final discount fee is INR "+fee);

    }
}
