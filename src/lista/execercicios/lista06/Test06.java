package lista.execercicios.lista06;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Type the first number: ");
        Integer inputNumber1 = inputUser.nextInt();
        System.out.println("Type the second number: ");
        Integer inputNumber2 = inputUser.nextInt();
        // verify equality of numbers
        if (inputNumber1.compareTo(inputNumber2) == 0) {
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers aren't equal");
        }
        // verify if a number is greater than another one
        if (inputNumber1.compareTo(inputNumber2)< 0){
            System.out.println("The number "+inputNumber1+ " is smaller than "+inputNumber2);
        }else {
            System.out.println("The number "+inputNumber1+" is greater than "+inputNumber2);
        }
    }
}
