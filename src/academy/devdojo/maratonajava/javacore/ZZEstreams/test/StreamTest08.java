package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovel.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum).ifPresent(System.out::println);

    }
}
