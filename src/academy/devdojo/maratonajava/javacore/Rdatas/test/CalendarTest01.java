package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.io.Closeable;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.YEAR);
        Date date = c.getTime();
        System.out.println(date);
    }
}
