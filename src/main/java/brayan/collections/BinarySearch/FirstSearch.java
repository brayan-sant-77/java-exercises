package brayan.collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstSearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        Collections.sort(numbers);

        System.out.println("Searching: " + numbers.get(0));
        System.out.println("Index: " + Collections.binarySearch(numbers, 10));

        System.out.println();
        System.out.println("Searching: " + numbers.get(3));
        System.out.println("Index: " + Collections.binarySearch(numbers, 40));

        System.out.println();
        System.out.println("Searching: " + numbers.get(6));
        System.out.println("Index: " + Collections.binarySearch(numbers, 70));
    }
}
