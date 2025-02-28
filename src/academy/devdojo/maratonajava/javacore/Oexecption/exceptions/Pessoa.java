package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import academy.devdojo.maratonajava.javacore.Oexecption.dominio.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException, IOException {
        System.out.println("Salvando dados pessoa");
    }
}
