package lista.execercicios.lista01.domain;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidadeComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }


    public double getTotalFatura() {

        if (quantidadeComprada < 0) {
            return 0;
        }
        if (precoPorItem < 0) {
            return 0.0;
        }

        return quantidadeComprada * precoPorItem;
    }

    public void imprimeDadosFatura() {
        System.out.println("Código do item: " + getNumero());
        System.out.println("Descrição do item: " + getDescricao());
        System.out.println("Quantidade comprada: " + getQuantidadeComprada());
        if (quantidadeComprada > 0){
            System.out.println("Valor unitário: " + getPrecoPorItem());
            System.out.println("Valor total a pagar: " + getTotalFatura());
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

}
