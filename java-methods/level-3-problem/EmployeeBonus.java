import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        int numberOfEmployees = 10;
        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData);
        displayResults(employeeData, updatedData);
    }

    // Method to generate random salaries and years of service
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random rand = new Random();
        double[][] data = new double[numberOfEmployees][2]; // 2D array to hold salary and years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            double salary = 10000 + (rand.nextDouble() * 90000); // Random salary between 10,000 and 100,000
            int yearsOfService = rand.nextInt(11); // Random years of service between 0 and 10
            data[i][0] = salary; // Salary
            data[i][1] = yearsOfService; // Years of service
        }
        return data;
    }

    // Method to calculate new salaries and bonuses
    public static double[][] calculateNewSalariesAndBonuses(double[][] employeeData) {
        double[][] newData = new double[employeeData.length][3]; // 2D array to hold new salary and bonus
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus;
            double newSalary;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }
            newSalary = oldSalary + bonus;

            newData[i][0] = newSalary; // New salary
            newData[i][1] = bonus; // Bonus
            newData[i][2] = oldSalary; // Old salary
        }
        return newData;
    }

    // Method to display results in a tabular format
    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n", (i + 1), oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
