package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovel = new ArrayList<>(List.of(new LightNovel("Fullmetal", 4.99),
            new LightNovel("Pokemom", 2.50),
            new LightNovel("No Game No Life", 3.99),
            new LightNovel("OverLord", 8.00),
            new LightNovel("Violet Evergarden", 1.73),
            new LightNovel("Kumo desuga", 4.00),
            new LightNovel("Monogatari", 7.32),
            new LightNovel("Tensei Shittara", 3.54)
    ));
    public static void main(String[] args) throws Throwable {
        LightNovel lightNovel1 = lightNovel.stream()
                .filter(ln -> ln.getPrice() > 10)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .orElseThrow(() -> new IllegalArgumentException("Preço não encontrado"));
        System.out.println(lightNovel1);
    }
}
