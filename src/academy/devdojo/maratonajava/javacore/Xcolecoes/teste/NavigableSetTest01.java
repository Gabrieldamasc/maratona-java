package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class ComparatorByprice implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new ComparatorByprice());
        mangas.add(new Manga("Naruto", 5L, 13.99));
        mangas.add(new Manga("Attack on titan", 4L, 2.88));
        mangas.add(new Manga("Drangon Ball", 2L, 4.55));
        mangas.add(new Manga("Pokemon", 3L, 11.21));
        mangas.add(new Manga("Fullmetal", 1L, 6.01));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga ippo = new Manga("Ippo Makunochi", 2L, 3);

        System.out.println("-----------------");

        System.out.println(mangas.higher(ippo));
        System.out.println(mangas.lower(ippo));
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
