package by.homework.hw10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

public class Task1 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDate pastDate = LocalDate.of(2020, 06, 25);
        Duration duration = Duration.between(pastDate.atStartOfDay(), currentDate.atStartOfDay());
        System.out.println("Количество дней между двумя датами:");
        System.out.println(currentDate.toEpochDay() - pastDate.toEpochDay());
        System.out.println(duration.getSeconds() / 3600 / 24);
        System.out.println("Количество секунд между полуночью первой даты и полуночью второй даты:");
        System.out.println(duration.getSeconds());
    }
}
