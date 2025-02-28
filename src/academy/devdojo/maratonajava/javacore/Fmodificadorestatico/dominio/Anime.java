package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[123];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this();
        this.nome = nome;
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    public Anime() {
        for (int episodio : getEpisodios()) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
