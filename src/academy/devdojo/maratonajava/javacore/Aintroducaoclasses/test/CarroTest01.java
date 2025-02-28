package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Opala";
        carro01.modelo = "Comodoro";
        carro01.ano = 1988;

        carro02.nome = "Uno";
        carro02.modelo = "Fireway";
        carro02.ano = 2006;

        System.out.println("Dados dos carros:");
        System.out.println("Nome do 1° carro: " + carro01.nome + " ;modelo: " + carro01.modelo + " ;ano: " + carro01.ano);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Nome do 2° carro: " + carro02.nome + " ;modelo: " + carro02.modelo + " ;ano: " + carro02.ano);
    }
}
