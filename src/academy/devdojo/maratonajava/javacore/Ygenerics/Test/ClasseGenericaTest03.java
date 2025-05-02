package academy.devdojo.maratonajava.javacore.Ygenerics.Test;

import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Barco;
import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Carro;
import academy.devdojo.maratonajava.javacore.Ygenerics.Service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Ygenerics.Service.RentalService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("AUDI")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("canoa"), new Barco("lancha")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalServiceCarro.retornandoObjetoAlugado(carro);

        System.out.println("-----------------------");

        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("alugando barco por 1 mês");
        rentalServiceBarco.retornandoObjetoAlugado(barco);
    }
}
