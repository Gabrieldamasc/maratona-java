package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga("Naruto", 5L, 13.99, 4));
        mangas.add(new Manga("Attack on titan", 4L, 2.88, 0));
        mangas.add(new Manga("Drangon Ball", 2L, 4.55, 2));
        mangas.add(new Manga("Pokemon", 3L, 11.21, 0));
        mangas.add(new Manga("Fullmetal", 1L, 6.01, 12));

        for (Manga manga : mangas) {
            System.out.println(mangas);
        }

    }
}
