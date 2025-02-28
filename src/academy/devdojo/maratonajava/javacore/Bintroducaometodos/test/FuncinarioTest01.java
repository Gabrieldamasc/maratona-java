package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncinarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Gabriel");
        funcionario.setAge(20);
        funcionario.setSalary(new double[]{1200,1444,1234});

        funcionario.imprimeDadosFuncionario();

    }
}
