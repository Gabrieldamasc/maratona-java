package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao programa adivinhador do Gabriel!");
        System.out.println("Faça qualquer pergunta e eu responderei!");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0)==' '){
            System.out.println("Sim! Isso é muito verdade!");
        }else{
            System.out.println("Não! Essa é a maior mentira da terra!");
        }
    }
}
