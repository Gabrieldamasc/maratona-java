package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.Pessoa;

import javax.crypto.spec.PSource;

public class PessoaBuilderTest01 {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaBuilder()
                .firstname("Gabriel")
                .lastname("Damasceno")
                .userName("GBR")
                .email("gabriel.com")
                .build();
        System.out.println(build);
    }



}
