package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected String sexo;
    protected double salario;

    public Funcionario(String nome, String sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    public abstract void calculaBonus();
}
