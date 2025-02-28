package lista.execercicios.lista02.test;

import lista.execercicios.lista02.domain.Empregado;

public class EmpregadoTest {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado("Gabriel", "Nunes", 10000);
        Empregado empregado02 = new Empregado("Roberto", "Silva", 5000);

        empregado01.imprimeDadosEmpregado();
        System.out.println("--------------------------------");
        empregado02.imprimeDadosEmpregado();
    }
}
