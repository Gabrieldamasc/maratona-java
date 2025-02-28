package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraDadosDosEstudantes {
    public void imprimeDadosEstudantes(Estudante estudante) {
        System.out.println("Nome do estudante: " + estudante.nome);
        System.out.println("Idade do estudante: " + estudante.idade);
        System.out.println("Sexo do estudante: " + estudante.sexo);
        System.out.println("Sala do estudante: " + estudante.numeroDaSala);
    }
}
