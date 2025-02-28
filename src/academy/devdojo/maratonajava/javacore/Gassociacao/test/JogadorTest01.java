package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Didico");
        Jogador jogador3 = new Jogador("Ronaldinho");
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2, jogador3};


        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
