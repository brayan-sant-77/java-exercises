package brayan.parametrizacaoDeComportamentos.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterNumber {

    private static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> numbers = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, number -> number % 2 == 1));
    }
}
