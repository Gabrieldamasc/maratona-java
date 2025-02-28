package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import academy.devdojo.maratonajava.javacore.Oexecption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest extends Throwable {
    public static void main(String[] args) {
        try {
            validacaoNomeESenha();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void validacaoNomeESenha() throws LoginInvalidoException {
        String nome = "Gabriel";
        String senha = "152832JGA";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Insira sua senha: ");
        String passwordDigitada = teclado.nextLine();
        if (!nome.equals(usernameDigitado) | !senha.equals(passwordDigitada)) {
            throw new LoginInvalidoException("Nome ou senha inválido.");
        }
        System.out.println("Login realizado com sucesso!");
    }
}
