package lista.execercicios.lista08;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DurationBetween {
    public static void main(String[] args) {
        calcDuration();
    }

    public static void calcDuration(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um número para ver a quantidade de horas no intervalo entre esses dois anos: ");
        long numUserIn = userInput.nextInt();
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime timePlusNumUser = LocalDateTime.now().plusYears(numUserIn);
        Duration durationBetweenYears = Duration.between(timeNow,timePlusNumUser);
        System.out.println("O resultado é: "+durationBetweenYears);
    }
}
