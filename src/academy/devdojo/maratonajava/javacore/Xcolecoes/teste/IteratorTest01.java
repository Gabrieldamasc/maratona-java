package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.*;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga("Naruto", 5L, 13.99, 4));
        mangas.add(new Manga("Attack on titan", 4L, 2.88,0));
        mangas.add(new Manga("Drangon Ball", 2L, 4.55, 2));
        mangas.add(new Manga("Pokemon", 3L, 11.21, 0));
        mangas.add(new Manga("Fullmetal", 1L, 6.01, 12));

        Collections.sort(mangas);

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            if (mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }

        System.out.println(mangas);

    }
}
