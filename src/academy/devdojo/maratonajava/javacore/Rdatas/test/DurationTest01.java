package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.now(), LocalTime.now().plusHours(10));
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowPlus2Years = LocalDateTime.now().plusYears(5);
        System.out.println(Duration.between(now, nowPlus2Years));
        System.out.println(d1);
    }
}
