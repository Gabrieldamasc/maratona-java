package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro V15", 5000);
        Tomate tomate = new Tomate("Tomate cereja", 12);
        Televisao tv = new Televisao("LG", 4250);

        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
