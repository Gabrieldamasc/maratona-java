package academy.devdojo.maratonajava.javacore.ZZBlambdas.test.service;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.test.domain.Anime;

public class AnimeComparator {
    public static int animeComparatorByTitle(Anime a1, Anime a2){
        return a1.getTittle().compareTo(a2.getTittle());
    }

    public static int animeComparatorByEpisodes(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int animeComparatorByTitleNonEstatic(Anime a1, Anime a2){
        return a1.getTittle().compareTo(a2.getTittle());
    }
}
