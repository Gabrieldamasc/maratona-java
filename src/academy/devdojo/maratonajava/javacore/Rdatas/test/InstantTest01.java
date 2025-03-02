package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args){
        Instant now = Instant.now();
        Instant instant = Instant.ofEpochSecond(69_000_570);
        System.out.println(now);
        System.out.println(instant);
    }
}
