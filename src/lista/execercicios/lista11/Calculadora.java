package lista.execercicios.lista11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("-------------- CALCULADORA --------------");
        Scanner userIn = new Scanner(System.in);
        Double soma = 0D;
        Double subtracao = 0D;
        Double multiplicacao = 0D;
        Double divisao = 0D;
        List<Double> numList = new ArrayList<>();


        String userChooseOption = userIn.next();

        do{
            System.out.print("Número: ");
            Double numUserIn = userIn.nextDouble();
            numList.add(numUserIn);
            System.out.println("Digite a operação: ( + , - , x , / )");
            String userChooseOperation = userIn.next();
            switch (userChooseOperation) {
                case "+":
                    soma += numUserIn;
                    numList.add(soma);
                case "-":
                    subtracao -= numUserIn;
                    numList.add(subtracao);
                case "/":
                    divisao /= numUserIn;
                    numList.add(divisao);
                case "x":
                    multiplicacao *= numUserIn;
                    numList.add(multiplicacao);
            }
            System.out.println("c ---> para continuar");
            System.out.println("f ---> para finalizar conta");
            System.out.println("s ---> para sair");
        }while (!userChooseOption.equals("s"));

        for (Double mostrarResultado : numList) {
            System.out.println(mostrarResultado);
        }

    }
}

