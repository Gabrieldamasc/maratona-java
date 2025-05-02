package academy.devdojo.maratonajava.javacore.Ygenerics.Service;

import academy.devdojo.maratonajava.javacore.Ygenerics.Domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("canoa"), new Barco("lancha")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barcos disponível...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco: "+ barco);
        barcosDisponiveis.add(barco);
        System.out.println("barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
    }
}
