package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String tipo;

    public Anime(String nome, String genero, int episodios) {
        this();
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        System.out.println("Segundo construtor");
    }

    public Anime(String nome, String genero, int episodios, String tipo) {
        this(nome, genero, episodios);
        this.tipo = tipo;
        System.out.println("último construtor");
    }

    public Anime() {
        System.out.println("primeiro do construtor");
    }

    public void imprimeAnime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
    }


}
