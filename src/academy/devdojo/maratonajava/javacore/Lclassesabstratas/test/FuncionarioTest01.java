package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.TechLead;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roberto", "Masculino", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", "Masculino", 6500);
        TechLead techLead = new TechLead("Gabriel", "Masculino", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        System.out.println(techLead);

        gerente.imprime();
        desenvolvedor.imprime();
        techLead.imprime();

    }
}
