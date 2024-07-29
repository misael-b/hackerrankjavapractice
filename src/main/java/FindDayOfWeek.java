import java.time.LocalDate;
public class FindDayOfWeek {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month,day);
        return localDate.getDayOfWeek().name();

    }
}
