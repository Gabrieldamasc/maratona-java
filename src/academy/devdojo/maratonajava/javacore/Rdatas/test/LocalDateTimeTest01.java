package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalTime lt1 = LocalTime.parse("18:48:50");
        LocalDate ld1 = LocalDate.parse("2006-10-10");
        LocalDateTime time = lt1.atDate(ld1);
        LocalDateTime dateAndTime = ld1.atTime(lt1);
        System.out.println(ldt1);
        System.out.println(lt1);
        System.out.println(ld1);
        System.out.println(time);
        System.out.println(dateAndTime);
    }
}
