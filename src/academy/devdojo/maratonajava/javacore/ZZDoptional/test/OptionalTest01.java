package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = findName("dabriel");
        String empty = o1.orElse("EMPTY");
        System.out.println(empty);
        o1.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Gabriel", "Daniel", "Juracy");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
