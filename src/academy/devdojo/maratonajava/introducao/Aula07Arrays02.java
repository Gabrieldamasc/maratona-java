package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Vegeta";
        nomes[1] = "Goku";
        nomes[2] = "Ippo";
        nomes[3] = "Takamura";
        nomes[4] = "Kamogawa";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Seu nome é: " + nomes[i] + " na posição: " + i);
        }
    }
}
