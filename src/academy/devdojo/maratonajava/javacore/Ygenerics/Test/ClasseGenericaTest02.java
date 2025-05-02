package academy.devdojo.maratonajava.javacore.Ygenerics.Test;

import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Barco;
import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Carro;
import academy.devdojo.maratonajava.javacore.Ygenerics.Service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Ygenerics.Service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();

        barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
