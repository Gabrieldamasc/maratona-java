package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 0)
                System.out.println("Números pares: " + i);
        }
    }
}
