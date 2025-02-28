package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador jogador6 = new Jogador("Depay");
        Jogador jogador7 = new Jogador("Romero");
        Jogador jogador8 = new Jogador("Hugo");
        Jogador[] jogadoresBrasil = {jogador1, jogador2, jogador3, jogador8};
        Jogador[] jogadoresCorinthians = {jogador6, jogador7, jogador8};
        Time timeBrasil = new Time("Brasil", jogadoresBrasil);
        Time timeCorinthians = new Time("Corinthians", jogadoresCorinthians);

        jogador1.setTime(timeBrasil);
        jogador2.setTime(timeBrasil);
        jogador3.setTime(timeBrasil);
        jogador6.setTime(timeCorinthians);
        jogador7.setTime(timeCorinthians);
        jogador8.setTime(timeCorinthians);


        timeBrasil.setJogadores(jogadoresBrasil);

        System.out.println("--- Jogador ---");

        for (Jogador jogador : jogadoresBrasil) {
            jogador.imprime();
            System.out.println("...................");
        }

        for (Jogador jogador : jogadoresCorinthians) {
            jogador.imprime();
            System.out.println("...................");
        }



        System.out.println("--- Time ---");

        timeBrasil.imprime();

        System.out.println(".......................");

        timeCorinthians.imprime();
    }
}
