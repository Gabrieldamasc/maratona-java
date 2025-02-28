package academy.devdojo.maratonajava.javacore.Hhereanca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, double salario){
        super(nome, cpf);
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
        System.out.println("Eu " + this.nome + " Recebi o salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
