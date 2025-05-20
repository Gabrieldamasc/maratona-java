package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumParallelStream(num);
        sumFor(num);
    }

    private static void sumFor(Long numm) {
        long init = System.currentTimeMillis();
        long result = 0;
        for (long i = 1; i <= numm; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(end - init + " ms");
    }

    private static void sumParallelStream(Long num) {
        Long init = System.currentTimeMillis();
        long reduce = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        Long end = System.currentTimeMillis();
        System.out.println(reduce);
        System.out.println(end - init + " ms");

    }
}
