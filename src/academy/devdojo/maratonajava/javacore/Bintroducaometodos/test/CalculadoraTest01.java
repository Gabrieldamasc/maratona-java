package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Fim do programa 01");

        calculadora.subtraçãoDoisNumeros();

        System.out.println("Vamos descobrir se um número é maior ou menor que dez!");
        calculadora.maiorOuMenor();
    }
}
