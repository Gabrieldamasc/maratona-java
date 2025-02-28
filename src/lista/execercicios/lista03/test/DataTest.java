package lista.execercicios.lista03.test;

import lista.execercicios.lista03.domain.Data;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Data data = new Data(10,10,2006);

        data.imprimeDadosData();
        data.leituraAndImpressaoDados();
    }
}
