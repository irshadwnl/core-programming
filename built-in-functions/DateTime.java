import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String pattern=sc.next();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date=LocalDate.parse(pattern,df);
        LocalDate newDate= date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate minusWeek=date.minusWeeks(3);
        System.out.println("Real Date: " + date.format(df));
        System.out.println("After adding 7 days, 1 month, and 2 years: "+newDate);
        System.out.println("After Subtracting 3 weeks: "+minusWeek);
    }
}
