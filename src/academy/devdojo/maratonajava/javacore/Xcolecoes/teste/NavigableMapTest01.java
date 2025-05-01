package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.*;

class ComparatorByPriceManga implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableMapTest01 {
    public static void main(String[] args) {

        Manga manga1 = new Manga("Naruto", 5L, 13.99);
        Manga manga2 = new Manga("Attack on titan", 4L, 2.88);
        Manga manga3 = new Manga("Drangon Ball", 2L, 4.55);
        Manga manga4 = new Manga("Pokemon", 3L, 11.21);
        Manga manga5 = new Manga("Fullmetal", 1L, 6.01);
        List<Manga> mangas = List.of(manga1, manga2, manga3, manga4, manga5);

        NavigableMap<Manga, Manga> map = new TreeMap<>(new ComparatorByPriceManga());
        map.put(manga1, manga1);
        map.put(manga2, manga2);
        map.put(manga3, manga3);
        map.put(manga4, manga4);
        map.put(manga5, manga5);

        for (Map.Entry<Manga, Manga> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + " Está pelo preço de R$" + entry.getValue().getPreco());
        }
    }
}
