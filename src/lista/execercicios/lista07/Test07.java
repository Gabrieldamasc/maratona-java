package lista.execercicios.lista07;


import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type a number greater than 10: ");
        int numUser = userInput.nextInt();

        System.out.println("The result is: " + sumNums(numUser));

    }

    public static int sumNums(int numUser) {
        int sum = 0;

        while (numUser != 0) {
            sum += numUser % 10;
            numUser /= 10;
        }
        return sum;
    }
}
