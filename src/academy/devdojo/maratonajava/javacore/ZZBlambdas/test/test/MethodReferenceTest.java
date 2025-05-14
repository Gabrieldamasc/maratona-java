package academy.devdojo.maratonajava.javacore.ZZBlambdas.test.test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Gabriel", "Daniel", "Adriana", "Juracy"));
        list.replaceAll(String::toLowerCase);
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "adriana"));
        list.replaceAll(String::toUpperCase);
        list.sort(String::compareTo);
        System.out.println(list);

    }
}
