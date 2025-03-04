package lista.execercicios.test11;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int numInput1 = userIn.nextInt();
        System.out.print("Type the second number: ");
        int numInput2 = userIn.nextInt();
        System.out.print("Type the third number: ");
        int numInput3 = userIn.nextInt();
        System.out.println("Is the second number greater than first? "+checkSecondGreaterFirst(numInput1,numInput2));
        System.out.println("Is the third number greater than second? "+checkThirdGreaterSecond(numInput2,numInput3));
    }

    public static boolean checkSecondGreaterFirst(int numInput1, int numInput2) {
        if (numInput2 > numInput1){
            return true;
        }else return false;
    }

    public static boolean checkThirdGreaterSecond ( int numInput2, int numInput3){
        if (numInput3>numInput2) return true;
        else return false;
    }
}
