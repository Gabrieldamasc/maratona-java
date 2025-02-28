package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class TechLead extends Funcionario{
    public TechLead (String nome, String sexo, int salario){
        super(nome, sexo, salario);
    }

    @Override
    public String toString() {
        return "TechLead{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaBonus(){
        this.salario += salario * 0.10;
    }
}
