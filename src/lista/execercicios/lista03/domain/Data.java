package lista.execercicios.lista03.domain;

import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimeDadosData() {
        if (dia > 31 || mes > 12) {
            System.out.println("Data inválida! insira uma data válida.");
            return;
        }
        System.out.println("Data inserida: " + dia + "/" + mes + "/" + ano);
    }

    Scanner input = new Scanner(System.in);


    public void leituraAndImpressaoDados() {
        System.out.println("Digite o dia: ");
        int respostaDia = input.nextInt();
        System.out.println("Digite o mês: ");
        int respostaMes = input.nextInt();
        System.out.println("Digite o ano: ");
        int respotaAno = input.nextInt();

        if (respostaDia > 31 || respostaMes > 12) {
            return;
        }
        System.out.println("Data inserida pelo usuário: "+respostaDia+"/"+respostaMes+"/"+respotaAno);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
