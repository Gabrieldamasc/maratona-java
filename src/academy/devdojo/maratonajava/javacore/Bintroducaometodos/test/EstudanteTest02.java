package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 18;
        estudante01.sexo = "Masculino";
        estudante01.numeroDaSala = 145;

        estudante02.nome = "Clara";
        estudante02.idade = 17;
        estudante02.sexo = "Feminino";
        estudante02.numeroDaSala = 143;

        estudante01.imprime();
        estudante02.imprime();


    }
}
