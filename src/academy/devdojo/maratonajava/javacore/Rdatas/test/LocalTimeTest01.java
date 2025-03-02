package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime time = LocalTime.of(20,42,55);
        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getMinute());
        System.out.println(time.plusHours(3));
    }
}
