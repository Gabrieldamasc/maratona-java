package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("André");

        Manga manga1 = new Manga("Naruto", 5L, 13.99);
        Manga manga2 = new Manga("Attack on titan", 4L, 2.88);
        Manga manga3 = new Manga("Drangon Ball", 2L, 4.55);
        Manga manga4 = new Manga("Pokemon", 3L, 11.21);
        Manga manga5 = new Manga("Fullmetal", 1L, 6.01);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println("O consumidor " + entry.getKey().getNome() + " comprou o mangá: " + entry.getValue().getNome() + " pelo preço de R$"+ entry.getValue().getPreco());
        }
    }


}
