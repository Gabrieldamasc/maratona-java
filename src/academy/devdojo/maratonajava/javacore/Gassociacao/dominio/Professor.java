package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("--- Nome e especialidade do professor ---");
        System.out.print(this.nome);
        System.out.println(" || " + this.especialidade);
        if (this.getSeminario() == null) return;
        for (Seminario seminario : seminario) {
            System.out.println("--- Tema do seminário ---");
            System.out.println(seminario.getTitulo());
            System.out.println("--- Endereço do seminário ---");
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAluno() == null || seminario.getAluno().length == 0){
                System.out.println("Neste seminário não existem alunos cadastrados!");
                continue;
            }
            System.out.println("--- Alunos cadastrados neste seminário ---");
            for (Aluno aluno : seminario.getAluno()) {
                System.out.println(aluno.getNome());
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
