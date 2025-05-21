package lista.execercicios.LutaLoko.domain;

import java.util.Random;

public class Fighter {
    private String name;
    private Integer force;
    private Integer guard;

    Random random = new Random();

    public Fighter(String name) {
        this.name = name;
        this.generateStatsForce();
        this.generateStatsGuard();
    }

    public void generateStatsForce(){
        this.force = random.nextInt(11);
    }

    public void generateStatsGuard(){
        this.guard = random.nextInt(11);
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", force=" + force +
                ", guard=" + guard +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getForce() {
        return force;
    }

    public Integer getGuard() {
        return guard;
    }
}
