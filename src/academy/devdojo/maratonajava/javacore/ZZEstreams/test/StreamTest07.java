package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(integerList.stream().reduce(0, Integer::sum));

        System.out.println(integerList.stream().reduce(1, (x, y) -> x * y));

        System.out.println(integerList.stream().reduce(0, Integer::max));
    }
}
