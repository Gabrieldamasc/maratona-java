package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public final double IMPOSTO_POR_CENTO = 0.20;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }


    @Override
    public double calculadoraImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
