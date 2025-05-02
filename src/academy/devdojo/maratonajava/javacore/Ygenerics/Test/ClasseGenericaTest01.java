package academy.devdojo.maratonajava.javacore.Ygenerics.Test;

import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Barco;
import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Carro;
import academy.devdojo.maratonajava.javacore.Ygenerics.Service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Ygenerics.Service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();

        carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);


    }
}
