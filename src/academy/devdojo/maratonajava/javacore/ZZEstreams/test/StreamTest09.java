package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        try (Stream<String> file = Files.lines(Path.of("texto.txt"))) {
            file.filter(s -> s.toLowerCase().contains("java")).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] intArry = {1, 2, 3, 4, 5};
        Arrays.stream(intArry)
                .average()
                .ifPresent(System.out::println);

        int summed = Arrays.stream(intArry)
                .sum();
        System.out.println(summed);

        IntStream.rangeClosed(0, 50).filter(s -> s % 2 == 0).forEach(n -> System.out.print(n + " "));
    }
}
