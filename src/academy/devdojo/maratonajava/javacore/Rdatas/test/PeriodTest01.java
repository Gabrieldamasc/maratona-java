package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate localDate1Now = LocalDate.now();
        LocalDate localDatePlus = LocalDate.now().plusYears(2).plusDays(20);
        Period p1 = Period.between(localDate1Now, localDatePlus);
        Period p2 = Period.ofWeeks(58);
        System.out.println(p1);
        System.out.println(p2);
    }
}
