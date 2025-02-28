package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte? " + isDezMenorQueVinte);
        System.out.println("DisDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);


        int idade = 29;
        double salario = 4100;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4650.43;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3650.42;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 500;
        double valorTotalContaPoupanca = 4000;
        double precoPlaystaion = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > precoPlaystaion || valorTotalContaPoupanca > precoPlaystaion;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);


    }
}
