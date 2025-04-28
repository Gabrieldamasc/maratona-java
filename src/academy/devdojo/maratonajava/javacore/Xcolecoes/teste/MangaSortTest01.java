package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga01, Manga manga02) {
        return manga01.getNome().compareTo(manga02.getNome());
    }
}

class MangaByPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga01, Manga manga02) {
        return Double.valueOf(manga01.getPreco()).compareTo(manga02.getPreco());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga("Naruto", 5L, 13.99));
        mangas.add(new Manga("Attack on titan", 4L, 2.88));
        mangas.add(new Manga("Drangon Ball", 2L, 4.55));
        mangas.add(new Manga("Pokemon", 3L, 11.21));
        mangas.add(new Manga("Fullmetal", 1L, 6.01));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------------------------");

        Collections.sort(mangas, new MangaByNameComparator());
        for (Manga mangaByName : mangas){
            System.out.println(mangaByName);
        }

        System.out.println("----------------------------");

        Collections.sort(mangas, new MangaByPriceComparator());
        for (Manga mangaByPrice : mangas){
            System.out.println(mangaByPrice);
        }
    }
}
