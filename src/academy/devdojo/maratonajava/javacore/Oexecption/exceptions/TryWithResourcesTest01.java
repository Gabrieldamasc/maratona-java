package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import academy.devdojo.maratonajava.javacore.Oexecption.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexecption.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivos();
    }

    public static void lerArquivos() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
