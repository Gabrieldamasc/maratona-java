package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDate localDate1 = LocalDate.parse("2006-10-06");
        LocalTime localTime1 = LocalTime.parse("18:30:33");
        LocalDateTime ldt1 = localTime1.atDate(localDate1);
        if (ldt1.isBefore(dateNow)){
            System.out.println("Saving requisitions from: "+ localDate1+ " to " +dateNow);
        }
    }
}
