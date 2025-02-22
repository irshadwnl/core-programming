import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First date (yyyy-MM-dd): ");
        String date1=sc.next();
        System.out.print("Enter Second date (yyyy-MM-dd): ");
        String date2=sc.next();
        LocalDate date=LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate newDate1=LocalDate.parse(date1,df);
        LocalDate newDate2=LocalDate.parse(date2,df);
        System.out.println(newDate1.isAfter(newDate2));
        System.out.println(newDate1.isBefore(newDate2));
        System.out.println(newDate1.isEqual(newDate2));


    }
}
