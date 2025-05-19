package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryListMap = lightNovel.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(categoryListMap);
    }
}
