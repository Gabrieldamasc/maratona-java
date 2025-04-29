package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByPriceComparator mangaByPriceComparator = new MangaByPriceComparator();

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga("Naruto", 5L, 13.99));
        mangas.add(new Manga("Attack on titan", 4L, 2.88));
        mangas.add(new Manga("Drangon Ball", 2L, 4.55));
        mangas.add(new Manga("Pokemon", 3L, 11.21));
        mangas.add(new Manga("Fullmetal", 1L, 6.01));

        mangas.sort(mangaByPriceComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga("Drangon Ball", 2L, 4.55);



        System.out.println(Collections.binarySearch(mangas, mangaToSearch,mangaByPriceComparator ));
    }
}
