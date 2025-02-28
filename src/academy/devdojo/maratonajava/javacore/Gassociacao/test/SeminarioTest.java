package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local endereco = new Local("Rua das araras");
        Local endereco1 = new Local("Rua dos números");
        Aluno aluno01 = new Aluno("Pedro", 12);
        Aluno aluno02 = new Aluno("Maria", 13);
        Aluno aluno03 = new Aluno("Fernando", 15);
        Aluno aluno04 = new Aluno("Mário", 14);
        Aluno aluno05 = new Aluno("Melissa", 12);
        Aluno aluno06 = new Aluno("Felipe", 10);
        Aluno[] alunos = {aluno01, aluno02, aluno03, aluno04, aluno05, aluno06};
        Aluno[] alunosSegundoSeminario = {aluno04, aluno05, aluno06};
        Professor professor01 = new Professor("Matheus", "Português");
        Professor professor02 = new Professor("Marta", "Fisíca");
        Seminario seminario01 = new Seminario("Como criar gado", alunos, endereco);
        Seminario seminario02 = new Seminario("Como fazer equações", alunosSegundoSeminario, endereco1);
        Seminario[] seminarioDisponivel = {seminario01};
        Seminario[] seminarioAlternativo = {seminario02};

        professor01.setSeminario(seminarioDisponivel);
        professor02.setSeminario(seminarioAlternativo);

        professor01.imprime();
        System.out.println("..................................");
        professor02.imprime();
    }
}
