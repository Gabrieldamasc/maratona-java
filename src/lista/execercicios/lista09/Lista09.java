package lista.execercicios.lista09;

import java.util.Scanner;

public class Lista09 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Type anything to discover its details: ");
        String userInput = userIn.nextLine();

        char[] charArray = userInput.toCharArray();

        int isLetter = 0;
        int isSpace = 0;
        int isNumber = 0;
        int isOther = 0;

        for (char c : charArray) {
            if (Character.isLetter(c)) {
                isLetter++;
            } else if (Character.isDigit(c)) {
                isNumber++;
            } else if (Character.isSpaceChar(c)) {
                isSpace++;
            } else {
                isOther++;
            }
        }

        System.out.println("Letter: "+isLetter);
        System.out.println("Space: "+isSpace);
        System.out.println("Number: "+isNumber);
        System.out.println("Other: "+isOther);

    }
}
