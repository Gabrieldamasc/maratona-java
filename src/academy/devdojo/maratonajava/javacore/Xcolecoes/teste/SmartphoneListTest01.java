package academy.devdojo.maratonajava.javacore.Xcolecoes.teste;

import academy.devdojo.maratonajava.javacore.Xcolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("12232", "Samsung");
        Smartphone s2 = new Smartphone("34453", "Apple");
        Smartphone s3 = new Smartphone("45323", "Pixel");
        Smartphone s4 = new Smartphone("65323", "Motorola");

        List<Smartphone> listSmartphone = new ArrayList<>(6);

        listSmartphone.add(s1);
        listSmartphone.add(s2);
        listSmartphone.add(s3);
        listSmartphone.add(s4);

        System.out.println(listSmartphone.indexOf(s3));

        for (Smartphone smartphone : listSmartphone) {
            System.out.println(smartphone);
        }

        Smartphone s5 = new Smartphone("34453", "pixel");
        if (listSmartphone.contains(s5)){
            System.out.println("Este telefone já existe em nosso banco de dados");
        }else {
            System.out.println("Este telefone não existe em nosso banco de dados");
        }
    }
}
