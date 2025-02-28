package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, String sexo, int salario) {
        super(nome, sexo, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }


    @Override
    public void calculaBonus() {
        this.salario += salario * 0.20;
    }
}
