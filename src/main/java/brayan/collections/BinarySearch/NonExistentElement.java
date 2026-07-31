package brayan.collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonExistentElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
//         -(ponto de inserção) - 1

        Collections.sort(numbers);

        int target = 15; // 15 seria inserido no índice 1
        System.out.println("Searching: " + target);
        System.out.println("Result: " + Collections.binarySearch(numbers, target));

        target = 35; // 35 seria inserido no índice 3
        System.out.println();
        System.out.println("Searching: " + target);
        System.out.println("Result: " + Collections.binarySearch(numbers, target));

        target = 65; // 65 seria inserido no índice 6
        System.out.println();
        System.out.println("Searching: " + target);
        System.out.println("Result: " + Collections.binarySearch(numbers, target));

        target = 80; // 80 seria inserido no índice 7
        System.out.println();
        System.out.println("Searching: " + target);
        System.out.println("Result: " + Collections.binarySearch(numbers, target));
    }
}
