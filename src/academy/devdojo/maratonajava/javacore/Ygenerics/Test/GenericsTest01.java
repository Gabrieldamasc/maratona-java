package academy.devdojo.maratonajava.javacore.Ygenerics.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {

    private static void adicionarNumeros(List<? super String> numeross){
        numeross.add("1");
        numeross.add("2");
        numeross.add("3");
    }
    public static void main(String[] args) {
        List<Object> numeros = new ArrayList<>();
        adicionarNumeros(numeros);
        numeros.add(10);
        numeros.add('a');
        numeros.add(true);
        numeros.add(22.3);
        numeros.add(1200L);

        for (Object numero : numeros) {
            System.out.println(numero.getClass());
        }
    }
}
