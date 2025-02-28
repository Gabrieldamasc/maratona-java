package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import academy.devdojo.maratonajava.javacore.Oexecption.dominio.LoginInvalidoException;

public class Funcionario extends Pessoa{
    public void salvar() throws RuntimeException, LoginInvalidoException {
        System.out.println("Salvando dados Funcionário");
    }
}
