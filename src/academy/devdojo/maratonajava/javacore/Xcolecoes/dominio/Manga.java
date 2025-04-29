package academy.devdojo.maratonajava.javacore.Xcolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private String nome;
    private Long id;
    private double preco;
    private int quantidade;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(nome, manga.nome) && Objects.equals(id, manga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    public Manga(String nome, Long id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public Manga(String nome, Long id, double preco, int quantidade) {
        this(nome, id, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
    public int compareTo(Manga outroManga) {
        return this.id.compareTo(outroManga.getId());
    }
}
