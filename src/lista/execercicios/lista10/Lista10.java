package lista.execercicios.lista10;

import java.util.Scanner;

public class Lista10 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int userNumIn1 = userIn.nextInt();
        System.out.println("Type the second number: ");
        int userNumIn2 = userIn.nextInt();
        System.out.println("Type the third number: ");
        int userNumIn3 = userIn.nextInt();

        int sumNum = userNumIn1 + userNumIn2;

        System.out.println(sumNumAct(sumNum, userNumIn3));
    }

    public static boolean sumNumAct(int sumNum, int userNumIn3) {
        if (sumNum == userNumIn3) {
            return true;
        } else {
            return false;
        }
    }
}
