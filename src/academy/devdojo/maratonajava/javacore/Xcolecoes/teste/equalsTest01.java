package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Smartphone;

public class equalsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("223A34", "Apple");
        Smartphone s2 = new Smartphone("223A34", "Apple");

        System.out.println(s1.equals(s2));
    }

}
