package academy.devdojo.maratonajava.javacore.Xcolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private String nome;
    private Long id;
    private double preco;



    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Manga(String nome, Long id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga o) {
        return this.id.compareTo(o.getId());
    }
}
