package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.smartphone;

public class equalsTest01 {
    public static void main(String[] args) {
        smartphone s1 = new smartphone("223A34", "Apple");
        smartphone s2 = new smartphone("223A34", "Apple");

        System.out.println(s1.equals(s2));
    }

}
