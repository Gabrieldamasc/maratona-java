package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, String sexo, int salario) {
        super(nome, sexo, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salario += salario * 0.05;
    }
}
