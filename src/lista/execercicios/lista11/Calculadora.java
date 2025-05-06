package lista.execercicios.lista11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrcao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("impossível realizar divisão por zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        Boolean continuar = true;

        while (continuar) {
            System.out.println("-------------- CALCULADORA --------------");
            System.out.print("Digite o primeiro número: ");
            double num1 = userIn.nextDouble();
            System.out.print("Digite o segundo número:");
            double num2 = userIn.nextDouble();
            System.out.println("O que deseja fazer? + - x /");
            String userChoose = userIn.next();
            double resultado = 0;
            switch (userChoose) {
                case "+":
                    resultado = adicao(num1, num2);
                    break;
                case "-":
                    resultado = subtrcao(num1, num2);
                    break;
                case "x":
                    resultado = multiplicacao(num1, num2);
                    break;
                case "/":
                    resultado = divisao(num1, num2);
                    break;
            }
            System.out.println(num1 + " " +userChoose + " " + num2 + " = " + resultado);
            System.out.println("Deseja realizar uma nova operação? (S/N)");
            String continuarOrsair = userIn.next();
            if (continuarOrsair.equalsIgnoreCase("n")){
                System.out.println("Saindo da calculadora...");
                continuar = false;
            }
        }

    }
}

