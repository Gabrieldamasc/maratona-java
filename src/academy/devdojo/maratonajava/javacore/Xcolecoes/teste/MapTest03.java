package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("André");

        Manga manga1 = new Manga("Naruto", 5L, 13.99);
        Manga manga2 = new Manga("Attack on titan", 4L, 2.88);
        Manga manga3 = new Manga("Drangon Ball", 2L, 4.55);
        Manga manga4 = new Manga("Pokemon", 3L, 11.21);
        Manga manga5 = new Manga("Fullmetal", 1L, 6.01);

        List<Manga> mangaConsumidorList1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidorList1);
        consumidorMangaMap.put(consumidor2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> mangaListEntry : consumidorMangaMap.entrySet()){
            System.out.println(mangaListEntry.getKey().getNome());
            for (Manga nomeManga : mangaListEntry.getValue() ){
                System.out.println(nomeManga.getNome());
            }
        }



    }


}
