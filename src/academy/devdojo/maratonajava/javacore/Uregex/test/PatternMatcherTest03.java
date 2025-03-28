package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        String regex = "0[Xx]([0-9a-fA-F])+(\\s|$)";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("Indice:  0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
