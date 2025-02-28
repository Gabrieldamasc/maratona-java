package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[123];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this();
        this.nome = nome;
    }

    public Anime(){
        for (int episodio:getEpisodios()){
            System.out.print(episodio+" ");
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
