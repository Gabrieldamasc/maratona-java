package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import academy.devdojo.maratonajava.javacore.Oexecption.dominio.LoginInvalidoException;

public class SobrescritaComExceptionsTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
