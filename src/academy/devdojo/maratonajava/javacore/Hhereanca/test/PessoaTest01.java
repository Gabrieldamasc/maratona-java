package academy.devdojo.maratonajava.javacore.Hhereanca.test;

import academy.devdojo.maratonajava.javacore.Hhereanca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hhereanca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hhereanca.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das moitas");
        endereco.setCep("22212-222");
        Pessoa pessoa = new Pessoa("Augusto","122.121.345-22");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Roberto","234.532.133-45",12000);
        Funcionario funcionario2 = new Funcionario("Roberto","234.532.133-45",4521);
        funcionario.setEndereco(endereco);

        System.out.println(".........................");
        funcionario.imprime();



    }
}
