package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate date = LocalDate.of(2006, Month.OCTOBER,10);
        LocalDate dateNowPlus5years = dateNow.plusYears(5);

        int dia = dateNow.getDayOfMonth();
        int mes = dateNow.getMonthValue();

        System.out.println(dateNow);
        System.out.println(dateNowPlus5years);
        System.out.println(dateNow);
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(dateNow.lengthOfMonth());
    }
}
