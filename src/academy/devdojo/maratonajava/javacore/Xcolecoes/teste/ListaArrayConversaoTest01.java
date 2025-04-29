package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] arrayNumeros = new Integer[3];
        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;

        System.out.println(Arrays.toString(arrayNumeros));

        List<Integer> integerList = new ArrayList<>(Arrays.asList(arrayNumeros));
        integerList.add(2);
        System.out.println(integerList);
    }
}
