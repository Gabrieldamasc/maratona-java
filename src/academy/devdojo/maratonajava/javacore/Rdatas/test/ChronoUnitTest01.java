package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Escreva a data que você nasceu(Ano-Mês-dia: ");
        String userDayBirthday = userIn.nextLine();
        System.out.println("escreva o horário que você nasceu(Horas-Minutos-Segundos): ");
        String userTimeBirthday = userIn.nextLine();
        LocalDate date = LocalDate.parse(userDayBirthday);
        LocalTime time = LocalTime.parse(userTimeBirthday);
        String formatedDate = date+"T"+time;
        LocalDateTime aniversario = LocalDateTime.parse(formatedDate);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Seu aniversário foi a: "+ChronoUnit.WEEKS.between(aniversario,now)+" semanas atrás.");
        System.out.println("Seu aniversário foi a: "+ChronoUnit.DAYS.between(aniversario,now)+" dias atrás.");
        System.out.println("Seu aniversário foi a: "+ChronoUnit.MONTHS.between(aniversario,now)+" meses atrás.");
    }
}
