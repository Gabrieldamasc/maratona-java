package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class addDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = switch (dayOfWeek) {
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        };
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = LocalDate.now().with(new addDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = LocalDate.now().withDayOfMonth(6).with(new addDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
