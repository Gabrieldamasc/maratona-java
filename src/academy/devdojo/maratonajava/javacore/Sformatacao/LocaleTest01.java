package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Brazil: "+ df1.format(calendar.getTime()));
        System.out.println("Japão: "+ df2.format(calendar.getTime()));
        System.out.println(localeJapan.getDisplayCountry(localeJapan));

    }
}
