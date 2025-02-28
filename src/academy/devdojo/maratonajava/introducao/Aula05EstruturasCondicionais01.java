package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean isIdadePermitidaBeberAlcool = idade >= 18;

        if (isIdadePermitidaBeberAlcool){
            System.out.println("É permitido beber alcool");
        }

        if(!isIdadePermitidaBeberAlcool){
            System.out.println("É proibido beber alcool");
        }


    }
}
