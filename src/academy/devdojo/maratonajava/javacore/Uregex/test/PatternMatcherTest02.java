package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String texto = "f1 0xf323 0X43a x023";
        String regex = "0[Xx][0-9a-fA-F]";
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
