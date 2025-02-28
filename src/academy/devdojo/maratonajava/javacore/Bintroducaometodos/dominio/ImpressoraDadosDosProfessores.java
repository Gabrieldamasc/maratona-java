package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraDadosDosProfessores {
    public void imprimeDadosDosProfessores(Professor professor){
        System.out.println("Nome do professor(a): "+professor.nomeProfessor);
        System.out.println("Disciplina do professor(a): "+professor.disciplinaDoProfessor);
        System.out.println("Quantidade de aulas diárias do professor(a) nesta disciplina: "+professor.quantidadeDeAulasDoProfessor);
    }
}
