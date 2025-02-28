package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("fusca beatle");


        System.out.println("Carro: "+carro.getNome()+" \nVelociade do carro: "+Carro.VELOCIDADE_MAXIMA);
        carro.COMPRADOR.setNome("Gabriel");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("enzo");
        ferrari.imprime();
    }
}
