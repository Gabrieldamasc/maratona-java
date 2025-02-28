package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionsTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo(){
        File file = new File("arquivo\\test.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Criado "+ isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
