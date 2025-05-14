package academy.devdojo.maratonajava.javacore.ZZBlambdas.test.test;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.test.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZBlambdas.test.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;
        AnimeComparator animeComparator = animeComparatorSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 350), new Anime("One piece", 720), new Anime("Attack on titan", 650)));
        animeList.sort(animeComparator::animeComparatorByTitleNonEstatic);
        System.out.println(animeList);
        animeList.sort(AnimeComparator::animeComparatorByEpisodes);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> stringIntegerAnimeBiFunction = Anime::new;
        System.out.println(stringIntegerAnimeBiFunction.apply("FullMetal", 55));
    }
}
