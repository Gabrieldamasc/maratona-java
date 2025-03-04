package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedBR = LocalDateTime.now().format(dateTimeFormatterBR);
        System.out.println(formattedBR);

        LocalDate parseBR = LocalDate.parse("10/10/2006", dateTimeFormatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatterFrance = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.FRANCE);
        String formattedFrance = LocalDateTime.now().format(dateTimeFormatterFrance);
        System.out.println(formattedFrance);

        DateTimeFormatter dateTimeFormatterJapan = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.JAPAN);
        String formattedJapan = LocalDateTime.now().format(dateTimeFormatterJapan);
        System.out.println(formattedJapan);
    }
}
