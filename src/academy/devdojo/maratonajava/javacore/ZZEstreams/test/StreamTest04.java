package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Gabriel soares", "Marta", "Valentina");
        List<String> developers = List.of("Gabriel", "marcos", "Jõao");
        List<String> marketing = List.of("Carla", "Carlos miguel", "Roberto");
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(marketing);

        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
