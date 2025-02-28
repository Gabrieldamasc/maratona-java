package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte diaDaSemana = 6;
        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo, final de semana!");
                break;
            case 2:
                System.out.println("Segunda-feira, Dia útil!");
                break;
            case 3:
                System.out.println("Terça-feira, Dia útil!");
                break;
            case 4:
                System.out.println("Quarta-feira, Dia útil!");
                break;
            case 5:
                System.out.println("Quinta-feira, Dia útil!");
                break;
            case 6:
                System.out.println("Sexta-feira Dia últil!");
                break;
            case 7:
                System.out.println("Sábado, Final de semana!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
