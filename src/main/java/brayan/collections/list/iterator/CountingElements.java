package brayan.collections.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountingElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> iterator = numbers.iterator();
        int count = 0;
        while (iterator.hasNext()) {

            iterator.next();
            count++;
            System.out.println("Elemento: " + count);

        }
    }
}
