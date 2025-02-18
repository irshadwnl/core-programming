import java.util.Scanner;

public class Calender {
    // Array to store the names of months
    private static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        scanner.close();

        // Print the calendar
        printCalendar(month, year);
    }

    // Method to determine if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    private static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return daysInMonth[month - 1];
    }

    // Method to determine the first day of the month
    private static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    // Method to print the calendar
    private static void printCalendar(int month, int year) {
        System.out.println("  " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        // Print initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print calendar days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to next line after Saturday
            }
        }
        System.out.println();
    }
}
