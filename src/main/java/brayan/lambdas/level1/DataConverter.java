package brayan.lambdas.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DataConverter {
    public static void main(String[] args) {
        List<String> strings = List.of("Ichigo", "Yamamoto", "Kyoraku");
        List<Integer> numbers = List.of(2,4,6,8);
        List<Integer> integers = map(strings, s -> s.length());
        List<Integer> doubledNumbers = map(numbers, n -> n * 2);
        System.out.println(integers);
        System.out.println("----");
        System.out.println(doubledNumbers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
//            result.add(function.apply(e)); - é possível realizar dessa forma também
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
