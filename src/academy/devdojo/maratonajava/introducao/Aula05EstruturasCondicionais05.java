package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        char sexo = 'g';
        switch (sexo){
            case 'M' :
                System.out.println("Homem");
                break;
            case 'F' :
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
