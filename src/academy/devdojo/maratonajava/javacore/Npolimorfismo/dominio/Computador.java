package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    public final double IMPOSTO_POR_CENTO = 0.20;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculadoraImposto() {
        System.out.println("Calculando imposto do computador: ");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
