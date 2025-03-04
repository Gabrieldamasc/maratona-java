package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String texto = "abababa";
        String regex = "aba";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(texto);
        System.out.println("texto:   "+texto);
        System.out.println("Indice:  0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
