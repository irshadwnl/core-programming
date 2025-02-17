
/*Create a program to find the bonus of 10 employees
 based on their years of service and the total bonus 
 amount the company Zara has to pay, along with the 
 old and new salary.(Solution by Irshad)
 */

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary[]=new double[10];
        double years[]=new double[10];
        double newSalary[]=new double[10];
        double bonus[]=new double[10];
        double totalBonus=0;
        double totalNewSal=0;
        double totalOldSal=0;
        for(int i=0;i<10;i++){
            while (true) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salary[i] = Double.parseDouble(sc.nextLine());
                    
                    if (salary[i] <= 0) {
                        System.out.println("Invalid salary");
                        continue;
                    }
                    
                    System.out.print("Enter years of employee " + (i + 1) + ": ");
                    years[i] = Double.parseDouble(sc.nextLine());
                    
                    if (years[i] < 0) {
                        System.out.println("Invalid years");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }

        for(int i=0;i<10;i++){
            double bonusePrcent=years[i]>5?0.05:0.02;
            bonus[i]=salary[i]*bonusePrcent;
            newSalary[i]=salary[i]+bonus[i];
            totalBonus+=bonus[i];
            totalOldSal+=salary[i];
            totalNewSal+=newSalary[i];
            
        }
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n", salary[i], years[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSal);
        System.out.println("Total New Salary: " + totalNewSal);

    }
}
