package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.FULL);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[6] = DateFormat.getDateInstance(DateFormat.LONG);

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

        Calendar dataAtual = Calendar.getInstance();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println(dateInstance.format(calendar.getTime()));
    }


}
