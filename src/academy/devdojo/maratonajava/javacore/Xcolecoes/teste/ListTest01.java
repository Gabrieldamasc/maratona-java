package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>(16);
        List <String> nomes2 = new ArrayList<>(16);
        List <String> nomeSemDuplicado = new ArrayList<>(16);

        nomes.add("Gabriel");
        nomes.add("Rafael");
        nomes.add("João");

        nomes2.add("Rafael");
        nomes2.add("Márcia");
        nomes2.add("Carla");

        nomes.addAll(nomes2);

        for (String nome : nomes){
            if (!nomeSemDuplicado.contains(nome)){
                nomeSemDuplicado.add(nome);
            }
        }

        for(String nome : nomeSemDuplicado){
            System.out.println(nome);
        }

    }
}
