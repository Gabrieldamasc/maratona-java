package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Mercedes", 200);
        Carro c2 = new Carro("Audi", 75);
        Carro c3 = new Carro("BMW", 150);


        Carro.setVelocidadeLimite(150);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
