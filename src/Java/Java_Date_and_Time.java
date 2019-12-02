package Java;

import java.time.LocalDate;

public class Java_Date_and_Time {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
