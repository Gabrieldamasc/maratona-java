package lista.execercicios.lista01.test;

import lista.execercicios.lista01.domain.Fatura;

public class FaturaTest {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("12b2","Placa de vídeo", -1,1223);

        fatura.imprimeDadosFatura();
    }
}
