package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraDadosDosEstudantes;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraDadosDosProfessores;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        Professor professor02 = new Professor();
        Professor professor03 = new Professor();
        ImpressoraDadosDosProfessores imprime = new ImpressoraDadosDosProfessores();

        professor01.nomeProfessor = "Mateus";
        professor01.disciplinaDoProfessor = "Matemática";
        professor01.quantidadeDeAulasDoProfessor = 4;

        professor02.nomeProfessor = "Joana";
        professor02.disciplinaDoProfessor = "Português";
        professor02.quantidadeDeAulasDoProfessor = 2;

        professor03.nomeProfessor = "Maria";
        professor03.disciplinaDoProfessor = "Física";
        professor03.quantidadeDeAulasDoProfessor = 6;

        imprime.imprimeDadosDosProfessores(professor01);

        System.out.println("-----------------------------");

        imprime.imprimeDadosDosProfessores(professor02);

        System.out.println("-----------------------------");

        imprime.imprimeDadosDosProfessores(professor03);
    }
}
