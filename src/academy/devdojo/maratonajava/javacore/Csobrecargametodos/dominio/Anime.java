package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String tipo;

    public void imprimeAnime() {
        System.out.println("Nome do anime: "+this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
    }

    public void init(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    public void init(String nome, String genero, int episodios, String tipo) {
        this.init(nome, genero, episodios);
        this.tipo = tipo;
    }
}
