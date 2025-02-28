package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 200;
        String possivelDoar = "Vou doar 500 para você!";
        String naoPossivelDoarAgora = "Não posso doar para você neste momento!";
        String naoPossivelDoar = "Não posso doar para você";
        String resultadoDoacao;

        if(salario >= 5000){
            resultadoDoacao = possivelDoar;
        } else if(salario > 2000 && salario < 5000){
            resultadoDoacao = naoPossivelDoarAgora;
        } else{
            resultadoDoacao = naoPossivelDoar;
        }

        System.out.println(resultadoDoacao);
    }
}
