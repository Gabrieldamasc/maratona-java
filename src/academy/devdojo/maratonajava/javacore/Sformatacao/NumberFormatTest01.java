package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBr = new Locale("pt", "BR");
        Locale localeFrance = Locale.FRANCE;
        Locale localeChina = Locale.CHINA;




        NumberFormat[] nfa = new NumberFormat[3];

        nfa[0] = NumberFormat.getInstance(localeBr);
        nfa[1] = NumberFormat.getInstance(localeFrance);
        nfa[2] = NumberFormat.getInstance(localeChina);

        double valor = 100.123;
        int value = 100;
        String s = String.valueOf(value);

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "100,11";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
