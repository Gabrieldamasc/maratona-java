package lista.execercicios.lista02.domain;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;


    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }


    public void imprimeDadosEmpregado() {
        System.out.println("Relatório de dados dos funcionários: ");
        System.out.println("Nome completo: " + getNome() + " " + getSobrenome());
        System.out.println("Salário mensal: " + getSalarioMensal());
        double salarioAnual = this.salarioMensal * 12;
        System.out.println("Salário anual: " + salarioAnual);
        double salarioMensalComBonus = (this.salarioMensal * 0.10) + salarioMensal;
        System.out.println("Salário com bônus de 10%: " + salarioMensalComBonus);
        double salarioAnualComBonus = (salarioAnual * 0.10) + salarioAnual;
        System.out.println("Salário anual com bônus de 10%: " + salarioAnualComBonus);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

}
