package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int num = 50;
        for (int i = 0; i < num; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
