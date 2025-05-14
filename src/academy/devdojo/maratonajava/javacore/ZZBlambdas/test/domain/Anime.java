package academy.devdojo.maratonajava.javacore.ZZBlambdas.test.domain;

public class Anime {
    private String tittle;
    private Integer episodes;

    public Anime(String tittle, Integer episodes) {
        this.tittle = tittle;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "tittle='" + tittle + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTittle() {
        return tittle;
    }

    public Integer getEpisodes() {
        return episodes;
    }
}
