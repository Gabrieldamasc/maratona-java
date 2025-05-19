package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovel = new ArrayList<>(List.of(new LightNovel("Fullmetal", 4.99, Category.FANTASY),
            new LightNovel("Pokemom", 2.50, Category.FANTASY),
            new LightNovel("No Game No Life", 3.99, Category.FANTASY),
            new LightNovel("OverLord", 8.00, Category.DRAMA),
            new LightNovel("Violet Evergarden", 1.73, Category.ROMANCE),
            new LightNovel("Kumo desuga", 4.00, Category.FANTASY),
            new LightNovel("Monogatari", 7.32, Category.FANTASY),
            new LightNovel("Tensei Shittara", 3.54, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovel.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, LightNovel> collect1 = lightNovel.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovel.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

    }
}
