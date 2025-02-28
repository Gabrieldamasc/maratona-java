package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraDadosDosEstudantes;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        ImpressoraDadosDosEstudantes imprime = new ImpressoraDadosDosEstudantes();

        estudante01.nome = "Gabriel";
        estudante01.idade = 18;
        estudante01.sexo = "Masculino";
        estudante01.numeroDaSala = 145;

        estudante02.nome = "Clara";
        estudante02.idade = 17;
        estudante02.sexo = "Feminino";
        estudante02.numeroDaSala = 143;

        estudante03.nome = "João";
        estudante03.idade = 19;
        estudante03.sexo = "Masculino";
        estudante03.numeroDaSala = 105;

        imprime.imprimeDadosEstudantes(estudante01);

        System.out.println("_____________________");

        imprime.imprimeDadosEstudantes(estudante02);

        System.out.println("_____________________");

        imprime.imprimeDadosEstudantes(estudante03);


    }
}
