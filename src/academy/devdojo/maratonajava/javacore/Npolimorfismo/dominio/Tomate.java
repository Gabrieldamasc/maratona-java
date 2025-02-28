package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public final double IMPOSTO_POR_CENTO = 0.5;
    private String dataDeValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public Tomate(String nome, double valor, String dataDeValidade) {
        super(nome, valor);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public double calculadoraImposto() {
        System.out.println("Calculando imposto do tomate: ");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
