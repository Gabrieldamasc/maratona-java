package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 - 6);
    }

    public void subtraçãoDoisNumeros() {
        System.out.println(21 - 1);
    }

    public void maiorOuMenor() {
        int calc = 20 - 15;
        if (calc < 10) {
            System.out.println("É menor que dez!");
        } else {
            System.out.println("É maior ou igual a dez!");
        }
    }

    public void multiplicacaoDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divisaoDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void somaArray(int... numeros) {
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);

    }
}
