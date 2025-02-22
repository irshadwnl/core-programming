import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        String date=ld.format(df);
        System.out.println(date);
        String date2=ld.format(df2);
        System.out.println(date2);
        String date3=ld.format(df3);
        System.out.println(date3);
    }
}
