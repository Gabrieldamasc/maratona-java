package academy.devdojo.maratonajava.javacore.ZZBlambdas.test.test;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.test.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZBlambdas.test.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 350), new Anime("One piece", 720), new Anime("Attack on titan", 650)));
        animeList.sort(AnimeComparator::animeComparatorByTitle);
        System.out.println(animeList);
        animeList.sort(AnimeComparator::animeComparatorByEpisodes);
        System.out.println("-----------------");
        System.out.println(animeList);
    }
}
