package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Naruto");
        mangas.add("Attack on titan");
        mangas.add("Drangon Ball");
        mangas.add("Pokemon");
        mangas.add("Fullmetal");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
