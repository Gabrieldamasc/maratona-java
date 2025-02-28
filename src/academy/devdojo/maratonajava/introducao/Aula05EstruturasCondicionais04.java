package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double impostoMenor = 9.70 / 100;
        double impostoMedio = 37.35 / 100;
        double impostoAlto = 49.50 / 100;
        double impostoResultado;
        double impostoResultadoEmPorcentagem;


        if (salarioAnual < 34712) {
            impostoResultado = salarioAnual * impostoMenor;
            impostoResultadoEmPorcentagem = impostoMenor * 100;
        } else if (salarioAnual >= 34712 && salarioAnual < 68507) {
            impostoResultado = salarioAnual * impostoMedio;
            impostoResultadoEmPorcentagem = impostoMedio * 100;
        } else {
            impostoResultado = salarioAnual * impostoAlto;
            impostoResultadoEmPorcentagem = impostoAlto * 100;
        }

        double somaSalarioImposto = impostoResultado + salarioAnual;

        System.out.println("Você terá que pagar: " + impostoResultadoEmPorcentagem + "% de imposto sobre seu salário anaual! o total será de: " + impostoResultado + " E a soma é: " + somaSalarioImposto);
    }
}
