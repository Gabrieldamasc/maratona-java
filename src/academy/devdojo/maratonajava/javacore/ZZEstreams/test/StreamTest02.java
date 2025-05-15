package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovel = new ArrayList<>(List.of(new LightNovel("Fullmetal", 4.99),
            new LightNovel("Pokemom", 2.50),
            new LightNovel("No Game No Life", 3.99),
            new LightNovel("OverLord", 8.00),
            new LightNovel("Violet Evergarden", 1.73),
            new LightNovel("Kumo desuga", 4.00),
            new LightNovel("Monogatari", 7.32),
            new LightNovel("Tensei Shittara", 3.54)
    ));

    public static void main(String[] args) {
        List<String> list = lightNovel.stream()
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
