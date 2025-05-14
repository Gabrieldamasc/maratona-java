package academy.devdojo.maratonajava.javacore.ZZBlambdas.test.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Gabriel", "Juracy", "Adriana", "Daniel"));
        stringList.sort(String::compareTo);
        System.out.println(stringList);
        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer num = stringToInteger.apply("10");
        System.out.println(num);


    }
}
