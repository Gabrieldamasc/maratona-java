package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String texto = "gabriel@gmail.com.br.br, zoro@mail.br, @#!luffy23@gmail.com, sakura@mail";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-z])+(\\.([a-zA-z])+)+";
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
